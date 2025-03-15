package com.duckers.teart.controller;

import com.duckers.teart.application.EnderecoAtelierApplication;
import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.facade.FacadeEnderecoAtelier;
import com.duckers.teart.repositorie.EnderecoAtelierRepositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/enderecoAtelier")
public class EnderecoAtelierController {
    
    private final FacadeEnderecoAtelier facadeEnderecoAtelier;

    
    @Autowired
    public EnderecoAtelierController(FacadeEnderecoAtelier facadeEnderecoAtelier) {
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
    public ArrayList<EnderecoAtelier> getAllEnderecoAteliers() {
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
