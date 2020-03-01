package com.practica1.demobp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.practica1.demobp.model.Producto;
import com.practica1.demobp.repository.ProductoJpaRepository;

import javax.jws.WebParam;

@Controller

@RequestMapping("producto")


public class ProductoController {
	@Autowired
	private ProductoJpaRepository productoJpaRepository;
	

	@GetMapping ("adm")
	public String getFormProductos() {
		//productoJpaRepository.jpqlFindByName();
		return "adm";
	}

	@GetMapping("all")
	public String allProducts(Model model){
		List<Producto>productos = productoJpaRepository.findAll();
		model.addAttribute("listaProductos",productos);
		return "ListadoDeProductos";
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProducto(@PathVariable Integer id) {
		productoJpaRepository.deleteById(id);
	}

	@PostMapping("adm")
	public String insertProducto(Producto ProductoARegistrar) {
		productoJpaRepository.save(ProductoARegistrar);
		return "adm";
	}

}