package com.practica1.demobp.repository;

import com.practica1.demobp.model.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoJpaRepository extends JpaRepository <Carrito, Integer> {
}
