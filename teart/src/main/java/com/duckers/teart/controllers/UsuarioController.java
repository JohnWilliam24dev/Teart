package com.duckers.teart.controllers;


import com.duckers.teart.facades.UsuarioFacade;
import com.duckers.teart.models.UsuarioModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuario") 
public class UsuarioController {
    private final UsuarioFacade usuarioFacade;

    @Autowired
    public UsuarioController(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }

    @PostMapping
    public ResponseEntity<Void> createUsuario(@RequestBody UsuarioModel usuario) {
        usuarioFacade.cadastrar(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioModel> getUsuarioById(@PathVariable Long id) {
        UsuarioModel usuario = usuarioFacade.buscarUsuarioPorId(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<UsuarioModel>> getAllUsuarios() {
        List<UsuarioModel> usuarios = usuarioFacade.listaUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    @PutMapping("")
    public ResponseEntity<Void> updateUsuario(@RequestBody UsuarioModel usuario) {
        usuarioFacade.atualizar(usuario);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable long id) {
        usuarioFacade.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
