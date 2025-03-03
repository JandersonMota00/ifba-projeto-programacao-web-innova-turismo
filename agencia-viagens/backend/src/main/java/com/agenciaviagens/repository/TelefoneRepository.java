package com.agenciaviagens.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.agenciaviagens.model.Telefone;
import com.agenciaviagens.model.Usuario;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

    /**
     * Retorna a lista de telefones de um usuário específico.
     */
    List<Telefone> findByUsuario(Usuario usuario);

    /**
     * Remove todos os telefones associados a um usuário.
     */
    @Transactional
    void deleteByUsuario(Usuario usuario);
}
