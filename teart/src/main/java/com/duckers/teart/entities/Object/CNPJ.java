package com.duckers.teart.entities.Object;

public class CNPJ {
    Text cnpj = new Text();

    public CNPJ(String cnpj) {
        this.cnpj.setText(cnpj);
    }
    public CNPJ(){}
    public String getCNPJ() {
        return cnpj.getText();
    }

    public void setCNPJ(String cnpj) {
        this.cnpj.setText(cnpj);
    }

    public boolean validarCnpj() {
        if (cnpj.getText().chars().distinct().count() == 1) {
            return false;
        }

        int[] pesos1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma1 = 0;

        for (int i = 0; i < pesos1.length; i++) {
            soma1 += Character.getNumericValue(cnpj.getText().charAt(i)) * pesos1[i];
        }

        int resto1 = soma1 % 11;
        int primeiroDigito = (resto1 < 2) ? 0 : 11 - resto1;

        int[] pesos2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma2 = 0;

        for (int i = 0; i < pesos2.length; i++) {
            soma2 += Character.getNumericValue(cnpj.getText().charAt(i)) * pesos2[i];
        }

        int resto2 = soma2 % 11;
        int segundoDigito = (resto2 < 2) ? 0 : 11 - resto2;

        return (primeiroDigito == Character.getNumericValue(cnpj.getText().charAt(12)) &&
                segundoDigito == Character.getNumericValue(cnpj.getText().charAt(13)));
    }

    public void validarCnpjFormatado() {
        if (cnpj == null || !cnpj.getText().matches("\\d{14}")) {
            throw new IllegalArgumentException("CNPJ inválido: formato incorreto");
        }

        try {

            cnpj.verificarSomenteNumeros();
        } catch (Exception e) {
            throw new IllegalArgumentException("CNPJ inválido: CNPJ deve conter somente números");
        }

        if (!validarCnpj()) {
            throw new IllegalArgumentException("CNPJ inválido: Verifique se o número é válido");
        }
    }

}
