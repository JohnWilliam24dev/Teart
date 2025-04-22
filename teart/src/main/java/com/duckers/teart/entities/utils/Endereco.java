package com.duckers.teart.entities.utils;

public class Endereco {
    public static boolean validaCep(String cep) {
        if (cep == null || cep.isBlank())
            return false;
        if (cep.length() != 8)
            return false;
        return true;
    }

    public static boolean validaEndereco(String rua, String numero, String logradouro, String bairro, String cidade, String estado, String pais) {
        if (isNullOrEmpty(rua))
            return false;
        if (isNullOrEmpty(numero))
            return false;
        if (isNullOrEmpty(logradouro))
            return false;
        if (isNullOrEmpty(bairro))
            return false;
        if (isNullOrEmpty(cidade))
            return false;
        if (isNullOrEmpty(estado))
            return false;
        if (pais != null && pais.isBlank())
            return false;
        return true;
    }

    public static boolean validaEndereco(String rua, String numero, String logradouro, String bairro, String cidade, String estado) {
        if (isNullOrEmpty(rua))
            return false;
        if (isNullOrEmpty(numero))
            return false;
        if (isNullOrEmpty(logradouro))
            return false;
        if (isNullOrEmpty(bairro))
            return false;
        if (isNullOrEmpty(cidade))
            return false;
        if (isNullOrEmpty(estado))
            return false;
        return true;
    }

    private static boolean isNullOrEmpty(String valor) {
        return valor == null || valor.isBlank();
    }
}