package com.agenciaviagens.repository;

import com.agenciaviagens.model.Hospedagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospedagemRepository extends JpaRepository<Hospedagem, Long> {
    // Métodos customizados podem ser adicionados aqui
}