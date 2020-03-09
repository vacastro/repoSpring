package com.practica1.demobp.controller;

import java.util.List;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.practica1.demobp.model.Usuario;
import com.practica1.demobp.repository.UsuarioJpaRepository;

@Controller


public class UsuarioController {
	@Autowired
	private UsuarioJpaRepository usuarioJpaRepository;


	@GetMapping("usuario")
		public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = usuarioJpaRepository.findAll();
		return usuarios;
	}

	@GetMapping("/registro")
	public String getFormularioRegistro(Usuario usuario) {
		return "registro";
	}

	//@PostMapping("/registro")
	//public String insertUsuario(Usuario usuarioARegistrar) {
		//usuarioJpaRepository.save(usuarioARegistrar);
		//return "index";
	//}
	
	@PostMapping("/registro")
	public String insertUsuario(@Valid Usuario usuario, BindingResult result) {
	    if (result.hasErrors()) {			
	        return "registro";
	    }
	    
		usuarioJpaRepository.save(usuario);
		return "index";
    }

	
	

	@DeleteMapping("/delete/{id}")
	public void deleteUsuario(@PathVariable Integer id) {
		usuarioJpaRepository.deleteById(id);
	}
	
	

}
