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
    public static void verificarValorPositivo(double valor) {
        
        if (Double.isNaN(valor) || Double.isInfinite(valor)) {
            throw new IllegalArgumentException("O valor deve ser um número finito.");
        }
    
        if (valor <= 0.0) {
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
    public static void verificarValorEntre(double valor, double minimo, double maximo) {
        
        if (Double.isNaN(valor) || Double.isInfinite(valor) ||
            Double.isNaN(minimo) || Double.isInfinite(minimo) ||
            Double.isNaN(maximo) || Double.isInfinite(maximo)) {
            throw new IllegalArgumentException("Todos os valores devem ser números finitos.");
        }
    
        
        if (minimo > maximo) {
            throw new IllegalArgumentException("O valor mínimo não pode ser maior que o máximo.");
        }
    
        
        if (valor < minimo || valor > maximo) {
            throw new IllegalArgumentException(
                String.format("O valor deve estar entre %.2f e %.2f.", minimo, maximo)
            );
        }
    }
    

    public static void verificarQuantidadePositiva(Integer quantidade) {
        if (quantidade == null || quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
    }
    public static void verificarMaiorQueZero(Integer quantidade) {
        if (quantidade == null || quantidade < 0) {
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
    public static void verificarDuasCasasDecimais(double valor) {
        
        if (Double.isNaN(valor) || Double.isInfinite(valor)) {
            throw new IllegalArgumentException("O valor deve ser um número finito.");
        }
    
        
        BigDecimal bd = BigDecimal.valueOf(valor)
                                 .stripTrailingZeros(); 
    
        int scale = bd.scale() < 0 ? 0 : bd.scale(); 
    
        if (scale > 2) {
            throw new IllegalArgumentException(
                String.format("O valor não pode ter mais que duas casas decimais (encontradas: %d).", scale)
            );
        }
    }

    public static void verificarValorMinMax(Double minimo, Double maximo) {
        if (minimo == null || maximo == null) {
            throw new IllegalArgumentException("Mínimo e máximo não podem ser nulos.");
        }
        if (maximo < minimo) {
            throw new IllegalArgumentException(
                String.format("O valor máximo (%s) não pode ser menor que o mínimo (%s).", 
                              maximo, minimo)
            );
        }
    }
}
