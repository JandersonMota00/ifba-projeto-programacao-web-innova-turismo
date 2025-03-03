package com.agenciaviagens.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;

    // @ManyToOne(cascade=CascadeType.PERSIST)
    // 	@OneToMany(mappedBy = "orders" ,  cascade=CascadeType.PERSIST)
    @JsonIgnore
    @OneToMany(mappedBy = "usuario", cascade=CascadeType.ALL, orphanRemoval = true)
    private List<Telefone> telefones;

    // Construtor padrão necessário para o Hibernate
    private Usuario() {}

    public Usuario(String nome, String email, Boolean ativo) {
        super(nome, email);
        this.ativo = ativo;
    }

    @Override
    public String obterDescricao() {
        return String.format("ID: %d, Usuário: %s, Email: %s, Ativo: %s",
                this.getIdUsuario(), super.getNome(), super.getEmail(), this.getAtivo() ? "Ativo" : "Inativo");
    }
}
