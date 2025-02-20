package org.example.DispositivosInteligentes;

import java.util.ArrayList;

public class AppDispositivos {

    public static void main(String[] args) {

        Televisor samsung = new Televisor("Samsung");
        samsung.encender();
        samsung.encender();
        samsung.sincronizar();

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("LG SMART"));
        listaDispositivos.add(new ParlanteInteligente("Alexa"));
        listaDispositivos.add(new AireAcondicionado("Condicioneiro"));
        listaDispositivos.add(new Televisor("Samsung comedor"));

        for (Dispositivo dispositivo : listaDispositivos){
            dispositivo.encender();

            if(dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();

            System.out.println("---------------------------------------");
        }


    }

}
