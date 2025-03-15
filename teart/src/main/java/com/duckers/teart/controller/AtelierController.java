package com.duckers.teart.controller;

import com.duckers.teart.application.AtelierApplication;
import com.duckers.teart.entities.Atelier;
import com.duckers.teart.facade.FacadeAtelier;
import com.duckers.teart.repositorie.AtelierRepositorie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/atelier")
public class AtelierController {
    
    private final FacadeAtelier facadeAtelier;

   

    public AtelierController(FacadeAtelier facadeAtelier) {
        this.facadeAtelier = facadeAtelier;
    }

    @PostMapping
    public void createAtelier(@RequestBody Atelier atelier) {
        facadeAtelier.cadastrar(atelier);
    }

    @GetMapping("/{id}")
    public Atelier getAtelierById(@PathVariable int id) {
        return facadeAtelier.buscarAtelierPorId(id);
    }

    @GetMapping
    public ArrayList<Atelier> getAllAteliers() {
        return facadeAtelier.listaAteliers();
    }

    @PutMapping("/{id}")
    public void updateAtelier(@PathVariable int id, @RequestBody Atelier atelier) {
        facadeAtelier.atualizar(id, atelier);
    }

    @DeleteMapping("/{id}")
    public void deleteAtelier(@PathVariable int id) {
        facadeAtelier.excluir(id);
    }
}
