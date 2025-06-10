package com.duckers.teart.entities.Object;

import java.util.regex.Pattern;

public class CPF {
    private static final Pattern CPF_PATTERN = Pattern.compile("^\\d{11}$");










    public static void validaCpf(String cpf) {
        if(cpf == null || !CPF_PATTERN.matcher(cpf).matches()){
            throw new IllegalArgumentException("CPF Invalido: CPF não segue a formatação padrão");
        }

        if (isCpfInvalido(cpf)){
            throw new IllegalArgumentException("CPF Invalido: CPF não segue o padrão");
        }

    }

    private static boolean isCpfInvalido(String cpf) {
        if (cpf.chars().distinct().count() == 1)
            return true;
        int digito1 = calcularDigitoVerificador(cpf, 10);
        int digito2 = calcularDigitoVerificador(cpf, 11);
        return digito1 != (cpf.charAt(9) - '0') || digito2 != (cpf.charAt(10) - '0');
    }

    private static int calcularDigitoVerificador(String cpf, int pesoInicial) {
        int soma = 0;
        for (int i = 0; i < pesoInicial - 1; i++) {
            int num = cpf.charAt(i) - '0';
            soma += num * (pesoInicial - i);
        }
        int resto = (soma * 10) % 11;
        return (resto == 10) ? 0 : resto;
    }
}
