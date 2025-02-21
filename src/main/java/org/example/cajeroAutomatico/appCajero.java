package org.example.cajeroAutomatico;

import java.util.Random;
import java.util.Scanner;

public class appCajero {

    static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(500);
        menuCajero();


    }

    public static void menuCajero(){

        System.out.println("=== Cajero Automático ===\n");
        System.out.println("\t[1]. Consultar saldo");
        System.out.println("\t[2]. Ingresar dinero");
        System.out.println("\t[3]. Retirar dinero");
        System.out.println("\t[X]. Salir\n");

        eleccionCajero();
    }

    public static void eleccionCajero(){
        System.out.println("Selecciona una opción");
        switchEleccion(entrada.next().charAt(0));
    }

    public static void switchEleccion(char eleccion){

        switch (eleccion){
            case '1':
                
            case '2':

            case '3':

            default:
                System.out.println("Cerrando programa...");
                System.exit(0);
        }

    }




}


