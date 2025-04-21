package com.agenciaviagens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/exibir-pacote")
public class ExibicaoPacoteController {
    
    @GetMapping("/buscar")
    public String buscarPacote() {
        //log.info("Carregando página com pacote");
        return "exibicao-pacote"; /*esta no JTE */
    }

}



