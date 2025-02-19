package org.example.ecommerce;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago{

    static final String FORMATO_TELEFONO = "\\d{9}";

    static Scanner entrada = new Scanner(System.in);
    static Random random = new Random();

    private String telefono;
    private int pin;

    public Bizum() {
        construirBizum();
    }

    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de importe " + importe + "€ con bizum: " + telefono);
    }

    public void introducirDatos(){
        System.out.println("Introduce los datos de tu bizum:");
        System.out.println("Número de telefono:");
        String telefono = entrada.nextLine().replace(" ", "");
        this.telefono = telefono;
    }

    public void construirBizum(){
        boolean formato=false;
        while(!formato){
            introducirDatos();
            formato=validarBizum(telefono);
        }
        this.pin=random.nextInt(0,999999);
        System.out.println("PIN: " + this.pin);
    }

    public boolean validarBizum(String telefono){
        System.out.println("Validando bizum...");
        if(!telefono.matches(FORMATO_TELEFONO)){
            System.out.println("ERROR. Número de teléfono incorrecto.");
            return false;
        } else {
            return true;
        }
    }

    public boolean validarBizum(int pin){
        if(this.pin!=pin){
            System.out.println("PIN INCORRECTO.");
            return false;
        } else {
            System.out.println("PIN CORRECTO.");
            return true;
        }
    }

}
