package com.agenciaviagens.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.agenciaviagens.model.Usuario;
import com.agenciaviagens.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    public Usuario atualizar(Long idUsuario, Usuario usuario) {
        Usuario usuarioSalvo = buscarUsuarioPeloId(idUsuario);
        BeanUtils.copyProperties(usuario, usuarioSalvo, "idUsuario");
        return usuarioRepository.save(usuarioSalvo);
    }
    
    public void atualizarPropriedadeEmail(Long idUsuario, String email) {
        Usuario usuarioSalvo = buscarUsuarioPeloId(idUsuario);
        usuarioSalvo.setEmail(email);
        usuarioRepository.save(usuarioSalvo);
    }
    
    public void atualizarPropriedadeTelefone(Long idUsuario, String telefone) {
        Usuario usuarioSalvo = buscarUsuarioPeloId(idUsuario);
        usuarioSalvo.setTelefone(telefone);
        usuarioRepository.save(usuarioSalvo);
    }

    public void atualizarPropriedadeAtivo(Long idUsuario, Boolean ativo) {
        Usuario usuarioSalvo = buscarUsuarioPeloId(idUsuario);
        usuarioSalvo.setAtivo(ativo);
        usuarioRepository.save(usuarioSalvo);
    }
    
    private Usuario buscarUsuarioPeloId(Long idUsuario) {
        return usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new EmptyResultDataAccessException(1));
    }
}
