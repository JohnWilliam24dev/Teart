package com.duckers.teart.entities.Object;

public class Text {
    String text;
    public Text(String text) {
        this.text=text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    private boolean isNullOrEmpty(String valor) {

        return valor == null || valor.isBlank();
    }

    public void verificarSomenteNumeros(String valor) {
        if (valor == null || !valor.matches("\\d+")) {
            throw new IllegalArgumentException("O valor deve conter apenas números.");
        }
    }

    public void verificarTamanhoMaximo(String valor, int maximo) {
        if (valor == null || valor.length() > maximo) {
            throw new IllegalArgumentException("O valor deve ter pelo menos " + maximo + " caracteres.");
        }
    }


    public void verificarTamanhoExato(String valor, int tamanhoEsperado) {
        if (valor == null || valor.length() != tamanhoEsperado) {
            throw new IllegalArgumentException("O valor deve ter exatamente " + tamanhoEsperado + " caracteres.");
        }
    }

    public static void verificarTamanhoMinimo(String valor, int minimo) {
        if (valor == null || valor.length() < minimo) {
            throw new IllegalArgumentException("O valor deve ter pelo menos " + minimo + " caracteres.");
        }
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                '}';
    }
}
