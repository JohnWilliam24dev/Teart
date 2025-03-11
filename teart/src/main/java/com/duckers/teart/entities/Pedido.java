package com.duckers.teart.entities;
import com.duckers.teart.enums.FormaPagamento;
import com.duckers.teart.enums.StatusPedido;

public class Pedido {
    private int id, idUsuario, idItemPedido;
    private String dataPedido, dataEnvio;
    private StatusPedido statusPedido; // enum
    private FormaPagamento formaPagamento; // enum
    private double valorTotal;

    public Pedido(int id, int idUsuario, int idItemPedido, String dataPedido, String dataEnvio,
    StatusPedido statusPedido, FormaPagamento formaPagamento, double valorTotal) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idItemPedido = idItemPedido;
        this.dataPedido = dataPedido;
        this.dataEnvio = dataEnvio;
        this.statusPedido = statusPedido;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdItemPedido() {
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

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
