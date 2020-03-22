package com.practica1.demobp.controller;

import com.practica1.demobp.model.Producto;
import com.practica1.demobp.model.Usuario;
import com.practica1.demobp.model.UsuarioLogin;
import com.practica1.demobp.repository.UsuarioJpaRepository;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("login")
public class LoginController {

	@Autowired
	UsuarioJpaRepository usuarioJpaRepository;

	@GetMapping()
	public String irAlLogin(UsuarioLogin usuarioLogin) {
			
		return "login";
	}

	@PostMapping()
	public String comprobarLogin(Model model, @Valid UsuarioLogin usuarioLogin, BindingResult result) {
		if (result.hasErrors()) {
			
			return "login";
		}

		String mailIngresado = usuarioLogin.getEmail();
		String contraseniaIngresada = usuarioLogin.getContrasenia();

		Usuario usuarioEncontrado = usuarioJpaRepository.findByEmail(mailIngresado);

		if (usuarioEncontrado == null) {
			
			
			model.addAttribute("mensaje", "Email y/o contraseña incorrecta.");
			
		return "login";
	}

		if (usuarioEncontrado.getContrasenia().equals(contraseniaIngresada)) {
			model.addAttribute("email", usuarioEncontrado.getEmail());
			return "pagar";
		} else {
			return "login";
		}

	}
}
