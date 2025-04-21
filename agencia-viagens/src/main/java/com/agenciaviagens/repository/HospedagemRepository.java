package com.agenciaviagens.repository;

import com.agenciaviagens.model.Hospedagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HospedagemRepository extends JpaRepository<Hospedagem, Long> {

    // Busca por nome (contendo o termo, case insensitive)
    List<Hospedagem> findByNomeContainingIgnoreCase(String nome);

    // Busca por cidade
    List<Hospedagem> findByCidade(String cidade);

    // Busca por cidade e estado
    List<Hospedagem> findByCidadeAndEstado(String cidade, String estado);

    // Busca por email (exato)
    Optional<Hospedagem> findByEmail(String email);

    // Busca por país
    List<Hospedagem> findByPais(String pais);

    // Consulta customizada com JPQL para buscar hospedagens em um raio de cidades
    @Query("SELECT h FROM Hospedagem h WHERE h.cidade IN :cidades")
    List<Hospedagem> findByCidades(@Param("cidades") List<String> cidades);

    // Consulta nativa para contar hospedagens por estado
    @Query(value = "SELECT estado, COUNT(*) as total FROM hospedagens GROUP BY estado", nativeQuery = true)
    List<Object[]> countByEstado();

    // Verifica se existe hospedagem com o email fornecido (para validação)
    boolean existsByEmail(String email);
}