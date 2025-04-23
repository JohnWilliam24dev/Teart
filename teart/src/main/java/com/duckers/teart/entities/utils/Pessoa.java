package com.duckers.teart.entities.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Pessoa {
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com|com\\.br|org|org\\.br|net|edu|gov|gov\\.br|io|tech)$"
    );
    private static final Pattern TELEFONE_PATTERN = Pattern.compile("^\\d{11}$");
    private static final Pattern CPF_PATTERN = Pattern.compile("^\\d{11}$");
    private static final Set<String> DDD_VALIDOS = new HashSet<>(Arrays.asList(
            "11", "12", "13", "14", "15", "16", "17", "18", "19",
            "21", "22", "24", "27", "28",
            "31", "32", "33", "34", "35", "37", "38",
            "41", "42", "43", "44", "45", "46",
            "47", "48", "49",
            "51", "53", "54", "55",
            "61", "62", "64", "63", "65", "66", "67",
            "68", "69",
            "71", "73", "74", "75", "77", "79",
            "81", "82", "83", "84", "85", "86", "87", "88", "89",
            "91", "92", "93", "94", "95", "96", "97", "98", "99"
    ));

    public static boolean validaNome(String nome) {
        if(nome == null || nome.trim().isEmpty())
            return false;
        return true;
    }

    public static void validaEmail(String email) {
        if(email == null || !EMAIL_PATTERN.matcher(email).matches()){
            throw new IllegalArgumentException("Email Invalido: Verifique o formato do email");
        }
         
    }

    public static void validarSenha(String senha){
    
        if (senha.length() < 8) {
            throw new IllegalArgumentException("A senha deve ter no mínimo 8 caracteres.");
        }
        if (!senha.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("A senha deve conter pelo menos uma letra maiúscula.");
        }
        if (!senha.matches(".*[a-z].*")) {
            throw new IllegalArgumentException("A senha deve conter pelo menos uma letra minúscula.");
        }
        if (!senha.matches(".*\\d.*")) {
            throw new IllegalArgumentException("A senha deve conter pelo menos um número.");
        }
        if (!senha.matches(".*[^a-zA-Z0-9].*")) {
            throw new IllegalArgumentException("A senha deve conter pelo menos um caractere especial.");
        }
        
    }

    public static boolean validaTelefone(String telefone) {
        if (telefone == null || !TELEFONE_PATTERN.matcher(telefone).matches())
            return false;
        String ddd = telefone.substring(0, 2);
        if (!DDD_VALIDOS.contains(ddd))
            return false;
        return true;
    }

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