package com.duckers.teart.models;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;


@Entity
@Table(name="servicos")
public class ServicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private BigDecimal valorMaximo;

    @Column
    private BigDecimal valorMinimo;




    @ManyToOne 
    @JoinColumn(name = "id_atelier", nullable = false, insertable = false, updatable=false)
    private AtelierModel atelier;

    @Column(name = "id_atelier")
    private long idAtelier;

    @OneToMany(mappedBy = "servico")
    private List<ItemPedidoServicoModel> itemPedidoServicoList;

    // Construtor padrão
    public ServicoModel() {}

    // Construtor com parâmetros
    public ServicoModel(AtelierModel atelier, String nome, String descricao, BigDecimal valorMaximo, BigDecimal valorMinimo) {
        this.atelier = atelier;
        this.nome = nome;
        this.descricao = descricao;
        this.valorMaximo = valorMaximo;
        this.valorMinimo = valorMinimo;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValorMaximo() {
        return valorMaximo;
    }

    public BigDecimal getValorMinimo() {
        return valorMinimo;
    }

    public long getIdAtelier() {
        return idAtelier;
    }

   

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorMaximo(BigDecimal valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public void setValorMinimo(BigDecimal valorMinimo) {
        this.valorMinimo = valorMinimo;
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

    public List<ItemPedidoServicoModel> getItemPedidoServicoList() {
        return itemPedidoServicoList;
    }

    public void setItemPedidoServicoList(List<ItemPedidoServicoModel> itemPedidoServicoList) {
        this.itemPedidoServicoList = itemPedidoServicoList;
    }
}
