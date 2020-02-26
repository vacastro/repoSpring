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
		
		
		private String nombre;
		//private Integer telefono;
		//private String provincia;
		//private Date fechaDeNacimiento;
		//private Boolean sexo;
		private String contrasenia;
		//private Boolean activo;
		
		
		public Usuario() {
			
		}

		

		public Usuario(Integer id, String email, String nombre, String contrasenia) {
			super();
			this.id = id;
			this.email = email;
			this.nombre = nombre;
			this.contrasenia = contrasenia;
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
	}
		