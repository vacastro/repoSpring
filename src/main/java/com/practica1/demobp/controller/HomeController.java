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
    public String getMacetas(Model model){
        List<Producto> listaProductos = this.productoJpaRepository.findAll(); //modificar por cada categoria, es decir, iterar cada producto en si, segun clasificación en base de datos
        model.addAttribute("productos", listaProductos);
	    return "macetas";
    }

    @GetMapping("macetas")
    public String getIndexMacetas(Model model){
        List<Producto> listaProductos = this.productoJpaRepository.findAll();
        model.addAttribute("productos", listaProductos);
	    return "macetas";
    }

    @GetMapping("productos/coffetime")
    public String getCoffetime(Model model){
        List<Producto> listaProductos = this.productoJpaRepository.findAll();
        model.addAttribute("productos", listaProductos);
        return "coffetime";
    }
    @GetMapping("coffetime")
    public String getIndexCoffetime(Model model){
        List<Producto> listaProductos = this.productoJpaRepository.findAll();
        model.addAttribute("productos", listaProductos);
        return "coffetime";
    }
    @GetMapping("productos/cuadros")
    public String getCuadros(Model model){
        List<Producto> listaProductos = this.productoJpaRepository.findAll();
        model.addAttribute("productos", listaProductos);
        return "cuadros";
    }

    @GetMapping("cuadros")
    public String getIndexCuadros(Model model){
        List<Producto> listaProductos = this.productoJpaRepository.findAll();
        model.addAttribute("productos", listaProductos);
        return "cuadros";
    }

    @GetMapping("productos/espejos")
    public String getEspejos(Model model){
        List<Producto> listaProductos = this.productoJpaRepository.findAll();
        model.addAttribute("productos", listaProductos);
        return "espejos";
    }
    @GetMapping("espejos")
    public String getIndexEspejos(Model model){
        List<Producto> listaProductos = this.productoJpaRepository.findAll();
        model.addAttribute("productos", listaProductos);
        return "espejos";
    }
    @GetMapping("productos/almohadones")
    public String getAlmohadones(Model model){
        List<Producto> listaProductos = this.productoJpaRepository.findAll();
        model.addAttribute("productos", listaProductos);
        return "almohadones";
    }
    @GetMapping("almohadones")
    public String getIndexAlmohadones(Model model){
        List<Producto> listaProductos = this.productoJpaRepository.findAll();
        model.addAttribute("productos", listaProductos);
        return "almohadones";
    }

}
