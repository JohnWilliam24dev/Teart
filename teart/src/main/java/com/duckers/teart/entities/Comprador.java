package com.duckers.teart.entities;

import com.duckers.teart.entities.Object.*;

import java.util.ArrayList;
import java.util.List;

public class Comprador {

    private long id;

    private Text nome;

    private Email email;

    private Senha senha;

    private List<Pedido> pedidos = new ArrayList<>();

    private List<EnderecoUsuario> enderecoUsuarioList;

    public Comprador() {
    }

    public Comprador(String nome, String email, String senha) {
        this.nome.setText(nome);
        this.email.setEmail(email);
        this.senha.setSenha(senha);
    }



    // Validações
    public void validarNome(String nome) {
        Generic.verificarNaoNuloOuVazio(nome);
        Generic.verificarTamanhoMaximo(nome, 500);
    }

    public void validarEmail(String email){
        Generic.verificarNaoNuloOuVazio(email);
        Generic.verificarTamanhoMaximo(email, 500);
        Pessoa.validaEmail(email);
    }

    public void validarSenha(String senha){
        Pessoa.validarSenha(senha);
    }

}
