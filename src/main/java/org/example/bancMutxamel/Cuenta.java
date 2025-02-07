package org.example.bancMutxamel;

import lombok.*;

@Getter @Setter
@ToString
public class Cuenta {

    private int contador_iban=0;

    private String iban;
    private Cliente titular;
    private double saldo;

    public Cuenta(){
        contador_iban++;
        setIban();
        saldo=0;
    }

    private void setIban() {
        this.iban=String.format("ES%X3d", contador_iban);
    }






}
