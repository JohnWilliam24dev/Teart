package com.duckers.teart.entities.Object;

public class CEP {
    private String cep;
    public CEP(String cep) {
    this.cep=cep;
    }
    private boolean validaCep(String cep) {
        if (cep == null || cep.isBlank())
            return false;
        if (cep.length() != 8)
            return false;
        return true;
    }
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "CEP{" +
                "cep='" + cep + '\'' +
                '}';
    }
}
