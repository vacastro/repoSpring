package com.practica1.demobp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class carritoController {

    @GetMapping("carrito")
    public String getCarrito(){
        return "carrito";
    }

}
