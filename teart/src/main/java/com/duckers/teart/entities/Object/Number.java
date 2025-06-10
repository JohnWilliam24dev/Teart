package com.duckers.teart.entities.Object;

public class Number {
    Integer numero;

    public Number(Integer numero) {
        this.numero = numero;
    }

    public void verificarQuantidadePositiva() {
        if (numero == null || numero <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
    }
}
