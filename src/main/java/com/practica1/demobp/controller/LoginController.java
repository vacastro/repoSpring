package com.practica1.demobp.controller;

import com.practica1.demobp.model.Usuario;
import com.practica1.demobp.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    UsuarioJpaRepository usuarioJpaRepository;

    @GetMapping()
    public String irAlLogin() {

        return "login";
    }

    @PostMapping()
    public String comprobarLogin(Model model, Usuario usuario) {

        String mailIngresado = usuario.getEmail();
        String contraseniaIngresada = usuario.getContrasenia();

        Usuario usuarioEncontrado = usuarioJpaRepository.findByEmail(mailIngresado);

        if(usuarioEncontrado == null) {
            return "login";
        }

        if(usuarioEncontrado.getContrasenia().equals(contraseniaIngresada)) {
            model.addAttribute("email", usuarioEncontrado.getEmail());
            return "index";
        } else {
            return "login";
        }

    }
}
