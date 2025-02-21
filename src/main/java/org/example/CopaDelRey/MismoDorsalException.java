package org.example.CopaDelRey;

public class MismoDorsalException extends RuntimeException {
    public MismoDorsalException() {
        super("Error. Ya existe el dorsal.");
    }
}
