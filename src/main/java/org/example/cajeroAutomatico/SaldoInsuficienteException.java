package org.example.cajeroAutomatico;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException(){
        super("Saldo insuficiente.");
    }

}
