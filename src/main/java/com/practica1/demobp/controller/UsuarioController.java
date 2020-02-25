package com.practica1.demobp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

	@GetMapping("/get/{id}")
	public Usuario getUsuarioById(@PathVariable Integer id) {
		Optional<Usuario> unOptionalUsuario = usuarioJpaRepository.findById(id);
		return unOptionalUsuario.get();
	}
	
	@GetMapping("/registro")
	public String getFormularioRegistro() {
		return "registro";
	}

	@PostMapping("/registro")
	public Usuario insertUsuario(@RequestBody Usuario usuarioARegistrar) {
		Usuario unUsuarioRegistrado = usuarioJpaRepository.save(usuarioARegistrar);
		return unUsuarioRegistrado;
	}

	@DeleteMapping("/delete/{id}")
	public void deleteUsuario(@PathVariable Integer id) {
		usuarioJpaRepository.deleteById(id);
	}
	
	

}
