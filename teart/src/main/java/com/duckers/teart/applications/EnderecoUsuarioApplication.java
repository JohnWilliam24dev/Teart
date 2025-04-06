package com.duckers.teart.applications;
import java.util.List;
import com.duckers.teart.entities.EnderecoUsuario;
import com.duckers.teart.repositories.EnderecoUsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class EnderecoUsuarioApplication {
    private EnderecoUsuarioRepository enderecoUsuarioRepository;

    public EnderecoUsuarioApplication(EnderecoUsuarioRepository enderecoUsuarioRepository) {
        this.enderecoUsuarioRepository = enderecoUsuarioRepository;
    }

    public void createEnderecoUsuario(EnderecoUsuario enderecoUsuario) {
        enderecoUsuarioRepository.createEnderecoUsuario(enderecoUsuario);
    }

    public EnderecoUsuario getEnderecoUsuarioById(long id) {
        return enderecoUsuarioRepository.getEnderecoUsuarioById(id);
    }

    public List<EnderecoUsuario> getAllEnderecoUsuarios() {
        return enderecoUsuarioRepository.getAllEnderecoUsuario();
    }

    public void updateEnderecoUsuario(EnderecoUsuario enderecoUsuario) {
        enderecoUsuarioRepository.updateEnderecoUsuario(enderecoUsuario);
    }

    public void deleteEnderecoUsuario(long id) {
        enderecoUsuarioRepository.deleteEnderecoUsuario(id);
    }
}