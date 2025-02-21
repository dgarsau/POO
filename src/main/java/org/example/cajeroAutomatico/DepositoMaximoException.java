package org.example.cajeroAutomatico;

public class DepositoMaximoException extends RuntimeException {

    public DepositoMaximoException() {
        super("Deposito máximo superado (3000€)");
    }
}
