package com.duckers.teart.entities;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import com.duckers.teart.enums.Moda;
import com.duckers.teart.enums.Tamanho;

import java.util.List;

@JsonIdentityInfo(scope = Produto.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name="produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    // formatar enum para o banco
    private Moda moda;

    @Column
    // formatar enum para o banco
    private Tamanho tamanho;

    @Column
    private String nome;

    @Column
    private double preco;

//    uso incorreto do CascadeType abaixo (veja descricao melhor em "entities/Servico")
//    @ManyToOne(cascade = { CascadeType.PERSIST })

    @ManyToOne // uso correto: sem cascata
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
