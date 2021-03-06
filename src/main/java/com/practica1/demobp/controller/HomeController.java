package com.practica1.demobp.controller;

import com.practica1.demobp.model.Producto;
import com.practica1.demobp.repository.ProductoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class HomeController {

    @Autowired
    private ProductoJpaRepository productoJpaRepository;

	
	@GetMapping("index")
	public String getHome(Model model) {
        List<Producto> listaProductos = this.productoJpaRepository.findAll();
        model.addAttribute("productos", listaProductos);
		return "index";
	}
	@GetMapping("")
    public String getPrincipal(Model model){
        List<Producto> listaProductos = this.productoJpaRepository.findAll();
        model.addAttribute("productos", listaProductos);
	    return "index";
    }

    @GetMapping("add")
    public String getIndexOther(Model model) {
        List<Producto> listaProductos = this.productoJpaRepository.findAll();
        model.addAttribute("productos", listaProductos);
        return "index";
    }

    
	@GetMapping("faq")
    public String getFaq(){
        return "faq";
    }
    
	@GetMapping("nosotros")
    public String getNosotros(){
        return "nosotros";
    }

    
	@GetMapping("productos")
    public String getProductos(Model model, @RequestParam(name = "categoria",required = false) String categoria){
        List<Producto> listaProductos = null;

        if ( categoria == null || categoria.isEmpty() ){
            listaProductos  = this.productoJpaRepository.findAll();
        }else {
            listaProductos  = this.productoJpaRepository.findAllByCategoria_nombre(categoria);
        }

	    model.addAttribute("productos", listaProductos);
        return "productos";
    }

	@GetMapping("contacto")
    public String getContacto(){
    return "contacto";
    }
	
	@GetMapping("pagar")
    public String getPagar(){
    return "pagar";


	}

  
 
 

    
  
  

}
