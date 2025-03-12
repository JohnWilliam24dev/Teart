package com.duckers.teart.controller;

import com.duckers.teart.application.DonoAtelierApplication;
import com.duckers.teart.entities.DonoAtelier;
import com.duckers.teart.facade.FacadeDonoAtelier;
import com.duckers.teart.repositorie.DonoAtelierRepositorie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/donoAtelier")
public class DonoAtelierController {
    private static DonoAtelierRepositorie donoAtelierRepositorie;
    private static DonoAtelierApplication donoAtelierApplication;
    private static FacadeDonoAtelier facadeDonoAtelier;

    private static void injetarDependencias() {
        donoAtelierRepositorie = new DonoAtelierRepositorie();
        donoAtelierApplication = new DonoAtelierApplication(donoAtelierRepositorie);
        facadeDonoAtelier = new FacadeDonoAtelier(donoAtelierApplication);
    }

    public DonoAtelierController() {
        injetarDependencias();
    }

    @PostMapping
    public void createDonoAtelier(@RequestBody DonoAtelier dono) {
        donoAtelierApplication.createDonoAtelier(dono);
    }

    @GetMapping("/{id}")
    public DonoAtelier getDonoAtelierById(@PathVariable int id) {
        return donoAtelierApplication.getDonoAtelierById(id);
    }

    @GetMapping
    public ArrayList<DonoAtelier> getAllDonoAteliers() {
        return donoAtelierApplication.getAllDonoAteliers();
    }

    @PutMapping("/{id}")
    public void updateDonoAtelier(@PathVariable int id, @RequestBody DonoAtelier dono) {
        donoAtelierApplication.updateDonoAtelier(id, dono);
    }

    @DeleteMapping("/{id}")
    public void deleteDonoAtelier(@PathVariable int id) {
        donoAtelierApplication.deleteDonoAtelier(id);
    }
}
