package com.duckers.teart.entities;

import com.duckers.teart.enums.Moda;
import com.duckers.teart.enums.Tamanho;

public class Produto {
    private int id, idAtelier;
    private Moda moda;
    private Tamanho tamanho;
    private String nome;
    private double preco;

    public Produto(int id, int idAtelier, Moda moda, Tamanho tamanho, String nome, double preco) {
        this.id = id;
        this.idAtelier = idAtelier;
        this.moda = moda;
        this.tamanho = tamanho;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public int getIdAtelier() {
        return idAtelier;
    }

    public String getModa() {
        return moda.getDescricao();
    }

    public String getTamanho() {
        return tamanho.getDescricao();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public void setModa(Moda moda) {
        this.moda = moda;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

