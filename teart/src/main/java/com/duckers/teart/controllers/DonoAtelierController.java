package com.duckers.teart.controllers;


import com.duckers.teart.facades.DonoAtelierFacade;
import com.duckers.teart.models.DonoAtelierModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dono-atelier") 
public class DonoAtelierController {
    private final DonoAtelierFacade facadeDonoAtelier;

    @Autowired
    public DonoAtelierController(DonoAtelierFacade facadeDonoAtelier) {
        this.facadeDonoAtelier = facadeDonoAtelier;
    }

    @PostMapping
    public void createDonoAtelier(@RequestBody DonoAtelierModel dono) {
        facadeDonoAtelier.cadastrar(dono);
    }

    @GetMapping("/{id}")
    public DonoAtelierModel getDonoAtelierById(@PathVariable int id) {
        return facadeDonoAtelier.buscarDonoAtelierPorId(id);
    }

    @GetMapping
    public List<DonoAtelierModel> getAllDonoAteliers() {
        return facadeDonoAtelier.listaDonoAteliers();
    }

    @PutMapping("")
    public void updateDonoAtelier(@RequestBody DonoAtelierModel dono) {
        facadeDonoAtelier.atualizar(dono);
    }

    @DeleteMapping("/{id}")
    public void deleteDonoAtelier(@PathVariable int id) {
        facadeDonoAtelier.excluir(id);
    }
}
