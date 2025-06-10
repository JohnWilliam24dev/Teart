package com.duckers.teart.controllers;


import com.duckers.teart.facades.CompradorFacade;
import com.duckers.teart.models.CompradorModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/comprador")
public class CompradorController {
    private final CompradorFacade compradorFacade;

    @Autowired
    public CompradorController(CompradorFacade compradorFacade) {
        this.compradorFacade = compradorFacade;
    }

    @PostMapping("/")
    public ResponseEntity<Void> createUsuario(@RequestBody CompradorModel usuario) {
        compradorFacade.cadastrar(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompradorModel> getUsuarioById(@PathVariable Long id) {
        CompradorModel usuario = compradorFacade.buscarUsuarioPorId(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<CompradorModel>> getAllUsuarios() {
        List<CompradorModel> usuarios = compradorFacade.listaUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    @PutMapping("/")
    public ResponseEntity<Void> updateUsuario(@RequestBody CompradorModel usuario) {
        compradorFacade.atualizar(usuario);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable long id) {
        compradorFacade.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
