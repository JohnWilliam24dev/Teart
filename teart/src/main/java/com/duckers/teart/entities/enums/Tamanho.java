package com.duckers.teart.entities.enums;

public enum Tamanho {
    PP("Pechinho pequeno"),
    P("Pequeno"),
    M("Médio"),
    G("Grande"),
    GG("Grande G"),
    EXG("Extra Grande");

    private String descricao;

    Tamanho(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {return descricao; }
}
