package com.duckers.teart.entities;
import com.duckers.teart.entities.enums.Moda;
import com.duckers.teart.entities.enums.Tamanho;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.List;

@JsonIdentityInfo(scope = Produto.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name="produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @Enumerated(EnumType.STRING)
    private Moda moda;

    @Column
    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;

    @Column
    private String nome;

    @Column
    private double preco;

//    uso incorreto do CascadeType abaixo (veja descricao melhor em "entities/Servico")
//    @ManyToOne(cascade = { CascadeType.PERSIST })

    @ManyToOne // uso correto: sem cascata
    @JoinColumn(name = "id_atelier", referencedColumnName = "id", insertable = false, updatable=false)
    private Atelier atelier;

    @Column(name = "id_atelier")
    private long idAtelier;

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

    public void setAtelier(Atelier atelier) {
        this.atelier = atelier;
    }

    public void setItemPedidoProdutoList(List<ItemPedidoProduto> itemPedidoProdutoList) {
        this.itemPedidoProdutoList = itemPedidoProdutoList;
    }
    
    public void setIdAtelier(long idAtelier) {
        this.idAtelier = idAtelier;
    }
}
