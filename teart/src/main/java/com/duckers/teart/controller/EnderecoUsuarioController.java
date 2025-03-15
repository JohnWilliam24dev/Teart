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

import com.duckers.teart.application.EnderecoAtelierApplication;
import com.duckers.teart.application.EnderecoUsuarioApplication;
import com.duckers.teart.entities.EnderecoUsuario;
import com.duckers.teart.facade.FacadeEnderecoUsuario;
import com.duckers.teart.repositorie.EnderecoAtelierRepositorie;
import com.duckers.teart.repositorie.EnderecoUsuarioRepositorie;

@RestController
@RequestMapping("/enderecoUsuarios")
public class EnderecoUsuarioController {
    private static FacadeEnderecoUsuario enderecoUsuarioFacade;
    private static EnderecoUsuarioApplication enderecoUsuarioApplication;
    private static EnderecoUsuarioRepositorie enderecoUsuarioRepositorie;

    public static void injetarDependencias(){
        enderecoUsuarioRepositorie = new EnderecoUsuarioRepositorie();
        enderecoUsuarioApplication = new EnderecoUsuarioApplication(enderecoUsuarioRepositorie);
        enderecoUsuarioFacade = new FacadeEnderecoUsuario(enderecoUsuarioApplication);

    }

    public EnderecoUsuarioController(){
        injetarDependencias();
    }

    
    @Autowired
    public EnderecoUsuarioController(FacadeEnderecoUsuario enderecoUsuarioFacade) {
        this.enderecoUsuarioFacade = enderecoUsuarioFacade;
    }

    @PostMapping
    public ResponseEntity<Void> createEnderecoUsuario(@RequestBody EnderecoUsuario enderecoUsuario) {
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