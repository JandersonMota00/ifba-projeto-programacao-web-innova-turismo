package com.agenciaviagens.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.agenciaviagens.model.Usuario;

import jakarta.validation.Valid;

public class UsuarioController {
    
    @PostMapping("/criado")
    public String salvarUsuario(@Valid Usuario usuario) {
        //log.info("Usuário {} enviado", usuario);
        return "redirect:/usuario";
    }

    @GetMapping()
    public String formularioUsuario() {
        //log.info("Carregando página do formulario");
        return "formulario-usuario";
    }

    @GetMapping("/id/{idUsuario}")
    public String buscarUsuarioId(@PathVariable Long idUsuario) {
        return "redirect:/usuario";
    }
    
}
