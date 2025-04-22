package com.duckers.teart.entities;
import com.duckers.teart.entities.enums.Moda;
import com.duckers.teart.entities.enums.Tamanho;

import java.util.List;


public class Produto {

    private long id;

    private Moda moda;

    private Tamanho tamanho;

    private String nome;

    private double preco;

    private Atelier atelier;

    private long idAtelier;


    private List<ItemPedidoProduto> itemPedidoProdutoList;

    // Construtor padrão
    public Produto(){}

    // Construtor com parâmetros (sem o id)
    public Produto(Moda moda, Tamanho tamanho, String nome, double preco, Atelier atelier) {
        this.moda = moda;
        this.tamanho = tamanho;
        this.nome = nome;
        this.preco = preco;
        this.atelier = atelier;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public Moda getModa() {
        return moda;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public long getIdAtelier() {
        return idAtelier;
    }

    

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setModa(Moda moda) {
        this.moda = moda;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setIdAtelier(long idAtelier) {
        this.idAtelier = idAtelier;
    }
}
