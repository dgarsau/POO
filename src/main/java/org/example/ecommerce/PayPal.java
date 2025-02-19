package org.example.ecommerce;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PayPal extends MetodoPago{

    static final String FORMATO_CORREO = "\\b[\\w.%-]+@[-.\\w]+\\.com";

    static Scanner entrada = new Scanner(System.in);
    static Random random = new Random();

    private String correo;
    private double saldo;

    public PayPal() {
        construirPaypal();
    }

    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de importe " + importe + "€ con PayPal");
    }

    public void introducirDatos(){
        System.out.println("Introduce los datos de tu PayPal:");
        System.out.println("Correo electrónico:");
        String numero = entrada.next();
        this.correo = numero;
    }

    public boolean validarPaypal(String correo, double saldo) {
        System.out.println("Validando PayPal...");
        if (!correo.matches(FORMATO_CORREO)){
            System.out.println("ERROR. Formato de correo incorrecto.");
            return false;
        } else if (saldo<0) {
            System.out.println("ERROR. Saldo incorrecto.");
            return false;
        } else{
            return true;
        }
    }

    public void construirPaypal(){
        boolean formato=false;
        while(!formato){
            introducirDatos();
            formato=validarPaypal(correo, saldo);
            entrada.nextLine();
        }
        this.saldo=random.nextInt(0,1000000)/100.0;
        System.out.println("Saldo: " + saldo);
    }

    public boolean validarPago(double importe, double saldo){
        if(importe<saldo){
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

}
