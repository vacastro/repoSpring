package com.practica1.demobp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practica1.demobp.model.Producto;

@Repository

public interface ProductoJpaRepository extends JpaRepository<Producto, Integer>{

}
