package com.duckers.teart.entities;
import com.duckers.teart.enums.TipoProdutoServico;

public class ItemPedido {
    private int id, idProduto, idServico, idPedido, quantidade;
    TipoProdutoServico tipoProdutoServico;

    public ItemPedido(int id, int idProduto, int idServico, int idPedido, int quantidade, TipoProdutoServico tipoProdutoServico) {
        this.id = id;
        this.idProduto = idProduto;
        this.idServico = idServico;
        this.idPedido = idPedido;
        this.quantidade = quantidade;
        this.tipoProdutoServico = tipoProdutoServico;
    }

    public int getId() {
        return id;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getIdServico() {
        return idServico;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public TipoProdutoServico getTipoProdutoServico() {
        return tipoProdutoServico;
    }
}
