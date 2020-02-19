package com.practica1.demobp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


	@Entity

	public class Usuario {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)//tuve un tema con el auto-incremental. En el postman debía colocar el id manualmente, no se generaba solo. Cuando colocaba "strategy = IDENTITY o AUTO, me tiraba error :(
		private Integer id;
		
		@Column(nullable = false,unique = true)
		private Integer dni;
		
		@Column(nullable = false)
		private String nombre;
		
		private String apellido;
		@Column(nullable = false)
		private Boolean activo;
		//Hay que agregar atributos como email, fecha de nacimiento, nacionalidad, sexo, user name, password?(Base de Datos)
		public Usuario() {
			
		}

		public Usuario(Integer id, Integer dni, String nombre, String apellido, Boolean activo) {
			this.id = id;
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.activo = activo;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getDni() {
			return dni;
		}

		public void setDni(Integer dni) {
			this.dni = dni;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public Boolean getActivo() {
			return activo;
		}

		public void setActivo(Boolean activo) {
			this.activo = activo;
		}
		

}
