package com.duckers.teart.controllers;

import com.duckers.teart.entities.DonoAtelier;
import com.duckers.teart.facades.DonoAtelierFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dono-atelier") // OBS: dono-atelier
public class DonoAtelierController {
    private final DonoAtelierFacade facadeDonoAtelier;

    @Autowired
    public DonoAtelierController(DonoAtelierFacade facadeDonoAtelier) {
        this.facadeDonoAtelier = facadeDonoAtelier;
    }

    @PostMapping
    public void createDonoAtelier(@RequestBody DonoAtelier dono) {
        facadeDonoAtelier.cadastrar(dono);
    }

    @GetMapping("/{id}")
    public DonoAtelier getDonoAtelierById(@PathVariable int id) {
        return facadeDonoAtelier.buscarDonoAtelierPorId(id);
    }

    @GetMapping
    public List<DonoAtelier> getAllDonoAteliers() {
        return facadeDonoAtelier.listaDonoAteliers();
    }

    @PutMapping("")
    public void updateDonoAtelier(@RequestBody DonoAtelier dono) {
        facadeDonoAtelier.atualizar(dono);
    }

    @DeleteMapping("/{id}")
    public void deleteDonoAtelier(@PathVariable int id) {
        facadeDonoAtelier.excluir(id);
    }
}
