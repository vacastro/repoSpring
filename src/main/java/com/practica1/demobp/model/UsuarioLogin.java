package com.practica1.demobp.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

//import javax.validation.constraints.Pattern;


	
	public class UsuarioLogin {
		
		



		@Column(nullable = false,unique = true)
		@NotBlank (message="el Email no puede tener espacios")
		@Email(message="el formato es incorrecto")
		//@Pattern (regexp="\\w+@\\w+\\.+[a-z]")
		private String email;
		
		
		
		
		@Size(min=8,max=30, message="la contraseña tiene que tener mas de 3 caracteres y menos de 40")
		@NotBlank (message="la contraseña no puede ser espacios")
		@NotEmpty (message="la contraseña no puede estar vacio")
		private String contrasenia;
		//private Boolean activo;
		

		



		public UsuarioLogin( 
				@NotBlank(message = "el Email no puede tener espacios") @Email(message = "el formato es incorrecto") String email,
				@Size(min = 8, max = 30, message = "la contraseña tiene que tener mas de 3 caracteres y menos de 40") @NotBlank(message = "la contraseña no puede ser espacios") @NotEmpty(message = "la contraseña no puede estar vacio") String contrasenia) {
			
			
			this.email = email;
			this.contrasenia = contrasenia;
		}

		public UsuarioLogin() {
			
		}







		public String getEmail() {
			return email;
		}




		public void setEmail(String email) {
			this.email = email;
		}




		public String getContrasenia() {
			return contrasenia;
		}




		public void setContrasenia(String contrasenia) {
			this.contrasenia = contrasenia;
		}

	}
		