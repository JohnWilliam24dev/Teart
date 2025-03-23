package com.duckers.teart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duckers.teart.entities.EnderecoUsuario;
import com.duckers.teart.facade.EnderecoUsuarioFacade;

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
        System.out.println("Recebido: " + enderecoUsuario.getIdUsuario());
        enderecoUsuarioFacade.cadastrar(enderecoUsuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoUsuario> getEnderecoUsuarioById(@PathVariable int id) {
        EnderecoUsuario enderecoUsuario = enderecoUsuarioFacade.buscarEnderecoUsuarioPorId(id);
        if (enderecoUsuario != null) {
            return ResponseEntity.ok(enderecoUsuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<EnderecoUsuario>> getAllEnderecoUsuarios() {
        List<EnderecoUsuario> enderecos = enderecoUsuarioFacade.ListaEnderecoUsuarios();
        return ResponseEntity.ok(enderecos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateEnderecoUsuario(@PathVariable int id, @RequestBody EnderecoUsuario enderecoUsuario) {
        enderecoUsuarioFacade.atualizar(id, enderecoUsuario);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnderecoUsuario(@PathVariable int id) {
        enderecoUsuarioFacade.excluir(id);
        return ResponseEntity.noContent().build();
    }
}