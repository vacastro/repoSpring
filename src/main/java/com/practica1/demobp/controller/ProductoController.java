package com.practica1.demobp.controller;

import java.util.List;


import com.practica1.demobp.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.practica1.demobp.model.Producto;
import com.practica1.demobp.repository.ProductoJpaRepository;
import org.thymeleaf.model.IModel;

import javax.jws.WebParam;

@Controller

@RequestMapping("producto")


public class ProductoController {
	@Autowired
	private ProductoJpaRepository productoJpaRepository;

	//quiero inyectar CategoriaJpaRepository por el Autowired, pero me sugiere colocarlo como parámetro en la public
	//class de ProductoController y cuando creo la lista aplicamdo el Model no llama los métodos que preciso
	//La otra es que me sugiere hacerlo por constructor, pero no me cierra la idea
	//Vale la pena hacer un "CategoriaController??" :S

	@GetMapping ("adm")
	public String getFormProductos(/*Model model*/) {
		//model.addAttribute("categorias", "categoria");
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