package com.duckers.teart.enums;

public enum TipoProdutoServico {
    PRODUTO("Produto"),
    SERVICO("Servico");

    private String descricao;
    TipoProdutoServico(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
