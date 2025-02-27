package org.example.CopaDelRey;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;

public class AppMutxamelFC {

    public static void main(String[] args) {


        ArrayList<MutxamelFC> integrantes = new ArrayList<>();

        // crear varios jugadores para el equipo SENIOR

        Jugador jugador1 = new Jugador("Juan", 20, Equipos.SENIOR, 1, Posiciones.DELANTERO);
        Jugador jugador2 = new Jugador("Paco", 23, Equipos.SENIOR, 2, Posiciones.PORTERO);
        integrantes.add(jugador1);
        integrantes.add(jugador2);

        // crear al entrenador del equipo SENIOR
        Entrenador entrenador = new Entrenador("Daniel", 24, Equipos.SENIOR, "4-3-3");
        integrantes.add(entrenador);

        // crear a los masajistas del club
        Masajista masajista1 = new Masajista("Demetrio", 47, "Fisioterapia", 2);
        Masajista masajista2 = new Masajista("Xavi", 32, "FP Masajes", 10);
        integrantes.add(masajista1);
        integrantes.add(masajista2);

        // crear a algún acompañante para un par de jugadores
        Acompanyante acompanyante1 = new Acompanyante("Manuel", 28, jugador1, "Primo");
        Acompanyante acompanyante2 = new Acompanyante("Manolo", 29, jugador2, "Primo");
        integrantes.add(acompanyante1);
        integrantes.add(acompanyante2);

        // concentrarse()
        for (MutxamelFC integrante : integrantes){
            integrante.concentrarse();
        }
        separarLinea();

        // entrenar()
        for (MutxamelFC integrante : integrantes){
            if(integrante instanceof AccionesDeportivas){
                ((AccionesDeportivas) integrante).entrenar();
            }
        }
        separarLinea();

        // darMasaje() a algún jugador
        masajista1.darMasaje(jugador1);
        separarLinea();

        // planificarEntrenamiento()
        for (MutxamelFC integrante : integrantes){
            if(integrante instanceof AccionesDeportivas){
                ((AccionesDeportivas) integrante).entrenar();
            }
        }
        separarLinea();

        // viajar() a Madrid
        for (MutxamelFC integrante : integrantes){
            integrante.viajar("Madrid");
        }
        separarLinea();

        // planificarEntrenamiento()
        for (MutxamelFC integrante : integrantes){
            if(integrante instanceof Entrenador){
                ((Entrenador) integrante).entrenar();
            }
        }
        separarLinea();

        // entrenar()
        for (MutxamelFC integrante : integrantes){
            if(integrante instanceof AccionesDeportivas){
                ((AccionesDeportivas) integrante).entrenar();
            }
        }
        separarLinea();

        // descansar()
        for (MutxamelFC integrante : integrantes){
            if(integrante instanceof Jugador){
                ((Jugador) integrante).descansar();
            }
        }
        separarLinea();

        // calentar()
        for (MutxamelFC integrante : integrantes){
            if(integrante instanceof Jugador){
                ((Jugador) integrante).calentar();
            }
        }
        separarLinea();

        // jugarPartido()
        for (MutxamelFC integrante : integrantes){
            if(integrante instanceof Jugador){
                ((Jugador) integrante).jugarPartido("FC Monóvar");
            }
        }
        separarLinea();

        // animarEquipo()
        for (MutxamelFC integrante : integrantes){
            if(integrante instanceof Acompanyante){
                ((Acompanyante) integrante).animarEquipo();
            }
        }
        separarLinea();

        // hacerCambios()
        for (MutxamelFC integrante : integrantes){
            if(integrante instanceof Entrenador){
                ((Entrenador) integrante).hacerCambios();
            }
        }
        separarLinea();

        // marcarGol()
        for (MutxamelFC integrante : integrantes){
            if(integrante instanceof Jugador){
                ((Jugador) integrante).marcarGol();
            }
        }
        separarLinea();

        // celebrarGol()
        for (MutxamelFC integrante : integrantes){
            integrante.celebrarGol();
        }
        separarLinea();

        // darMasaje() a varios jugadores
        for (MutxamelFC integrante : integrantes){
            if(integrante instanceof Jugador) {
                masajista1.darMasaje((Jugador) integrante);
            }
        }
        separarLinea();

        // viajar() a Mutxamel
        for (MutxamelFC integrante : integrantes){
            integrante.viajar("Mutxamel");
        }
        separarLinea();

        // descansar()
        for (MutxamelFC integrante : integrantes){
            if(integrante instanceof Jugador){
                ((Jugador) integrante).descansar();
            }
        }
        separarLinea();

    }

    public static void separarLinea(){
        System.out.println("-------------------------------------------------");
    }
}