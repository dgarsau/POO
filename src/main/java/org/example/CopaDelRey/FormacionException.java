package org.example.CopaDelRey;

public class FormacionException extends RuntimeException {
    public FormacionException() {
        super("Error. Fórmato incorrecto.");
    }
}
