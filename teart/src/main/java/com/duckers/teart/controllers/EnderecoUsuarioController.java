package com.duckers.teart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.duckers.teart.entities.EnderecoUsuario;
import com.duckers.teart.facades.EnderecoUsuarioFacade;
import com.duckers.teart.models.EnderecoUsuarioModel;

@RestController
@RequestMapping("/endereco-usuario") 
public class EnderecoUsuarioController {
    private final EnderecoUsuarioFacade enderecoUsuarioFacade;

    @Autowired
    public EnderecoUsuarioController(EnderecoUsuarioFacade enderecoUsuarioFacade) {
        this.enderecoUsuarioFacade = enderecoUsuarioFacade;
    }

    @PostMapping
    public ResponseEntity<Void> createEnderecoUsuario(@RequestBody EnderecoUsuarioModel enderecoUsuario) {
        enderecoUsuarioFacade.createEnderecoUsuario(enderecoUsuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoUsuarioModel> getEnderecoUsuarioById(@PathVariable long id) {
        EnderecoUsuarioModel enderecoUsuario = enderecoUsuarioFacade.getEnderecoUsuarioById(id);
        return enderecoUsuario != null ? ResponseEntity.ok(enderecoUsuario) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<EnderecoUsuarioModel>> getAllEnderecoUsuarios() {
        return ResponseEntity.ok(enderecoUsuarioFacade.getAllEnderecoUsuarios());
    }

    @PutMapping("")
    public ResponseEntity<Void> updateEnderecoUsuario( @RequestBody EnderecoUsuarioModel enderecoUsuario) {
        enderecoUsuarioFacade.updateEnderecoUsuario(enderecoUsuario);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnderecoUsuario(@PathVariable long id) {
        enderecoUsuarioFacade.deleteEnderecoUsuario(id);
        return ResponseEntity.noContent().build();
    }
}
