package com.practica1.demobp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity

public class Producto {

	@Id
	@GeneratedValue
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
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

	public Producto() {

	}

	

	public Producto(Integer id, Categoria categoria, String nombre, Double precio, String descripcion,
			Boolean stockActivo, String urlImage) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.stockActivo = stockActivo;
		this.urlImage = urlImage;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
