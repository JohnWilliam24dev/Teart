package com.duckers.teart.entities;



public class ItemPedidoServico {
   
    private long id;

    private int quantidade;

    private Servico servico;

    private long idServico;

    private Pedido pedido;

    private long idPedido;

    

    // Construtor padrão
    public ItemPedidoServico() {}

    // Construtor com parâmetros (sem o id)
    public ItemPedidoServico(int quantidade, Servico servico, Pedido pedido) {
        this.quantidade = quantidade;
        this.servico = servico;
        this.pedido = pedido;
    }

    // GETTERS
    public long getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public long getIdServico() {
        return idServico;
    }

    public long getIdPedido() {
        return idPedido;
    }

    

    // SETTERS
    public void setId(long id) {
        this.id = id;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setIdServico(long idServico) {
        this.idServico = idServico;
    }
    
    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }
}
