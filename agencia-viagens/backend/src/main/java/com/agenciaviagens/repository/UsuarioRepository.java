package com.agenciaviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenciaviagens.model.Usuario;
import com.agenciaviagens.repository.usuario.UsuarioRepositoryQuery;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>, UsuarioRepositoryQuery {
    
}