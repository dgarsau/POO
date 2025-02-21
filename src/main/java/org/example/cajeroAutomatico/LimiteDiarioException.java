package org.example.cajeroAutomatico;

public class LimiteDiarioException extends RuntimeException {

  public LimiteDiarioException() {
        super("Límite máximo superado (600€)");
    }
}
