package com.duckers.teart.entities;

import com.duckers.teart.entities.Object.Money;
import com.duckers.teart.entities.enums.FormaPagamento;
import com.duckers.teart.entities.enums.StatusPedido;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Pedido {

    private long id;

    private LocalDate dataPedido;

    private LocalDate dataEnvio;

    private StatusPedido statusPedido;

    private FormaPagamento formaPagamento;

    private Money valorTotal; // testar itemped.qtd * preco + itemser.qtd * preco

    private Comprador comprador;

    private long idUsuario;

    private List<ItemPedidoProduto> itemPedidoProdutoList;

    private List<ItemPedidoServico> itemPedidoServicoList;

    // Construtor padrão da JPA
    public Pedido() {
    }

    // Construtor com parâmetros (sem as listas de itens de pedido)
    public Pedido(LocalDate dataPedido, LocalDate dataEnvio, StatusPedido statusPedido, FormaPagamento formaPagamento, BigDecimal valorTotal, Comprador comprador) {
        this.dataPedido = dataPedido;
        this.dataEnvio = dataEnvio;
        this.statusPedido = statusPedido;
        this.formaPagamento = formaPagamento;
        this.valorTotal.setNumero(valorTotal);
        this.comprador = comprador;
    }


    public void validarDatas() {
        if (dataPedido == null) {
            throw new IllegalArgumentException("A data do pedido não pode ser nula.");
        }
        if (dataEnvio != null && dataEnvio.isBefore(dataPedido)) {
            throw new IllegalArgumentException(
                String.format("A data de envio (%s) não pode ser anterior à data do pedido (%s).",
                              dataEnvio, dataPedido)
            );
        }
    }

}
