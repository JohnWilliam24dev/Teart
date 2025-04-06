package com.duckers.teart.controllers;

import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.facades.EnderecoAtelierFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco-atelier") // padronizar para "endereco-atelier"
public class EnderecoAtelierController {

    private final EnderecoAtelierFacade enderecoAtelierFacade;

    @Autowired
    public EnderecoAtelierController(EnderecoAtelierFacade enderecoAtelierFacade) {
        this.enderecoAtelierFacade = enderecoAtelierFacade;
    }

    @PostMapping
    public void createEnderecoAtelier(@RequestBody EnderecoAtelier endereco) {
        enderecoAtelierFacade.createEnderecoAtelier(endereco);
    }

    @GetMapping("/{id}")
    public EnderecoAtelier getEnderecoAtelierById(@PathVariable long id) {
        return enderecoAtelierFacade.getEnderecoAtelierById(id);
    }

    @GetMapping
    public List<EnderecoAtelier> getAllEnderecoAteliers() {
        return enderecoAtelierFacade.getAllEnderecoAteliers();
    }

    @PutMapping("")
    public void updateEnderecoAtelier(@RequestBody EnderecoAtelier endereco) {
        enderecoAtelierFacade.updateEnderecoAtelier(endereco);
    }

    @DeleteMapping("/{id}")
    public void deleteEnderecoAtelier(@PathVariable long id) {
        enderecoAtelierFacade.deleteEnderecoAtelier(id);
    }
}
