package com.agenciaviagens.controller;

@Controller
@RequestMapping("/hospedagens")
public class HospedagemController {

    @Autowired
    private HospedagemService hospedagemService;

    @GetMapping("/form")
    public String mostrarFormulario() {
        return "cadastro-hospedagem";
    }

    /*
    @PostMapping("/salvar")
    public String salvarHospedagem(
            @ModelAttribute Hospedagem hospedagem,
            @RequestParam("foto") MultipartFile foto) {

        try {
            hospedagemService.salvarHospedagem(hospedagem, foto);
            return "redirect:/hospedagens?success";
        } catch (Exception e) {
            return "redirect:/hospedagens/form?error";
        }
    }
    */
}