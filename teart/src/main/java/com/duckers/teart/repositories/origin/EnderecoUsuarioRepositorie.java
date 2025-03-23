package com.duckers.teart.repositories.origin;

import com.duckers.teart.entities.EnderecoUsuario;
import com.duckers.teart.repositories.jpa.EnderecoUsuarioJpa;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class EnderecoUsuarioRepositorie {

    private final EnderecoUsuarioJpa enderecoUsuarioJpa;

    public EnderecoUsuarioRepositorie(EnderecoUsuarioJpa enderecoUsuarioJpa) {
        this.enderecoUsuarioJpa = enderecoUsuarioJpa;
    }

    public EnderecoUsuario getEnderecoUsuarioById(int id) {
        return this.enderecoUsuarioJpa.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado para o ID: " + id));
    }

    public List<EnderecoUsuario> getEnderecoUsuariosList() {
        return this.enderecoUsuarioJpa.findAll();
    }

    public void add(EnderecoUsuario enderecoUsuario) {
        this.enderecoUsuarioJpa.save(enderecoUsuario);
    }

    public void remove(int id) {
        if (this.enderecoUsuarioJpa.existsById(id)) {
            this.enderecoUsuarioJpa.deleteById(id);
        } else {
            throw new RuntimeException("Endereço não encontrado para o ID: " + id);
        }
    }

    public void update(int id, EnderecoUsuario enderecoUsuarioUpdate){
        if (enderecoUsuarioUpdate == null) {
            throw new IllegalArgumentException("Os dados para atualização não podem ser nulos.");
        }

        EnderecoUsuario enderecoUsuarioInDB = this.enderecoUsuarioJpa.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço não encontrado para o ID: " + id));

        enderecoUsuarioInDB.setIdUsuario(enderecoUsuarioUpdate.getIdUsuario());
        enderecoUsuarioInDB.setBairro(enderecoUsuarioUpdate.getBairro());
        enderecoUsuarioInDB.setCep(enderecoUsuarioUpdate.getCep());
        enderecoUsuarioInDB.setCidade(enderecoUsuarioUpdate.getCidade());
        enderecoUsuarioInDB.setEstado(enderecoUsuarioUpdate.getEstado());
        enderecoUsuarioInDB.setNumero(enderecoUsuarioUpdate.getNumero());
        enderecoUsuarioInDB.setRua(enderecoUsuarioUpdate.getRua());

        this.enderecoUsuarioJpa.save(enderecoUsuarioInDB);
    }
}
