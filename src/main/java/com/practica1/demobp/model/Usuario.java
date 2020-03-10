package com.practica1.demobp.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//import javax.validation.constraints.Pattern;


@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(nullable = false, unique = true)
    @NotBlank(message = "el Email no puede tener espacios")
    @Email(message = "el formato es incorrecto")
    //@Pattern (regexp="\\w+@\\w+\\.+[a-z]")
    private String email;

    @NotEmpty(message = "el Nombre no puede estar vacio")
    @Size(min = 3, max = 40, message = "el Nombre tiene que tener mas de 3 caracteres y menos de 40")
    @NotBlank(message = "el Nombre no puede ser espacios")
    private String nombre;
    //private Integer telefono;
    //private String provincia;
    //private Date fechaDeNacimiento;
    //private Boolean sexo;


    @Size(min = 8, max = 30, message = "la contraseña tiene que tener mas de 3 caracteres y menos de 40")
    @NotBlank(message = "la contraseña no puede ser espacios")
    @NotEmpty(message = "la contraseña no puede estar vacio")
    private String contrasenia;


    @JoinTable(
            name = "carrito",
            joinColumns = @JoinColumn(name = "usuario_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "producto_id", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Producto> carrito;
    //private Boolean activo;

    //como validar el confirmar contrasenia con spring
    public Usuario() {

    }


    public Usuario(Integer id,
                   @NotBlank(message = "el Email no puede tener espacios") @Email(message = "el formato es incorrecto") String email,
                   @NotEmpty(message = "el Nombre no puede estar vacio") @Size(min = 3, max = 40, message = "el Nombre tiene que tener mas de 3 caracteres y menos de 40") @NotBlank(message = "el Nombre no puede ser espacios") String nombre,
                   @Size(min = 8, max = 30, message = "el Nombre tiene que tener mas de 3 caracteres y menos de 40") @NotBlank(message = "el Nombre no puede ser espacios") @NotEmpty(message = "el Nombre no puede estar vacio") String contrasenia) {
        super();
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.carrito = new ArrayList<Producto>();
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    public List<Producto> getCarrito() {
        return carrito;
    }


    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }


    public void agregarAlCarrito(Producto unProducto) {

        if (this.carrito == null) {
            this.carrito = new ArrayList<>();

        }

        this.carrito.add(unProducto);

    }

    public void eliminarProdCarrito(Integer id) {
        Producto prod = null;
        for (Producto unProducto : this.carrito) {
            if (unProducto.getId().equals(id)) {
                prod = unProducto;
                break;
            }
        }
        this.carrito.remove(prod);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id.equals(usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
		