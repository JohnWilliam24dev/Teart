package com.duckers.teart.controller;

import com.duckers.teart.entities.Atelier;
import com.duckers.teart.facade.AtelierFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atelier")
public class AtelierController {
    
    private final AtelierFacade facadeAtelier;

   
    @Autowired
    public AtelierController(AtelierFacade facadeAtelier) {
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
    public List<Atelier> getAllAteliers() {
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
