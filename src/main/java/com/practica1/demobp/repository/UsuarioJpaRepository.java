package com.practica1.demobp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practica1.demobp.model.Usuario;

@Repository

public interface UsuarioJpaRepository extends JpaRepository<Usuario, Integer>{
    Usuario findByEmail(String email);

}
