package com.duckers.teart.entities.Object;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Telefone {

    String telefone;
    public Telefone(){}
    public Telefone(String telefone) {
        this.telefone = telefone;
    }

    private final Pattern TELEFONE_PATTERN = Pattern.compile("^\\d{11}$");
    private final Set<String> DDD_VALIDOS = new HashSet<>(Arrays.asList(
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
    public  boolean validaTelefone(String telefone) {
        if (telefone == null || !TELEFONE_PATTERN.matcher(telefone).matches())
            return false;
        String ddd = telefone.substring(0, 2);
        return DDD_VALIDOS.contains(ddd);
    }
    @Override
    public String toString() {
        return "Telefone{" +
                "telefone='" + telefone + '\'' +
                '}';
    }
}
