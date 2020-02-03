package com.practica1.demobp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	
	@RequestMapping("")
	
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping("login")
	
	public String getLogin() {
		return "login";
	}
	

	@RequestMapping("carrito")
    public String getCarrito(){
        return "carrito";
    }
    
	@RequestMapping("faq")
    public String getFaq(){
        return "faq";
    }
    
	@RequestMapping("nosotros")
    public String getNosotros(){
        return "nosotros";
    }
    
	@RequestMapping("registro")
    public String getRegistro(){
    return "registro";
    }
    
	@RequestMapping("productos")
    public String getProductos(){
    return "productos";
    }



}
