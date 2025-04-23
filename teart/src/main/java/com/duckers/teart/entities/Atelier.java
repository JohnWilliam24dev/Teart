package com.duckers.teart.entities;

import java.util.List;
import com.duckers.teart.entities.utils.Generic;

public class Atelier {

    private long id;
    private String nome;
    private String cnpj;
    private DonoAtelier donoAtelier;
    private long idDonoAtelier;
    private List<Servico> servicos;
    private List<Produto> produtos;
    private List<EnderecoAtelier> enderecosAtelier;

    // Construtor padrão
    public Atelier() {}

    // Construtor com parâmetros
    public Atelier(String nome, String cnpj, DonoAtelier donoAtelier) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.donoAtelier = donoAtelier;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public long getIdDonoAtelier() {
        return idDonoAtelier;
    }

    public DonoAtelier getDonoAtelier() {
        return donoAtelier;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<EnderecoAtelier> getEnderecosAtelier() {
        return enderecosAtelier;
    }

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setIdDonoAtelier(long idDonoAtelier) {
        this.idDonoAtelier = idDonoAtelier;
    }

    public void setDonoAtelier(DonoAtelier donoAtelier) {
        this.donoAtelier = donoAtelier;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setEnderecosAtelier(List<EnderecoAtelier> enderecosAtelier) {
        this.enderecosAtelier = enderecosAtelier;
    }

    
    public void validarNome(String nome) {
        Generic.verificarNaoNuloOuVazio(nome);
        Generic.verificarTamanhoMaximo(nome, 500);
    }

    public boolean validarCnpj(String cnpj) {
        if (cnpj.chars().distinct().count() == 1) {
            return false;
        }

        int[] pesos1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma1 = 0;

        for (int i = 0; i < pesos1.length; i++) {
            soma1 += Character.getNumericValue(cnpj.charAt(i)) * pesos1[i];
        }

        int resto1 = soma1 % 11;
        int primeiroDigito = (resto1 < 2) ? 0 : 11 - resto1;

        int[] pesos2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma2 = 0;

        for (int i = 0; i < pesos2.length; i++) {
            soma2 += Character.getNumericValue(cnpj.charAt(i)) * pesos2[i];
        }

        int resto2 = soma2 % 11;
        int segundoDigito = (resto2 < 2) ? 0 : 11 - resto2;

        return (primeiroDigito == Character.getNumericValue(cnpj.charAt(12)) &&
                segundoDigito == Character.getNumericValue(cnpj.charAt(13)));
    }

    public void validarCnpjFormatado(String cnpj) {
        if (cnpj == null || !cnpj.matches("\\d{14}")) {
            throw new IllegalArgumentException("CNPJ inválido: formato incorreto");
        }

        try {
            Generic.verificarSomenteNumeros(cnpj);
        } catch (Exception e) {
            throw new IllegalArgumentException("CNPJ inválido: CNPJ deve conter somente números");
        }

        if (!validarCnpj(cnpj)) {
            throw new IllegalArgumentException("CNPJ inválido: Verifique se o número é válido");
        }
    }
}
