package com.duckers.teart.entities;

import java.util.ArrayList;
import java.util.List;

import com.duckers.teart.entities.utils.Generic;
import com.duckers.teart.entities.utils.Pessoa;

public class Usuario {

    private long id;

    private String nome;

    private String email;

    private String senha;

    private List<Pedido> pedidos = new ArrayList<>();

    private List<EnderecoUsuario> enderecoUsuarioList;

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public List<EnderecoUsuario> getEnderecoUsuarioList() {
        return enderecoUsuarioList;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setEnderecoUsuarioList(List<EnderecoUsuario> enderecoUsuarioList) {
        this.enderecoUsuarioList = enderecoUsuarioList;
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
