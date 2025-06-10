package com.duckers.teart.entities;

import com.duckers.teart.entities.Object.*;
import com.duckers.teart.entities.Object.Number;

public class ItemPedidoProduto {

    private long id;

    private Number quantidade;

    private Produto produto;

    private long idProduto; 

    private Pedido pedido;

    private long idPedido;

 
    public ItemPedidoProduto() {}

    public ItemPedidoProduto(int quantidade, Produto produto, Pedido pedido) {
        this.quantidade.setNumero(quantidade);
        this.produto = produto;
        this.pedido = pedido;
    }

    public void validation(){
        quantidade.verificarQuantidadePositiva();
    }

}
