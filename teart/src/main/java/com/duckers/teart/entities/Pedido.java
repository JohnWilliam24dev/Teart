package com.duckers.teart.entities;

import com.duckers.teart.enums.FormaPagamento;
import com.duckers.teart.enums.StatusPedido;
import jakarta.persistence.*;

@Table(name="pedidos")
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false) // FK para Usuario
    private Usuario usuario;

    @Column(name="id_item_pedido") // FK -> @ManyToOne
    private long idItemPedido;

    @Column(name="data_pedido")
    private String dataPedido;

    @Column(name="data_envio")
    private String dataEnvio;

    @Column(name="status_pedido")
    private StatusPedido statusPedido;

    @Column(name="forma_pagamento")
    private FormaPagamento formaPagamento;

    @Column(name="valor_total")
    private double valorTotal;

    public Pedido() { // construtor da JPA

    }

    public Pedido(int id, Usuario Usuario, int idItemPedido, String dataPedido, String dataEnvio,
    StatusPedido statusPedido, FormaPagamento formaPagamento, double valorTotal) {
        this.id = id;
        this.usuario = Usuario;
        this.idItemPedido = idItemPedido;
        this.dataPedido = dataPedido;
        this.dataEnvio = dataEnvio;
        this.statusPedido = statusPedido;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
    }

    public long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public long getIdItemPedido() {
        return idItemPedido;
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

    public void setId(long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setIdItemPedido(long idItemPedido) {
        this.idItemPedido = idItemPedido;
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
}
