package com.agenciaviagens.repository.usuario;

import java.util.List;

import com.agenciaviagens.model.Usuario;
import com.agenciaviagens.repository.filter.UsuarioFilter;

public interface UsuarioRepositoryQuery {
	
	public List<Usuario> filtrar(UsuarioFilter usuarioFilter);

}