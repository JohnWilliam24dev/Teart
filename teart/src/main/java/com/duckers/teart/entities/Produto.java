package com.duckers.teart.entities;

import jakarta.persistence.*;
import com.duckers.teart.enums.Moda;
import com.duckers.teart.enums.Tamanho;

import java.util.List;

@Entity
@Table(name="produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private Moda moda;

    @Column
    private Tamanho tamanho;

    @Column
    private String nome;

    @Column
    private double preco;

    @ManyToOne(cascade = { CascadeType.PERSIST })
    @JoinColumn(name = "id_atelier", referencedColumnName = "id")
    private Atelier atelier;

    @OneToMany(mappedBy = "produto")
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

    public Atelier getAtelier() {
        return atelier;
    }

    public List<ItemPedidoProduto> getItemPedidoProdutoList() {
        return itemPedidoProdutoList;
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

    public void setAtelier(Atelier atelier) {
        this.atelier = atelier;
    }

    public void setItemPedidoProdutoList(List<ItemPedidoProduto> itemPedidoProdutoList) {
        this.itemPedidoProdutoList = itemPedidoProdutoList;
    }
}
