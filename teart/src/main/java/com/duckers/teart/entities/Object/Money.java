package com.duckers.teart.entities.Object;

import java.math.BigDecimal;

public class Money {
    private final BigDecimal numero;

    public Money(BigDecimal numero) {
        this.numero = numero;
    }

    public void verificarnumeroPositivo() {
        if (numero == null) {
            throw new IllegalArgumentException("O numero não pode ser nulo.");
        }

        if (numero.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O numero deve ser maior que zero.");
        }
    }

    public void verificarnumeroEntre(BigDecimal minimo, BigDecimal maximo) {
        if (numero == null) {
            throw new IllegalArgumentException("O numero não pode ser nulo.");
        }

        if (numero.compareTo(minimo) < 0 || numero.compareTo(maximo) > 0) {
            throw new IllegalArgumentException("O numero deve estar entre " + minimo + " e " + maximo + ".");
        }
    }
    public void verificarDuasCasasDecimais(BigDecimal numero) {
        if (numero == null) {
            throw new IllegalArgumentException("O numero não pode ser nulo.");
        }

        if (numero.scale() > 2) {
            throw new IllegalArgumentException("O numero não pode ter mais que duas casas decimais.");
        }
    }
}
