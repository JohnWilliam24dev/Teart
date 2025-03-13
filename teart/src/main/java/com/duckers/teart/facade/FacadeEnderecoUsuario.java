package com.duckers.teart.facade;
import java.util.List;



import com.duckers.teart.application.EnderecoUsuarioApplication;
import com.duckers.teart.entities.EnderecoUsuario;
import org.springframework.stereotype.Component;
@Component
public class FacadeEnderecoUsuario {

private EnderecoUsuarioApplication applicationEnderecoUsuario;

    public FacadeEnderecoUsuario(EnderecoUsuarioApplication applicationEnderecoUsuario){
        this.applicationEnderecoUsuario = applicationEnderecoUsuario;
    }

    public void cadastrar(EnderecoUsuario EnderecoUsuario){
        applicationEnderecoUsuario.createEnderecoUsuario(EnderecoUsuario);
    }

    public void atualizar(int id, EnderecoUsuario enderecoUsuario){
        applicationEnderecoUsuario.updateEnderecoUsuario(id, enderecoUsuario);
    }

    public List<EnderecoUsuario> ListaEnderecoUsuarios(){
        return applicationEnderecoUsuario.getAllEnderecoUsuarios();
    }

    public EnderecoUsuario buscarEnderecoUsuarioPorId(int id){
        return applicationEnderecoUsuario.getEnderecoUsuarioById(id);
    }

    public void excluir(int id){
        applicationEnderecoUsuario.deleteEnderecoUsuario(id);
    }
}
