package com.duckers.teart.entities.Object;

import java.util.regex.Pattern;

public class Email {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com|com\\.br|org|org\\.br|net|edu|gov|gov\\.br|io|tech)$"
    );
    public static void validaEmail(String email) {
        if(email == null || !EMAIL_PATTERN.matcher(email).matches()){
            throw new IllegalArgumentException("Email Invalido: Verifique o formato do email");
        }

    }
}
