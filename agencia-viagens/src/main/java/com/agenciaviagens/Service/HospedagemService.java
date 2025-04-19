package com.agenciaviagens.service;

import com.agenciaviagens.model.Hospedagem;
import com.agenciaviagens.repository.HospedagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class HospedagemService {

    @Autowired
    private HospedagemRepository hospedagemRepository;

    public Hospedagem salvarHospedagem(Hospedagem hospedagem, MultipartFile foto) throws IOException {
        if (foto != null && !foto.isEmpty()) {
            hospedagem.setFoto(foto.getBytes());
        }

        if (hospedagem.getTelefones() != null) {
            hospedagem.getTelefones().forEach(telefone -> telefone.setHospedagem(hospedagem));
        }

        return hospedagemRepository.save(hospedagem);
    }

    public List<Hospedagem> listarTodas() {
        return hospedagemRepository.findAll();
    }

    // Outros métodos conforme necessário
}