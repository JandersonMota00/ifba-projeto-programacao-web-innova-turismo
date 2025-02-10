package com.agenciaviagens.repository.filter;

import lombok.Data;

@Data
public class UsuarioFilter {
	
	private String nome;
	private String email;
	private String telefone;
	private Boolean ativo;

}
