package com.duckers.teart.controllers;


import com.duckers.teart.facades.AtelierFacade;
import com.duckers.teart.models.AtelierModel;

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
    public void createAtelier(@RequestBody AtelierModel atelier) {
        atelierFacade.createAtelier(atelier);
    }

    @GetMapping("/{id}")
    public AtelierModel getAtelierById(@PathVariable long id) {
        return atelierFacade.getAtelierById(id);
    }

    @GetMapping
    public List<AtelierModel> getAllAteliers() {
        return atelierFacade.getAllAteliers();
    }

    @PutMapping("")
    public void updateAtelier(@RequestBody AtelierModel atelier) {
        atelierFacade.updateAtelier(atelier);
    }

    @DeleteMapping("/{id}")
    public void deleteAtelier(@PathVariable long id) {
        atelierFacade.deleteAtelier(id);
    }
}
