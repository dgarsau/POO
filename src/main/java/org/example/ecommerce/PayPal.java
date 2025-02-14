package org.example.ecommerce;

import java.util.Arrays;
import java.util.Scanner;

public class PayPal extends MetodoPago{

    public static Scanner entrada = new Scanner(System.in);
    private static final String FORMATO_CORREO = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";

    private String correo;
    private double saldo;

    public PayPal() {
        construirPaypal();
    }

    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de importe " + importe + " con PayPal");
    }

    public void introducirDatos(){
        System.out.println("Introduce los datos de tu PayPal:");
        System.out.println("Correo electrónico:");
        String numero = entrada.next();
        this.correo = numero;
    }

    public boolean validarPaypal(String correo) {
        System.out.println("Validando PayPal...");
        if (!correo.matches(FORMATO_CORREO)){
            System.out.println("ERROR. Formato de correo incorrecto.");
            return false;
        } else{
            return true;
        }
    }

    public void construirPaypal(){
        boolean formato=false;
        while(!formato){
            introducirDatos();
            formato=validarPaypal(correo);
            entrada.nextLine();
        }
    }

    public void validarPago(){

    }

}
