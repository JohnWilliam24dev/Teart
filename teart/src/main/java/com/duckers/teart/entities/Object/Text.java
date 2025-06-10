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
    private boolean isNullOrEmpty(String text) {

        return text == null || text.isBlank();
    }

    public void verificarSomenteNumeros() {
        if (text == null || !text.matches("\\d+")) {
            throw new IllegalArgumentException("O text deve conter apenas números.");
        }
    }

    public void verificarTamanhoMaximo(int maximo) {
        if (text == null || text.length() > maximo) {
            throw new IllegalArgumentException("O text deve ter pelo menos " + maximo + " caracteres.");
        }
    }


    public void verificarTamanhoExato(int tamanhoEsperado) {
        if (text == null || text.length() != tamanhoEsperado) {
            throw new IllegalArgumentException("O text deve ter exatamente " + tamanhoEsperado + " caracteres.");
        }
    }

    public void verificarTamanhoMinimo(int minimo) {
        if (text == null || text.length() < minimo) {
            throw new IllegalArgumentException("O text deve ter pelo menos " + minimo + " caracteres.");
        }
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                '}';
    }
}
