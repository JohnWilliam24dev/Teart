package com.duckers.teart.controller;

import com.duckers.teart.application.DonoAtelierApplication;
import com.duckers.teart.entities.DonoAtelier;
import com.duckers.teart.facade.FacadeDonoAtelier;
import com.duckers.teart.repositorie.DonoAtelierRepositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/donoAtelier")
public class DonoAtelierController {
    private final FacadeDonoAtelier facadeDonoAtelier;


    @Autowired
    public DonoAtelierController(FacadeDonoAtelier facadeDonoAtelier) {
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
    public ArrayList<DonoAtelier> getAllDonoAteliers() {
        return facadeDonoAtelier.listaDonoAteliers();
    }

    @PutMapping("/{id}")
    public void updateDonoAtelier(@PathVariable int id, @RequestBody DonoAtelier dono) {
        facadeDonoAtelier.atualizar(id, dono);
    }

    @DeleteMapping("/{id}")
    public void deleteDonoAtelier(@PathVariable int id) {
        facadeDonoAtelier.excluir(id);
    }
}
