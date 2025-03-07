package com.duckers.teart.enums;

public enum Moda {
    ALFAIATARIA("Alfaiataria"),
    NOIVA("Noiva"),
    FESTA("Festa"),
    COUTURE("Haute Couture"),
    CLASSICO("Clássico"),
    RETRO("Retrô"),
    VINTAGE("Vintage"),
    LUXO("Luxo"),
    MINIMALISTA("Minimalista"),
    ARTESANAL("Artesanal"),
    SOB_MEDIDA("Sob Medida");

    private String descricao;

    Moda(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
