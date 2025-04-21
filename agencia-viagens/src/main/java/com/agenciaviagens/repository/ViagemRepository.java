package com.agenciaviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenciaviagens.model.Viagem;

public interface ViagemRepository extends JpaRepository<Viagem, Long> {
}