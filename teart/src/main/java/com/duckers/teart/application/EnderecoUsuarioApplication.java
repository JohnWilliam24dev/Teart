package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.EnderecoUsuario;
import com.duckers.teart.repositorie.EnderecoUsuarioRepositorie;
import org.springframework.stereotype.Service;

@Service
public class EnderecoUsuarioApplication {
    private EnderecoUsuarioRepositorie enderecoUsuarioRepositorie;

    public EnderecoUsuarioApplication(EnderecoUsuarioRepositorie enderecoUsuarioRepositorie) {
        this.enderecoUsuarioRepositorie = enderecoUsuarioRepositorie;
    }

    public void createEnderecoUsuario(EnderecoUsuario enderecoUsuario) {
        enderecoUsuarioRepositorie.add(enderecoUsuario);
    }

    public EnderecoUsuario getEnderecoUsuarioById(int id) {
        return enderecoUsuarioRepositorie.getEnderecoUsuarioById(id);
    }

    public List<EnderecoUsuario> getAllEnderecoUsuarios() {
        return enderecoUsuarioRepositorie.getEnderecoUsuariosList();
    }

    public void updateEnderecoUsuario(int id, EnderecoUsuario enderecoUsuarioUpdate) {
        enderecoUsuarioRepositorie.update(id, enderecoUsuarioUpdate);
    }

    public void deleteEnderecoUsuario(int id) {
        enderecoUsuarioRepositorie.remove(id);
    }
}