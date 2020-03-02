package com.practica1.demobp.controller;

import com.practica1.demobp.model.Producto;
import com.practica1.demobp.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cart")

public class CarritoController {

    @GetMapping("")
    public String GetCarrito(){
        return "carrito";
    }
    @GetMapping("add")
    public String getAddProduct(){
        return null;
    }

    @PostMapping("add")
    public String addProduct(){
        return null;
    }

}
