package com.duckers.teart.entities.utils;

import java.math.BigDecimal;

public class NumericValueValidator {

    public static void verificarValorPositivo(BigDecimal valor) {
        if (valor == null) {
            throw new IllegalArgumentException("O valor não pode ser nulo.");
        }

        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
    }

    public static void verificarValorEntre(BigDecimal valor, BigDecimal minimo, BigDecimal maximo) {
        if (valor == null) {
            throw new IllegalArgumentException("O valor não pode ser nulo.");
        }

        if (valor.compareTo(minimo) < 0 || valor.compareTo(maximo) > 0) {
            throw new IllegalArgumentException("O valor deve estar entre " + minimo + " e " + maximo + ".");
        }
    }

    public static void verificarQuantidadePositiva(Integer quantidade) {
        if (quantidade == null || quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
    }

    public static void verificarDuasCasasDecimais(BigDecimal valor) {
        if (valor == null) {
            throw new IllegalArgumentException("O valor não pode ser nulo.");
        }

        if (valor.scale() > 2) {
            throw new IllegalArgumentException("O valor não pode ter mais que duas casas decimais.");
        }
    }
}
