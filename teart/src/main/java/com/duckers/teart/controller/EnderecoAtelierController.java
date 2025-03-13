package com.duckers.teart.controller;

import com.duckers.teart.application.EnderecoAtelierApplication;
import com.duckers.teart.entities.EnderecoAtelier;
import com.duckers.teart.facade.FacadeEnderecoAtelier;
import com.duckers.teart.repositorie.EnderecoAtelierRepositorie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/enderecoAtelier")
public class EnderecoAtelierController {
    private static EnderecoAtelierRepositorie enderecoAtelierRepositorie;
    private static EnderecoAtelierApplication enderecoAtelierApplication;
    private static FacadeEnderecoAtelier facadeEnderecoAtelier;

    private static void injetarDependencias() {
        enderecoAtelierRepositorie = new EnderecoAtelierRepositorie();
        enderecoAtelierApplication = new EnderecoAtelierApplication(enderecoAtelierRepositorie);
        facadeEnderecoAtelier = new FacadeEnderecoAtelier(enderecoAtelierApplication);
    }

    public EnderecoAtelierController() {
        injetarDependencias();
    }

    @PostMapping
    public void createEnderecoAtelier(@RequestBody EnderecoAtelier endereco) {
        enderecoAtelierApplication.createEnderecoAtelier(endereco);
    }

    @GetMapping("/{id}")
    public EnderecoAtelier getEnderecoAtelierById(@PathVariable int id) {
        return enderecoAtelierApplication.getEnderecoAtelierById(id);
    }

    @GetMapping
    public ArrayList<EnderecoAtelier> getAllEnderecoAteliers() {
        return enderecoAtelierApplication.getAllEnderecoAteliers();
    }

    @PutMapping("/{id}")
    public void updateEnderecoAtelier(@PathVariable int id, @RequestBody EnderecoAtelier endereco) {
        enderecoAtelierApplication.updateEnderecoAtelier(id, endereco);
    }

    @DeleteMapping("/{id}")
    public void deleteEnderecoAtelier(@PathVariable int id) {
        enderecoAtelierApplication.deleteEnderecoAtelier(id);
    }
}
