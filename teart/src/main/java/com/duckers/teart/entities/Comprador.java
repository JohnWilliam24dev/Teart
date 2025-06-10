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
    public void validation(){
        nome.verificarTamanhoMaximo();
        nome.isNullOrEmpty();
        email.validaEmail();
        senha.validarSenha();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Text getNome() {
        return nome;
    }

    public void setNome(Text nome) {
        this.nome = nome;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<EnderecoUsuario> getEnderecoUsuarioList() {
        return enderecoUsuarioList;
    }

    public void setEnderecoUsuarioList(List<EnderecoUsuario> enderecoUsuarioList) {
        this.enderecoUsuarioList = enderecoUsuarioList;
    }
}
