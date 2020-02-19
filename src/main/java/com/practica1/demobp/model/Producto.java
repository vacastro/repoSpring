package com.practica1.demobp.model;

import com.practica1.demobp.model.Categoria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity

public class Producto {

	@Id
	@GeneratedValue
	private Integer id;
	

	@ManyToOne
	private Categoria categoria;
	
	@Column(nullable = false)
	private Double precio;
	
	@Column(nullable = false)
	private String descripcion;
	@Column
	private String caracteristicaId;
	@Column(nullable = false)
	private Boolean stockActivo;

	public Producto() {

	}

	public Producto(Integer id, Categoria categoria, Double precio, String descripcion, String caracteristicaId,
			Boolean stockActivo) {
		this.id = id;
		this.categoria = categoria;
		this.precio = precio;
		this.descripcion = descripcion;
		this.caracteristicaId = caracteristicaId;
		this.stockActivo = stockActivo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getCaracteristicaId() {
		return caracteristicaId;
	}

	public void setCaracteristicaId(String caracteristicaId) {
		this.caracteristicaId = caracteristicaId;
	}

	public Boolean getStockActivo() {
		return stockActivo;
	}

	public void setStockActivo(Boolean stockActivo) {
		this.stockActivo = stockActivo;
	}

}
