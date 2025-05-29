package com.duckers.teart.controllers.guest;

import com.duckers.teart.applications.guest.UsuarioApplication;
import com.duckers.teart.controllers.requests.UsuarioRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guest")
public class UsuarioController {
    private final UsuarioApplication usuarioApplication;

    public UsuarioController(UsuarioApplication usuarioApplication) {
        this.usuarioApplication = usuarioApplication;
    }

    @PostMapping
    public void cadastrar(@RequestBody UsuarioRequest usuarioRequest) {
        this.usuarioApplication.cadastrar(usuarioRequest);
    }
}