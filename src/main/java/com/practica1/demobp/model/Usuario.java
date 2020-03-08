package com.practica1.demobp.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

//import javax.validation.constraints.Pattern;


	@Entity
	@Table(name = "clientes_ecommerce")
	public class Usuario {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)//tuve un tema con el auto-incremental. En el postman debía colocar el id manualmente, no se generaba solo. Cuando colocaba "strategy = IDENTITY o AUTO, me tiraba error :(
		private Integer id;
		
		
		



		@Column(nullable = false,unique = true)
		@NotBlank (message="el Email no puede tener espacios")
		@Email(message="el formato es incorrecto")
		//@Pattern (regexp="\\w+@\\w+\\.+[a-z]")
		private String email;
		
		@NotEmpty(message="el Nombre no puede estar vacio")
		@Size (min=3, max=40, message="el Nombre tiene que tener mas de 3 caracteres y menos de 40")
		@NotBlank (message="el Nombre no puede ser espacios")
		private String nombre;
		//private Integer telefono;
		//private String provincia;
		//private Date fechaDeNacimiento;
		//private Boolean sexo;
		
		
		
		@Size(min=8,max=30, message="la contraseña tiene que tener mas de 3 caracteres y menos de 40")
		@NotBlank (message="la contraseña no puede ser espacios")
		@NotEmpty (message="la contraseña no puede estar vacio")
		private String contrasenia;
		
	

		@JoinTable(
				name= "carrito",
				joinColumns = @JoinColumn
		)
		@ManyToMany( cascade = CascadeType.ALL)
		private List<Producto> productos;
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
			this.productos= new ArrayList<>();
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

		public void setProductos(List<Producto> productos) {
			this.productos = productos;
		}

		public List<Producto> getProductos(){
			return this.productos;
		}


		public void agregarAlCarrito(Producto unProducto){
			this.productos.add(unProducto);
		}

		public void eliminarProdCarrito(Integer id){
			Producto prod = null;
			for(Producto unProducto: this.productos){
				if(unProducto.getId().equals(id)){
					prod= unProducto;
					break;
				}
			} this.productos.remove(prod);
		}




	}
		