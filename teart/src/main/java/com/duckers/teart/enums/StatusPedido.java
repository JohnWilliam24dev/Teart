package com.duckers.teart.enums;

public enum StatusPedido {
    PENDENTE("Pendente"),
    PROCESSANDO("Em processamento"),
    ENVIADO("Enviado"),
    ENTREGUE("Entregue"),
    CANCELADO("Cancelado");

    private String descricao;
    StatusPedido(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
