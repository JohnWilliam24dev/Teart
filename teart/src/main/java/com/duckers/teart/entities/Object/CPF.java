package com.duckers.teart.entities.Object;

import java.util.regex.Pattern;

public class CPF {
    private String cpf;

    public CPF() {}

    public CPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private static final Pattern CPF_PATTERN = Pattern.compile("^\\d{11}$");

    public void validaCpf() {
        System.out.println("[DEBUG] Validando CPF: " + cpf);

        if (cpf == null || !CPF_PATTERN.matcher(cpf).matches()) {
            throw new IllegalArgumentException("CPF Invalido: CPF não segue a formatação padrão");
        }


    }

    private boolean isCpfInvalido() {
        // Rejeita se todos os dígitos forem iguais
        if (cpf.chars().distinct().count() == 1) {
            return true;
        }

        // Calcula os dígitos verificadores
        int d1 = calcularDigito(cpf.substring(0, 9), 10);
        int d2 = calcularDigito(cpf.substring(0, 9) + d1, 11);

        return d1 != Character.getNumericValue(cpf.charAt(9)) ||
                d2 != Character.getNumericValue(cpf.charAt(10));
    }

    private int calcularDigito(String str, int pesoInicial) {
        int soma = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            soma += num * (pesoInicial - i);
        }
        int resto = (soma * 10) % 11;
        return (resto == 10 || resto == 11) ? 0 : resto;
    }
}
