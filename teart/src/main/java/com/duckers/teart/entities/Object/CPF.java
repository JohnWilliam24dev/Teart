package com.duckers.teart.entities.Object;

import java.util.regex.Pattern;

public class CPF {
    String cpf;

    public CPF(String cpf) {
        this.cpf = cpf;
    }
    public CPF(){}
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private static final Pattern CPF_PATTERN = Pattern.compile("^\\d{11}$");


    public void validaCpf() {
        if(cpf == null || !CPF_PATTERN.matcher(cpf).matches()){
            throw new IllegalArgumentException("CPF Invalido: CPF não segue a formatação padrão");
        }

        if (isCpfInvalido()){
            throw new IllegalArgumentException("CPF Invalido: CPF não segue o padrão");
        }

    }

    private boolean isCpfInvalido() {
        if (cpf.chars().distinct().count() == 1)
            return true;
        int digito1 = calcularDigitoVerificador( 10);
        int digito2 = calcularDigitoVerificador( 11);
        return digito1 != (cpf.charAt(9) - '0') || digito2 != (cpf.charAt(10) - '0');
    }

    private int calcularDigitoVerificador(int pesoInicial) {
        int soma = 0;
        for (int i = 0; i < pesoInicial - 1; i++) {
            int num = cpf.charAt(i) - '0';
            soma += num * (pesoInicial - i);
        }
        int resto = (soma * 10) % 11;
        return (resto == 10) ? 0 : resto;
    }
}
