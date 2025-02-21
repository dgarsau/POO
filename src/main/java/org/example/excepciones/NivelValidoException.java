package org.example.excepciones;

public class NivelValidoException extends Exception{

    public NivelValidoException(){
        super("El nivel no puede ser mayor a 100.");
    }
}
