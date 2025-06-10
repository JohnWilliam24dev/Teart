package com.duckers.teart.entities;

import com.duckers.teart.entities.Object.Number;

public class ItemPedidoServico {
   
    private long id;

    private Number quantidade;

    private Servico servico;

    private long idServico;

    private Pedido pedido;

    private long idPedido;

    

    // Construtor padrão
    public ItemPedidoServico() {}

    // Construtor com parâmetros (sem o id)
    public ItemPedidoServico(int quantidade, Servico servico, Pedido pedido) {
        this.quantidade.setNumero(quantidade);
        this.servico = servico;
        this.pedido = pedido;
    }

    public void validation(){
        quantidade.verificarQuantidadePositiva();
    }
}
