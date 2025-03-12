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
    private static AtelierRepositorie atelierRepositorie;
    private static AtelierApplication atelierApplication;
    private static FacadeAtelier facadeAtelier;

    private static void injetarDependencias() {
        atelierRepositorie = new AtelierRepositorie();
        atelierApplication = new AtelierApplication(atelierRepositorie);
        facadeAtelier = new FacadeAtelier(atelierApplication);
    }

    public AtelierController() {
        injetarDependencias();
    }

    @PostMapping
    public void createAtelier(@RequestBody Atelier atelier) {
        atelierApplication.createAtelier(atelier);
    }

    @GetMapping("/{id}")
    public Atelier getAtelierById(@PathVariable int id) {
        return atelierApplication.getAtelierById(id);
    }

    @GetMapping
    public ArrayList<Atelier> getAllAteliers() {
        return atelierApplication.getAllAteliers();
    }

    @PutMapping("/{id}")
    public void updateAtelier(@PathVariable int id, @RequestBody Atelier atelier) {
        atelierApplication.updateAtelier(id, atelier);
    }

    @DeleteMapping("/{id}")
    public void deleteAtelier(@PathVariable int id) {
        atelierApplication.deleteAtelier(id);
    }
}
