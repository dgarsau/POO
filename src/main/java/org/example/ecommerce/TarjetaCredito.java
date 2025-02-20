package org.example.ecommerce;

import java.util.Arrays;
import java.util.Scanner;

public class TarjetaCredito extends MetodoPago{

    static Scanner entrada = new Scanner(System.in);
    static final String[] TIPOS = {"VISA", "MASTERCARD", "MAESTRO"};
    static final int TAMANYO_TARJETA = 16;

    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito() {
        construirTarjeta();
    }

    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de importe " + importe + "€ con tarjeta de crédito " + tipo);
    }


    public void introducirDatos(){
        System.out.println("Introduce los datos de tu tarjeta:");
        System.out.println("Número (16 dígitos):");
        String numero = entrada.nextLine().replace(" ", "");
        this.nro_tarjeta = numero;
        System.out.println(nro_tarjeta + " " + nro_tarjeta.length());
        System.out.println("Tipo (VISA, MASTERCARD, MAESTRO):");
        this.tipo = entrada.next().toUpperCase();
    }

    public boolean validarTarjeta(String nro_tarjeta, String tipo){
        System.out.println("Validando tarjeta...");
        if (nro_tarjeta.length()!=TAMANYO_TARJETA || !Arrays.asList(TIPOS).contains(tipo)){
            System.out.println("Los datos de tu tarjeta no son correctos.");
            return false;
        }else{
            return true;
        }
    }

    public void construirTarjeta(){
        boolean formato=false;
        while(!formato){
            introducirDatos();
            formato=validarTarjeta(nro_tarjeta, tipo);
            entrada.nextLine();
        }
    }

}
