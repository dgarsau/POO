package org.example.CopaDelRey.Mantenimiento;

import org.example.CopaDelRey.Equipos;

public class ConsultarEquipos {

    public static void menuEquipos(){
        System.out.println("\n=== LISTADO DE EQUIPOS ===\n"+
                "\t[1]. BENJAMIN\n"+
                "\t[2].ALEVIN\n"+
                "\t[3].INFANTIL\n"+
                "\t[4].CADETE\n"+
                "\t[5].JUVENIL\n"+
                "\t[6].SENIOR\n" +
                "\t[X]. Volver al menú principal \n\n"+
                "========================================="
            );

        char eleccion = AppMantenimiento.eleccionMenu();
        switchConsultar(eleccion);

    }

    public static void switchConsultar(char eleccion){

        switch (eleccion){
            case '1':
                break;
            case '2':
                break;
            case '3':
                break;
            case '4':
                break;
            case '5':
                break;
            case '6':
                mostrarInfo(Equipos.SENIOR);
                break;
            default:
                AppMantenimiento.menuMantenimiento();
                break;
        }
    }

    public static void mostrarInfo(Equipos equipo){

    }

}
