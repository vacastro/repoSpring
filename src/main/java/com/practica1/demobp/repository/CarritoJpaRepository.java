package com.practica1.demobp.repository;

import com.practica1.demobp.model.Carrito;
import com.practica1.demobp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;

@Repository
public interface CarritoJpaRepository extends JpaRepository<Carrito, Integer>{

    @Transactional
    @Modifying
    @Query(value = "delete from carrito where usuario_id = :usuarioId and producto_id = :productoId",nativeQuery = true)
    public void deleteProductoById(@Param("usuarioId") Integer usuarioId,@Param("productoId") Integer productoId);


}
