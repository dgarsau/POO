package org.example.CopaDelRey.Mantenimiento;

import java.util.Scanner;

public class AppMantenimiento {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        menuMantenimiento();
    }

    public static void menuMantenimiento(){
        System.out.println("=== App de mantenimiento del MUTXAMEL FC === \n\n" +
                "\t [1]. Mantenimiento de jugadores\n" +
                "\t [4]. Consultar equipos\n\n" +
                "============================================");
        char eleccion=eleccionMenu();
        switchMenu(eleccion);
    }

    public static char eleccionMenu(){
        System.out.print("\nSelecciona una opción -->");
        return entrada.next().toUpperCase().charAt(0);
    }

    public static void switchMenu(char eleccion){
        switch (eleccion){
            case '1':
                MantenimientoJugadores.menuJugadores();
                break;
            case '4':
                ConsultarEquipos.menuEquipos();
                break;
            case 'X':
                System.out.println("Cerrando el programa...");
                System.exit(0);
        }
    }

}
