package org.example.CopaDelRey.Mantenimiento;

import org.example.CopaDelRey.Equipos;
import org.example.CopaDelRey.Jugador;
import org.example.CopaDelRey.MismoDorsalException;
import org.example.CopaDelRey.Posiciones;

import java.util.ArrayList;
import java.util.Scanner;

public class MantenimientoJugadores {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Jugador> jugadores = new ArrayList<>();

    public static void menuJugadores(){
        System.out.println("\n=== MANTENIMIENTO DE JUGADORES ===\n"+
                "\t[1]. Añadir nuevo jugador\n"+
                "\t[2]. Modificar datos de jugador existente\n"+
                "\t[3]. Crear acompañantes (sólo seniors)\n"+
                "\t[X]. Volver al menú principal \n\n"+
                "========================================="
        );

        char eleccion = AppMantenimiento.eleccionMenu();
        switchJugadores(eleccion);

    }

    public static void switchJugadores(char eleccion){

        switch (eleccion){
            case '1':
                anyadirJugador();
                break;
            case '2':
                modificarJugador();
                break;
            case '3':
                crearAcompanyante();
                break;
            default:
                AppMantenimiento.menuMantenimiento();
                break;
        }
    }

    public static void anyadirJugador() {

        System.out.println("\n=== AÑADIR JUGADOR ===\n");
        System.out.println("Introduce el nombre:");
        String nombre = entrada.next();
        System.out.println("Introduce la edad:");
        int edad = entrada.nextInt();
        System.out.println("Introduce la categoria:");
        Equipos equipo = Equipos.valueOf(entrada.next().toUpperCase());
        System.out.println("Introduce el dorsal:");
        int dorsal = entrada.nextInt();
        System.out.println("Introduce la posicion:");
        Posiciones posicion = Posiciones.valueOf(entrada.next().toUpperCase());

        Jugador jugador = new Jugador(nombre, edad, equipo, dorsal, posicion);
        jugadores.add(jugador);
        System.out.println("\nJUGADOR AÑADIDO");

        menuJugadores();
    }

    public static void modificarJugador() {
        System.out.println("\n=== MODIFICAR JUGADOR ===\n");
        System.out.println("De qué jugador quieres hacer cambios?\n");
        int posicion = 0;

        for (Jugador jugador : jugadores){
            System.out.println(posicion + ". " + jugador);
            posicion++;
        }

        System.out.println("Selecciona una opción");
        int opcion = entrada.nextInt();
        Jugador jugador = jugadores.get(opcion);

        System.out.println("Modificando jugador " + jugador + "\n");
        System.out.println("Qué quieres modificar? [nombre,edad,categoria,dorsal,posicion]");
        String atributo = entrada.next();

        switch (atributo){
            case "nombre":
                System.out.println("Nuevo nombre:");
                jugador.setNombre(entrada.next());
                break;
            case "edad":
                System.out.println("Nuevo edad:");
                jugador.setEdad(entrada.nextInt());
                break;
            case "categoria":
                System.out.println("Nuevo categoría:");
                jugador.setCategoria(Equipos.valueOf(entrada.next()));
                break;
            case "dorsal":
                System.out.println("Nuevo dorsal:");
                try {
                    jugador.setDorsal(entrada.nextInt(), jugador.getCategoria());
                } catch (MismoDorsalException e) {
                    System.out.println("Lo siento! Ese dorsal ya está ocupado por un jugador del mismo equipo (" + jugador.getCategoria() + ")");;
                }
                break;
            case "posicion":
                System.out.println("Nueva posición:");
                jugador.setPosicion(Posiciones.valueOf(entrada.next()));
                break;
            default:
                System.out.println("Opción no válida.");
        }
        menuJugadores();
    }

    public static void crearAcompanyante() {


    }

    public static void separador(){
        System.out.println("----------------------------------------");
    }

}
