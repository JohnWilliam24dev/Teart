package com.duckers.teart.entities;

import com.duckers.teart.enums.FormaPagamento;
import com.duckers.teart.enums.StatusPedido;
import jakarta.persistence.*;

import java.util.List;

@Table(name="pedidos")
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String dataPedido;

    @Column
    private String dataEnvio;

    @Column
    private StatusPedido statusPedido;

    @Column
    private FormaPagamento formaPagamento;

    @Column
    private double valorTotal;

    @ManyToOne(cascade = { CascadeType.PERSIST})
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private Usuario usuario;

    @OneToMany(mappedBy = "pedido", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ItemPedidoProduto> itemPedidoProdutoList;

    @OneToMany(mappedBy = "pedido", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<ItemPedidoServico> itemPedidoServicoList;

    // Construtor padrão da JPA
    public Pedido() {
    }

    // Construtor com parâmetros (sem as listas de itens de pedido)
    public Pedido(String dataPedido, String dataEnvio, StatusPedido statusPedido, FormaPagamento formaPagamento, double valorTotal, Usuario usuario) {
        this.dataPedido = dataPedido;
        this.dataEnvio = dataEnvio;
        this.statusPedido = statusPedido;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
        this.usuario = usuario;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<ItemPedidoProduto> getItemPedidoProdutoList() {
        return itemPedidoProdutoList;
    }

    public List<ItemPedidoServico> getItemPedidoServicoList() {
        return itemPedidoServicoList;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setItemPedidoProdutoList(List<ItemPedidoProduto> itemPedidoProdutoList) {
        this.itemPedidoProdutoList = itemPedidoProdutoList;
    }

    public void setItemPedidoServicoList(List<ItemPedidoServico> itemPedidoServicoList) {
        this.itemPedidoServicoList = itemPedidoServicoList;
    }
}
