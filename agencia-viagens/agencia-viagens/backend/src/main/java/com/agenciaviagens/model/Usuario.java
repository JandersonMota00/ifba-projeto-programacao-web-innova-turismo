package com.agenciaviagens.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "usuarios")
public class Usuario extends Pessoa {

	@Getter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", nullable = false)
	private Long idUsuario;

	@Column(name = "status", nullable = false)
	private Boolean ativo;

	// Esse construtor vazio é apenas para o Hibernate parar de dar erro.
	private Usuario() {}
	
	public Usuario(
			@NotBlank(message = "O nome é obrigatório.") String nome,
			@NotBlank(message = "O email é obrigatório.") String email,
			@NotBlank(message = "A rede social é obrigatória.") String telefone) {
		
		super(nome, email, telefone);
		this.ativo = false;
	}

	@Override
    public String obterDescricao() {
        return String.format("ID: %d, Usuário: %s, Email: %s, Telefone: %s, Status: %s",
                this.getIdUsuario(), super.getNome(), super.getEmail(), super.getTelefone(), this.getAtivo(),
                (ativo ? "Ativo" : "Inativo"));
    }
	
}