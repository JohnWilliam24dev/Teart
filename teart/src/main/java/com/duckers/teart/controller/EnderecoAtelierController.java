package com.duckers.teart.controller;

import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.facade.EnderecoAtelierFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecoAtelier")
public class EnderecoAtelierController {
    
    private final EnderecoAtelierFacade facadeEnderecoAtelier;

    
    @Autowired
    public EnderecoAtelierController(EnderecoAtelierFacade facadeEnderecoAtelier) {
        this.facadeEnderecoAtelier = facadeEnderecoAtelier;
    }

    @PostMapping
    public void createEnderecoAtelier(@RequestBody EnderecoAtelier endereco) {
        facadeEnderecoAtelier.cadastrar(endereco);
    }

    @GetMapping("/{id}")
    public EnderecoAtelier getEnderecoAtelierById(@PathVariable int id) {
        return facadeEnderecoAtelier.buscarEnderecoAtelierPorId(id);
    }

    @GetMapping
    public List<EnderecoAtelier> getAllEnderecoAteliers() {
        return facadeEnderecoAtelier.listaEnderecoAteliers();
    }

    @PutMapping("/{id}")
    public void updateEnderecoAtelier(@PathVariable int id, @RequestBody EnderecoAtelier endereco) {
        facadeEnderecoAtelier.atualizar(id, endereco);
    }

    @DeleteMapping("/{id}")
    public void deleteEnderecoAtelier(@PathVariable int id) {
        facadeEnderecoAtelier.excluir(id);
    }
}
