package com.practica1.demobp.controller;

import com.practica1.demobp.model.Producto;
import com.practica1.demobp.model.Usuario;
import com.practica1.demobp.repository.ProductoJpaRepository;
import com.practica1.demobp.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("cart")

public class CarritoController {

    @Autowired
    UsuarioJpaRepository usuarioJpaRepository;
    @Autowired
    ProductoJpaRepository productoJpaRepository ;

    @GetMapping("")
    public String GetCarrito(){
        return "carrito";
    }
    @GetMapping("agregarAlCarrito")
    public String getAddProduct(){
        return "productos";
    }

    @PostMapping("/agregarAlCarrito/{producto_id}")
    public String addProduct(@PathVariable("producto_id") Integer producto_id){
        Optional<Producto> opt1 = this.productoJpaRepository.findById(producto_id);
       Producto producto = opt1.get();
        Optional<Usuario> opt = usuarioJpaRepository.findById((Integer)1);
        Usuario usuario = opt.get();
        usuario.agregarAlCarrito(producto);
        usuarioJpaRepository.save(usuario);
        

        return "carrito";
    }
    
    @GetMapping("/agregarAlCarrito/{producto_id}")
    public String show(Model model) {
    	Optional<Usuario> opt = usuarioJpaRepository.findById((Integer) 1);
    	
    	Usuario usuario = opt.get();
    	
    	List<Producto> carrito = usuario.getCarrito();
    	
    	model.addAttribute("productos", carrito);
    	
    	return "carrito";
    }

}
