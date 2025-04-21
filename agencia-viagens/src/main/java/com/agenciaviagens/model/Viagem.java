package com.agenciaviagens.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.*;// Inclui Entity, Table, Id, Column, etc.
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "viagens")
@Getter
@Setter
@NoArgsConstructor
public class Viagem {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 255)
    @Column(name = "titulo",unique = true)
    private String titulo;

    @NotNull
    @Column(name = "descricao")
    private String descricao;


    @NotNull
    @Column(name = "dataPartida")
    private LocalDate dataPartida;
     
    @NotNull
    @Column(name = "dataChegada")
    private LocalDate dataChegada;

    @NotNull
    @Column(name = "estado")
    private String estado;

    @NotNull
    @Column(name = "translado")
    private String translado;

    @NotNull
    @Column(name = "passeio")
    private String passeio;

    @NotNull
    @Column(name = "hospedagem")
    private String hospedagem;

    @NotNull
    @Column(name = "valor")
    private BigDecimal valor;

}
