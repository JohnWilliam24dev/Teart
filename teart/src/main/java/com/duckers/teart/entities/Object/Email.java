package com.duckers.teart.entities.Object;

import java.util.regex.Pattern;

public class Email {
    String Email;

    public Email(String email) {
        Email = email;
    }
    public Email(){}
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    private final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com|com\\.br|org|org\\.br|net|edu|gov|gov\\.br|io|tech)$"
    );
    public void validaEmail() {
        if(Email == null || !EMAIL_PATTERN.matcher(Email).matches()){
            throw new IllegalArgumentException("Email Invalido: Verifique o formato do email");
        }

    }
}
