package org.example.festival;

public class EdadMinimaException extends Exception{

    public EdadMinimaException(){
        super("No puede crear a una persona menor de edad.");
    }

}
