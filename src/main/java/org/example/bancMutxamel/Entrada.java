package org.example.bancMutxamel;

import java.util.Scanner;

public class Entrada {

    public static char eleccionMenu(){

    Scanner entrada = new Scanner(System.in);
    char eleccion = entrada.next().charAt(0);

    if (Character.isDigit(eleccion)) {
        return eleccion;
    } else return 'X';

    }

}
