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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Number getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Number quantidade) {
        this.quantidade = quantidade;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public long getIdServico() {
        return idServico;
    }

    public void setIdServico(long idServico) {
        this.idServico = idServico;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }
}
