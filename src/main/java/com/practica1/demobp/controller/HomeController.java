package com.practica1.demobp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
	
	@GetMapping("")
	
	public String getIndex() {
		return "index";
	}
	
	//@GetMapping("login")
	
	//public String getLogin() {
	//return "login";
	//}
	

	@GetMapping("carrito")
    public String getCarrito(){
        return "carrito";
    }
    
	@GetMapping("faq")
    public String getFaq(){
        return "faq";
    }
    
	@GetMapping("nosotros")
    public String getNosotros(){
        return "nosotros";
    }
    
	//@GetMapping("registro")
    //public String getRegistro(){
    //return "registro";
    //}
    
	@GetMapping("productos")
    public String getProductos(){
    return "productos";
    }

	@GetMapping("contacto")
    public String getContacto(){
    return "contacto";
    }


}
