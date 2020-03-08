package com.practica1.demobp.model;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity

public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private Double precio;
	
	@Column(nullable = false)
	private String descripcion;
	//@Column
	//private String caracteristicaId;
	@Column(nullable = false)
	private Boolean stockActivo;
	
	@Column(nullable = false)
	private String urlImage;

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria_id;

	@ManyToMany (mappedBy = "carrito")
	private List<Usuario> usuarios;


	public Producto() {

	}

	




	public Producto(Integer id, String nombre, Double precio, String descripcion, Boolean stockActivo, String urlImage,
			Categoria categoria_id, List<Usuario> usuarios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.stockActivo = stockActivo;
		this.urlImage = urlImage;
		this.categoria_id = categoria_id;
		this.usuarios = new ArrayList<>();
	}






	public Categoria getCategoria_id() {
		return categoria_id;
	}






	public void setCategoria_id(Categoria categoria_id) {
		this.categoria_id = categoria_id;
	}






	public List<Usuario> getUsuarios() {
		return usuarios;
	}




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/*public String getCaracteristicaId() {
		return caracteristicaId;
	}

	public void setCaracteristicaId(String caracteristicaId) {
		this.caracteristicaId = caracteristicaId;
	}*/

	public Boolean getStockActivo() {
		return stockActivo;
	}

	public void setStockActivo(Boolean stockActivo) {
		this.stockActivo = stockActivo;
	}




	public String getUrlImage() {
		return urlImage;
	}



	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	
	

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Producto producto = (Producto) o;
		return id.equals(producto.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


}
