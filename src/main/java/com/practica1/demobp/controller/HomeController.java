package com.practica1.demobp.controller;

import com.practica1.demobp.model.Producto;
import com.practica1.demobp.repository.ProductoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class HomeController {

    @Autowired
    private ProductoJpaRepository productoJpaRepository;
	
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
    public String getProductos(Model model){
	    List<Producto> listaProductos = this.productoJpaRepository.findAll();
	    model.addAttribute("productos", listaProductos);
        return "productos";
    }

	@GetMapping("contacto")
    public String getContacto(){
    return "contacto";
    }

    @GetMapping("macetas")
    public String getMacetas(){
	    return "macetas";
    }


}
