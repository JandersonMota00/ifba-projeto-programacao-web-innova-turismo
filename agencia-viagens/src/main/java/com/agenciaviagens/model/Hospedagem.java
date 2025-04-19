package com.agenciaviagens.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "hospedagens")
@Data
@NoArgsConstructor
public class Hospedagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hospedagem", nullable = false)
    private Long idHospedagem;

    @NotNull
    @Column(name = "nome", nullable = false)
    private String nome;

    @NotNull
    @Column(name = "email", nullable = false)
    private String email;

    @OneToMany(mappedBy = "hospedagem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TelefoneHospedagem> telefones;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
    private EnderecoHospedagem endereco;

    @Lob
    @Column(name = "foto")
    private byte[] foto;
}