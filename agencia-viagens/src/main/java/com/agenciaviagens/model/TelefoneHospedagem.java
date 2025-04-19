package com.agenciaviagens.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "telefones_hospedagem")
@Data
@NoArgsConstructor
public class TelefoneHospedagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_telefone", nullable = false)
    private Long idTelefone;

    @NotNull
    @Column(name = "numero", nullable = false)
    private String numero;

    @NotNull
    @Column(name = "tipo", nullable = false) // Phone, WhatsApp, Telegram
    private String tipo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_hospedagem", nullable = false)
    private Hospedagem hospedagem;
}