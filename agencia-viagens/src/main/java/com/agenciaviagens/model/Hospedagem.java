package com.agenciaviagens.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hospedagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome da hospedagem é obrigatório")
    @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres")
    private String nome;

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Email inválido")
    @Size(max = 100, message = "O email deve ter no máximo 100 caracteres")
    private String email;

    @NotBlank(message = "O telefone principal é obrigatório")
    @Pattern(regexp = "\\(?\\d{2,}\\)?[ -]?\\d{4,}[\\-\\s]?\\d{4}", message = "Formato de telefone inválido")
    @Size(max = 20, message = "O telefone deve ter no máximo 20 caracteres")
    private String telefone1;

    @Pattern(regexp = "\\(?\\d{2,}\\)?[ -]?\\d{4,}[\\-\\s]?\\d{4}", message = "Formato de telefone inválido")
    @Size(max = 20, message = "O telefone deve ter no máximo 20 caracteres")
    private String telefone2;

    @NotBlank(message = "O país é obrigatório")
    @Size(max = 50, message = "O país deve ter no máximo 50 caracteres")
    private String pais;

    @NotBlank(message = "O estado é obrigatório")
    @Size(max = 50, message = "O estado deve ter no máximo 50 caracteres")
    private String estado;

    @NotBlank(message = "A cidade é obrigatória")
    @Size(max = 50, message = "A cidade deve ter no máximo 50 caracteres")
    private String cidade;

    @NotBlank(message = "O bairro é obrigatório")
    @Size(max = 50, message = "O bairro deve ter no máximo 50 caracteres")
    private String bairro;

    @NotBlank(message = "O logradouro é obrigatório")
    @Size(max = 100, message = "O logradouro deve ter no máximo 100 caracteres")
    private String logradouro;

    @NotBlank(message = "O número é obrigatório")
    @Size(max = 10, message = "O número deve ter no máximo 10 caracteres")
    private String numero;

    @Size(max = 50, message = "O complemento deve ter no máximo 50 caracteres")
    private String complemento;
}