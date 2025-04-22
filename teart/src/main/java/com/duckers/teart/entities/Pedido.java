package com.duckers.teart.entities;

import com.duckers.teart.entities.enums.FormaPagamento;
import com.duckers.teart.entities.enums.StatusPedido;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import java.util.List;




public class Pedido {

    private long id;


    private LocalDate dataPedido;

    private LocalDate dataEnvio;

    private StatusPedido statusPedido;

    private FormaPagamento formaPagamento;

    private double valorTotal; // testar itemped.qtd * preco + itemser.qtd * preco

    private Usuario usuario;

    private long idUsuario;

    private List<ItemPedidoProduto> itemPedidoProdutoList;

    private List<ItemPedidoServico> itemPedidoServicoList;

    // Construtor padrão da JPA
    public Pedido() {
    }

    // Construtor com parâmetros (sem as listas de itens de pedido)
    public Pedido(LocalDate dataPedido, LocalDate dataEnvio, StatusPedido statusPedido, FormaPagamento formaPagamento, double valorTotal, Usuario usuario) {
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

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public LocalDate getDataEnvio() {
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

    public long getIdUsuario() {
        return idUsuario;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setDataEnvio(LocalDate dataEnvio) {
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

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    
}
