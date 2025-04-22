package com.duckers.teart.controllers;


import com.duckers.teart.facades.ServicoFacade;
import com.duckers.teart.models.ServicoModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/servico")
public class ServicoController {
    private final ServicoFacade servicoFacade;

    @Autowired
    public ServicoController(ServicoFacade servicoFacade) {
        this.servicoFacade = servicoFacade;
    }

    @PostMapping
    public ResponseEntity<Void> createServico(@RequestBody ServicoModel servico) {
        servicoFacade.cadastrar(servico);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServicoModel> getServicoById(@PathVariable int id) {
        ServicoModel servico = servicoFacade.buscarServicoPorId(id);
        if (servico != null) {
            return ResponseEntity.ok(servico);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<ServicoModel>> getAllServicos() {
        List<ServicoModel> servicos = servicoFacade.listaServicos();
        return ResponseEntity.ok(servicos);
    }

    @PutMapping("")
    public ResponseEntity<Void> updateServico(@RequestBody ServicoModel servico) {
        servicoFacade.atualizar(servico);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServico(@PathVariable int id) {
        servicoFacade.excluir(id);
        return ResponseEntity.noContent().build();
    }
}