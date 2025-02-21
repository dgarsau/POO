package org.example.CopaDelRey;

public class AppMutxamelFC {

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Juan", 20, Equipos.SENIOR, 3, Posiciones.DELANTERO)
        Jugador jugador2 = new Jugador("Paco", 23, Equipos.SENIOR, 1, Posiciones.PORTERO),

        Entrenador entrenador = new Entrenador("Daniel", 24, Equipos.SENIOR, "4-3-3");

        Masajista[] masajistas = {
                new Masajista("Demetrio", 47, "Fisioterapia", 2),
                new Masajista("Chaby", 32, "FP Masajes", 10)
        };

        Acompanyante acompanyante1 = new Acompanyante("Manuel", 28, jugador1, "Primo");
        Acompanyante acompanyante2 = new Acompanyante("Manolo", 29, jugador2, "Primo");

        

    }
}
