package com.agenciaviagens.Service;

import java.util.List;
import java.util.Optional;

import com.agenciaviagens.model.Viagem;
import com.agenciaviagens.repository.ViagemRepository;

public class ViagemService {

    private final ViagemRepository viagemRepository;

    public ViagemService(ViagemRepository viagemRepository) {
        this.viagemRepository = viagemRepository;
    }

    public Viagem salvarViagem(Viagem viagem) {
        return viagemRepository.save(viagem);
    }

    public List<Viagem> listarTodas() {
        return viagemRepository.findAll();
    }

    public Optional<Viagem> buscarPorId(Long id) {
        return viagemRepository.findById(id);
    }

    public void deletar(Long id) {
        viagemRepository.deleteById(id);
    }
}

