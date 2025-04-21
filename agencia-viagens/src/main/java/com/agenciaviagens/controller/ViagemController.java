package com.agenciaviagens.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.agenciaviagens.model.Viagem;
import com.agenciaviagens.Service.ViagemService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/viagens")    /*Cadastro de viagens */
public class ViagemController {

private final ViagemService viagemService;
    

public ViagemController(ViagemService viagemService) {
    this.viagemService = viagemService;
}

  @PostMapping("/cadastrar")  /*Cadastrar viagens */
    public ResponseEntity<Viagem> criar(@RequestBody Viagem viagem) {
        return ResponseEntity.ok(viagemService.salvarViagem(viagem));
    }
   
    @GetMapping("/buscar")
    public ResponseEntity<List<Viagem>> listar() {
        return ResponseEntity.ok(viagemService.listarTodas());
    }

    @GetMapping("/{id}")
     public ResponseEntity<Viagem> buscar(@PathVariable Long id) {
    return viagemService.buscarPorId(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
}
   @DeleteMapping("/{id}")
public ResponseEntity<Void> deletar(@PathVariable Long id) {
    viagemService.deletar(id);
    return ResponseEntity.noContent().build();
}


}
