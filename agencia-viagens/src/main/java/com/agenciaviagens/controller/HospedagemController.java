package com.agenciaviagens.controller;

import com.agenciaviagens.model.Hospedagem;
import com.agenciaviagens.service.HospedagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/hospedagens")
public class HospedagemController {

    @Autowired
    private HospedagemService hospedagemService;

    @GetMapping("/form")
    public String mostrarFormulario(Model model) {
        model.addAttribute("hospedagem", new Hospedagem());
        return "hospedagem/formulario";
    }

    @PostMapping("/salvar")
    public String salvarHospedagem(
            @ModelAttribute Hospedagem hospedagem,
            @RequestParam("foto") MultipartFile foto) {

        try {
            hospedagemService.salvarHospedagem(hospedagem, foto);
            return "redirect:/hospedagens/form?success";
        } catch (Exception e) {
            return "redirect:/hospedagens/form?error";
        }
    }

    // NOVO MÉTODO PARA LISTAR HOSPEDAGENS
    @GetMapping
    public String listarHospedagens(Model model) {
        model.addAttribute("hospedagens", hospedagemService.listarTodas());
        return "exibicao-hospedagem";
    }

    // MÉTODOS ADICIONAIS RECOMENDADOS
    @GetMapping("/editar/{id}")
    public String mostrarFormEdicao(@PathVariable Long id, Model model) {
        Hospedagem hospedagem = hospedagemService.buscarPorId(id);
        model.addAttribute("hospedagem", hospedagem);
        return "hospedagem/formulario";
    }

    @PostMapping("/excluir/{id}")
    public String excluirHospedagem(@PathVariable Long id) {
        hospedagemService.excluirHospedagem(id);
        return "redirect:/hospedagens?deleteSuccess";
    }
}