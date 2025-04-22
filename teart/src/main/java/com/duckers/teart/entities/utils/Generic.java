package com.duckers.teart.entities.utils;

public class Generic {

    public static void verificarNaoNuloOuVazio(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("O valor não pode ser nulo ou vazio.");
        }
    }

    public static void verificarTamanhoExato(String valor, int tamanhoEsperado) {
        if (valor == null || valor.length() != tamanhoEsperado) {
            throw new IllegalArgumentException("O valor deve ter exatamente " + tamanhoEsperado + " caracteres.");
        }
    }

    public static void verificarSomenteNumeros(String valor) {
        if (valor == null || !valor.matches("\\d+")) {
            throw new IllegalArgumentException("O valor deve conter apenas números.");
        }
    }

    public static void verificarTamanhoMinimo(String valor, int minimo) {
        if (valor == null || valor.length() < minimo) {
            throw new IllegalArgumentException("O valor deve ter pelo menos " + minimo + " caracteres.");
        }
    }
}
