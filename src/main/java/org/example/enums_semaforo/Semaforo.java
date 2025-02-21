package org.example.enums_semaforo;

public enum Semaforo {

    AMARILLO,
    ROJO,
    VERDE;

    public Semaforo siguiente(Semaforo actual){
        switch (actual){
            case AMARILLO:
                return Semaforo.ROJO;
            case ROJO:
                return Semaforo.VERDE;
            case VERDE:
                return Semaforo.AMARILLO;
            default:
                return Semaforo.ROJO;
        }
    }


}
