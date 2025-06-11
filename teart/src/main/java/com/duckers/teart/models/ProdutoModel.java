package com.duckers.teart.models;
import com.duckers.teart.enums.Moda;
import com.duckers.teart.enums.Tamanho;
import jakarta.persistence.*;

import java.math.BigDecimal;
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
    private BigDecimal preco;

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
    public ProdutoModel(Moda moda, Tamanho tamanho, String nome, BigDecimal preco, AtelierModel atelier) {
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

    public BigDecimal getPreco() {
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

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setIdAtelier(long idAtelier) {
        this.idAtelier = idAtelier;
    }

    public AtelierModel getAtelier() {
        return atelier;
    }

    public void setAtelier(AtelierModel atelier) {
        this.atelier = atelier;
    }

    public List<ItemPedidoProdutoModel> getItemPedidoProdutoList() {
        return itemPedidoProdutoList;
    }

    public void setItemPedidoProdutoList(List<ItemPedidoProdutoModel> itemPedidoProdutoList) {
        this.itemPedidoProdutoList = itemPedidoProdutoList;
    }
}
