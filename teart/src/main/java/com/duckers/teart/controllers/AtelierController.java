package com.duckers.teart.controllers;

import com.duckers.teart.entities.Atelier;
import com.duckers.teart.facades.AtelierFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atelier")
public class AtelierController {

    private final AtelierFacade atelierFacade;

    @Autowired
    public AtelierController(AtelierFacade atelierFacade) {
        this.atelierFacade = atelierFacade;
    }

    @PostMapping
    public void createAtelier(@RequestBody Atelier atelier) {
        atelierFacade.createAtelier(atelier);
    }

    @GetMapping("/{id}")
    public Atelier getAtelierById(@PathVariable long id) {
        return atelierFacade.getAtelierById(id);
    }

    @GetMapping
    public List<Atelier> getAllAteliers() {
        return atelierFacade.getAllAteliers();
    }

    @PutMapping("/{id}")
    public void updateAtelier(@PathVariable long id, @RequestBody Atelier atelier) {
        atelierFacade.updateAtelier(id, atelier);
    }

    @DeleteMapping("/{id}")
    public void deleteAtelier(@PathVariable long id) {
        atelierFacade.deleteAtelier(id);
    }
}
