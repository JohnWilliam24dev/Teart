package com.duckers.teart.repositorie;
import com.duckers.teart.entities.EnderecoUsuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
@Repository
public class EnderecoUsuarioRepositorie {
    List<EnderecoUsuario> enderecoUsuarios = new ArrayList<>();

    public EnderecoUsuario getEnderecoUsuarioById(int id) {
        return enderecoUsuarios.stream().filter(enderecoUsuario -> enderecoUsuario.getId() == id).findFirst().orElse(null);
    }

    public void add(EnderecoUsuario enderecoUsuario) {
        enderecoUsuarios.add(enderecoUsuario);
    }

    public void remove(int id) {
        EnderecoUsuario enderecoUsuario = getEnderecoUsuarioById(id);
        if (!enderecoUsuario.equals(null))
            enderecoUsuarios.remove(enderecoUsuario);
    }

    public void update(int id, EnderecoUsuario enderecoUsuarioUpdate){
        EnderecoUsuario enderecoUsuario  = getEnderecoUsuarioById(id);
        enderecoUsuario.setBairro(enderecoUsuarioUpdate.getBairro());
        enderecoUsuario.setCep(enderecoUsuarioUpdate.getCep());
        enderecoUsuario.setCidade(enderecoUsuarioUpdate.getCidade());
        enderecoUsuario.setEstado(enderecoUsuarioUpdate.getEstado());
        enderecoUsuario.setNumero(enderecoUsuarioUpdate.getNumero());
        enderecoUsuario.setRua(enderecoUsuarioUpdate.getRua());
    }

    public List<EnderecoUsuario> getEnderecoUsuariosList() {
        return enderecoUsuarios;
    }
}