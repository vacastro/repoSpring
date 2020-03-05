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
	
	//@GetMapping("")
	//public String getIndex() {
	//	return "index";
	//}

    @GetMapping("index")
    public String getIndexOther() {
        return "index";
    }

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

    @GetMapping("productos/macetas")
    public String getMacetas(){
	    return "macetas";
    }
    @GetMapping("macetas")
    public String getIndexMacetas(){
	    return "macetas";
    }
    @GetMapping("productos/coffetime")
    public String getCoffetime(){
        return "coffetime";
    }
    @GetMapping("coffetime")
    public String getIndexCoffetime(){
        return "coffetime";
    }
    @GetMapping("productos/cuadros")
    public String getCuadros(){
        return "cuadros";
    }
    @GetMapping("cuadros")
    public String getIndexCuadros(){
        return "cuadros";
    }
    @GetMapping("productos/espejos")
    public String getEspejos(){
        return "espejos";
    }
    @GetMapping("espejos")
    public String getIndexEspejos(){
        return "espejos";
    }
    @GetMapping("productos/almohadones")
    public String getAlmohadones(){
        return "almohadones";
    }
    @GetMapping("almohadones")
    public String getIndexAlmohadones(){
        return "almohadones";
    }
    
}
