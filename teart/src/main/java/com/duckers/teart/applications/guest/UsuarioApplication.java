package com.duckers.teart.applications.guest;

import com.duckers.teart.controllers.requests.UsuarioRequest;
import com.duckers.teart.models.security.PapelModel;
import com.duckers.teart.models.security.UsuarioModel;
import com.duckers.teart.repositories.interfaces.security.PapelRepository;
import com.duckers.teart.repositories.interfaces.security.UsuarioRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UsuarioApplication {
    private final UsuarioRepository usuarioRepository;
    private final PapelRepository papelRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public UsuarioApplication(UsuarioRepository usuarioRepository, PapelRepository papelRepository) {
        this.usuarioRepository = usuarioRepository;
        this.papelRepository = papelRepository;
    }

    public void cadastrar(UsuarioRequest usuarioRequest) {
        UsuarioModel usuario = new UsuarioModel(
                usuarioRequest.getNome(),
                usuarioRequest.getUsuario(),
                usuarioRequest.getSenha()
        );
        usuario.setSenha("{bcrypt}" + bCryptPasswordEncoder.encode(usuario.getSenha()));
        this.usuarioRepository.save(usuario);
        PapelModel papel = new PapelModel();
        papel.setPapel("ROLE_" + usuarioRequest.getPapel());
        papel.setUsuarioId(usuario.getId());
        this.papelRepository.save(papel);
    }
}
