package org.example.cajeroAutomatico;

import java.util.Scanner;

public class CuentaBancaria {

    static final Scanner entrada = new Scanner(System.in);
    private double saldo;

    public CuentaBancaria(double saldo){
        this.saldo=saldo;
    }

    public void ingresar(){
        System.out.println("Introduce el importe a ingresar: ");
        saldo=saldo+entrada.nextDouble();
        System.out.println("Dinero ingresado con éxito. Saldo actual: " + saldo);
    }

    public void retirar(){
        System.out.println("Introduce el importe a retirar: ");
        saldo=saldo-entrada.nextDouble();
        System.out.println("Dinero retirado con éxito. Saldo actual: " + saldo);
    }

    public void consultarSaldo(){
        System.out.println("Saldo disponible: " + saldo);
    }



}
