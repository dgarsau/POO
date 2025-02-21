package org.example.enums_semaforo;

public class mainSemaforo {

    public static void main(String[] args) {

        Semaforo estado = Semaforo.AMARILLO;

        for (int i = 0; i < 10; i++) {
            estado = estado.siguiente(estado);
            System.out.println(estado);
        }

    }
}

