package com.duckers.teart.controllers;

import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.facades.EnderecoAtelierFacade;
import com.duckers.teart.models.EnderecoAtelierModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco-atelier") 
public class EnderecoAtelierController {

    private final EnderecoAtelierFacade enderecoAtelierFacade;

    @Autowired
    public EnderecoAtelierController(EnderecoAtelierFacade enderecoAtelierFacade) {
        this.enderecoAtelierFacade = enderecoAtelierFacade;
    }

    @PostMapping
    public void createEnderecoAtelier(@RequestBody EnderecoAtelierModel endereco) {
        enderecoAtelierFacade.createEnderecoAtelier(endereco);
    }

    @GetMapping("/{id}")
    public EnderecoAtelierModel getEnderecoAtelierById(@PathVariable long id) {
        return enderecoAtelierFacade.getEnderecoAtelierById(id);
    }

    @GetMapping
    public List<EnderecoAtelierModel> getAllEnderecoAteliers() {
        return enderecoAtelierFacade.getAllEnderecoAteliers();
    }

    @PutMapping("")
    public void updateEnderecoAtelier(@RequestBody EnderecoAtelierModel endereco) {
        enderecoAtelierFacade.updateEnderecoAtelier(endereco);
    }

    @DeleteMapping("/{id}")
    public void deleteEnderecoAtelier(@PathVariable long id) {
        enderecoAtelierFacade.deleteEnderecoAtelier(id);
    }
}
