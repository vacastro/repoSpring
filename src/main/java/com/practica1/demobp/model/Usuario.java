package com.practica1.demobp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "clientes_ecommerce")
	public class Usuario {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)//tuve un tema con el auto-incremental. En el postman debía colocar el id manualmente, no se generaba solo. Cuando colocaba "strategy = IDENTITY o AUTO, me tiraba error :(
		private Integer id;
		
		@Column(nullable = false,unique = true)
		private String email;
		
		@Column(nullable = false)
		private String nombre;
		
		@Column(nullable = false)
		private Integer telefono;
		
		@Column(nullable = false)
		private String provincia;
		
		@Column(nullable = false)
		private Date fechaDeNacimiento;
		
		@Column(nullable = false)
		private Boolean sexo;
		
		@Column(nullable = false)
		private String contrasenia;
		
		
		@Column(nullable = false)
		private Boolean activo;
		
		
		public Usuario() {
			
		}
		public Usuario(Integer id, String email, String nombre, Integer telefono, String provincia,
				Date fechaDeNacimiento, Boolean sexo, String contrasenia, Boolean activo) {
			super();
			this.id = id;
			this.email = email;
			this.nombre = nombre;
			this.telefono = telefono;
			this.provincia = provincia;
			this.fechaDeNacimiento = fechaDeNacimiento;
			this.sexo = sexo;
			this.contrasenia = contrasenia;
			this.activo = activo;
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
		public Integer getTelefono() {
			return telefono;
		}
		public void setTelefono(Integer telefono) {
			this.telefono = telefono;
		}
		public String getProvincia() {
			return provincia;
		}
		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}
		public Date getFechaDeNacimiento() {
			return fechaDeNacimiento;
		}
		public void setFechaDeNacimiento(Date fechaDeNacimiento) {
			this.fechaDeNacimiento = fechaDeNacimiento;
		}
		public Boolean getSexo() {
			return sexo;
		}
		public void setSexo(Boolean sexo) {
			this.sexo = sexo;
		}
		public String getContrasenia() {
			return contrasenia;
		}
		public void setContrasenia(String contrasenia) {
			this.contrasenia = contrasenia;
		}
		public Boolean getActivo() {
			return activo;
		}
		public void setActivo(Boolean activo) {
			this.activo = activo;
		}
		
		

		
}
