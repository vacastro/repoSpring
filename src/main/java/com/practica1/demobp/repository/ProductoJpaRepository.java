package com.practica1.demobp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.practica1.demobp.model.Producto;

import java.util.List;


@Repository

public interface ProductoJpaRepository extends JpaRepository<Producto, Integer>{
    //@Query ("select name from producto where producto.name is :name")
    //List<Producto> jpqlFindByName(@Param("name")String name);

    List<Producto> findAllByCategoria_nombre(String categoria);

    //void jpqlFindByName();
}
