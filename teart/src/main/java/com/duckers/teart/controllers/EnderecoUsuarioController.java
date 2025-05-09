package com.duckers.teart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.duckers.teart.entities.EnderecoUsuario;
import com.duckers.teart.facades.EnderecoUsuarioFacade;

@RestController
@RequestMapping("/enderecoUsuarios")
public class EnderecoUsuarioController {
    private final EnderecoUsuarioFacade enderecoUsuarioFacade;

    @Autowired
    public EnderecoUsuarioController(EnderecoUsuarioFacade enderecoUsuarioFacade) {
        this.enderecoUsuarioFacade = enderecoUsuarioFacade;
    }

    @PostMapping
    public ResponseEntity<Void> createEnderecoUsuario(@RequestBody EnderecoUsuario enderecoUsuario) {
        enderecoUsuarioFacade.createEnderecoUsuario(enderecoUsuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoUsuario> getEnderecoUsuarioById(@PathVariable long id) {
        EnderecoUsuario enderecoUsuario = enderecoUsuarioFacade.getEnderecoUsuarioById(id);
        return enderecoUsuario != null ? ResponseEntity.ok(enderecoUsuario) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<EnderecoUsuario>> getAllEnderecoUsuarios() {
        return ResponseEntity.ok(enderecoUsuarioFacade.getAllEnderecoUsuarios());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateEnderecoUsuario(@PathVariable long id, @RequestBody EnderecoUsuario enderecoUsuario) {
        enderecoUsuarioFacade.updateEnderecoUsuario(id, enderecoUsuario);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnderecoUsuario(@PathVariable long id) {
        enderecoUsuarioFacade.deleteEnderecoUsuario(id);
        return ResponseEntity.noContent().build();
    }
}
