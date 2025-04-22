package com.duckers.teart.entities.enums;


public enum FormaPagamento {
    PIX("Pix"),
    CARTAO("Cartao"),
    BOLETO("Boleto");

    private String descricao;
    FormaPagamento(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
