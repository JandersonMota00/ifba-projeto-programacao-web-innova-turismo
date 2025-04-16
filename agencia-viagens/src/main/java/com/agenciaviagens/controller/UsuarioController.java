package com.agenciaviagens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.agenciaviagens.model.Usuario;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    
    @PostMapping("/criado")
    public String salvarUsuario(@Valid Usuario usuario) {
        //log.info("Usuário {} enviado", usuario);
        return "redirect:/usuario";
    }

    @GetMapping("/cadastro")
    public String formularioUsuario() {
        //log.info("Carregando página do formulario");
        return "cadastro-usuario";
    }

    @GetMapping("/id/{idUsuario}")
    public String buscarUsuarioId(@PathVariable Long idUsuario) {
        return "redirect:/usuario";
    }
    
}
