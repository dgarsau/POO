package org.example.practica1;

import java.time.LocalDate;
import java.util.Scanner;

public class Entrada {

    static Scanner entrada = new Scanner(System.in);

    public static LocalDate entradaFecha(){

        String[] arrayfecha = new String[3];
        int[] arrayfechaint = new int[3];
        String fechastring;
        boolean error = true;

        while (error) {
            System.out.println("Introduce la fecha de visita: (dd-mm-aaaa)");
            fechastring = entrada.next();
            if(!fechastring.matches("\\d{2}-\\d{2}-\\d{4}")){
                System.out.println("ERROR. Formato de fecha incorrecto");
            } else {
                arrayfecha = fechastring.split("-");
                error=false;
            }
        }

        for (int i = 0; i < arrayfecha.length; i++) {
            arrayfechaint[i]=Integer.parseInt(arrayfecha[i]);
        }

        LocalDate fecha = LocalDate.of(arrayfechaint[2], arrayfechaint[1], arrayfechaint[0]);
        return fecha;

    }

    public static void separador(){
        System.out.println("____________________________________________");
    }

}
