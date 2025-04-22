package com.duckers.teart.models;
import com.duckers.teart.models.enums.Moda;
import com.duckers.teart.models.enums.Tamanho;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="produtos")
public class ProdutoModel {

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

    @ManyToOne // uso correto: sem cascata
    @JoinColumn(name = "id_atelier", referencedColumnName = "id", insertable = false, updatable=false)
    private AtelierModel atelier;

    @Column(name = "id_atelier")
    private long idAtelier;

    @OneToMany(mappedBy = "produto")
    private List<ItemPedidoProdutoModel> itemPedidoProdutoList;

    // Construtor padrão
    public ProdutoModel(){}

    // Construtor com parâmetros (sem o id)
    public ProdutoModel(Moda moda, Tamanho tamanho, String nome, double preco, AtelierModel atelier) {
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
