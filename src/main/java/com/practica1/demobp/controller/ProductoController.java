package com.practica1.demobp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practica1.demobp.model.Producto;
import com.practica1.demobp.repository.ProductoJpaRepository;

@Controller

@RequestMapping("producto")


public class ProductoController {
	@Autowired
	private ProductoJpaRepository productoJpaRepository;
	
	//alta
	@GetMapping ("")
	public String getFormProductos() {
		return "adm"; //armar form para dar de alta produc - retorne vista
	}
	
	@GetMapping("producto")
	public List<Producto> getProductos(){
		List<Producto>productos = productoJpaRepository.findAll();
		return productos;//armar vista tabla de productos y devolver vista
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProducto(@PathVariable Integer id) {
		productoJpaRepository.deleteById(id);
	}
	
	@GetMapping("administrador")
	public String abmProducto() {
		return "adm"; //ver a que vista lo enviamos
	}
	@PostMapping("crear")
	public String insertProducto(Producto ProductoARegistrar) {
		productoJpaRepository.save(ProductoARegistrar);
		return "index";
	}
}