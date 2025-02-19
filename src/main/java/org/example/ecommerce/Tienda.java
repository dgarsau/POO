package org.example.ecommerce;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tienda {

    private static final String[] METODOS = {"BIZUM", "PAYPAL", "TARJETA"};
    static Scanner entrada = new Scanner(System.in);


    public static void iniciarPago(){
        double importe;
        String metodo=elegirMetodo();
        switch (metodo){
            case "BIZUM":
                boolean error = false;
                Bizum bizum = new Bizum();
                while(!error){
                    System.out.println("Introduce el PIN: ");
                    try {
                        error = bizum.validarBizum(entrada.nextInt());
                    } catch (InputMismatchException e){
                        System.out.println("ERROR. PIN no válido.");
                        entrada.nextLine();
                    }
                }
                importe=introducirImporte();
                bizum.procesarPago(importe);
                break;

            case "PAYPAL":
                PayPal paypal = new PayPal();
                importe=introducirImporte();
                boolean pago = paypal.validarPago(importe, paypal.getSaldo());
                if (pago){
                    paypal.procesarPago(importe);
                } else {
                    System.out.println("No se pudo procesar el pago. SALDO INSUFICIENTE");
                }
                break;

            case "TARJETA":
                TarjetaCredito tarjeta = new TarjetaCredito();
                importe=introducirImporte();
                tarjeta.procesarPago(importe);
                break;

            default:
                System.exit(0);
        }

    }

    public static String elegirMetodo(){
        String metodo="";
        do {
            System.out.println("¿Qué método de pago quieres usar? [Bizum, Paypal, Tarjeta]");
            metodo = entrada.next().toUpperCase();
            if (!Arrays.asList(METODOS).contains(metodo)){
                System.out.println("ERROR. Método no válido.");
            }
        } while (!Arrays.asList(METODOS).contains(metodo));
        return metodo;
    }

    public static double introducirImporte(){
        double importe=-1;

        do{
            System.out.println("Introduce el importe a pagar:");
            try {
                importe= entrada.nextDouble();
                if(importe<=0){
                    System.out.println("ERROR. Importe no válido.");
                }
            } catch (InputMismatchException e){
                System.out.println("ERROR. Importe incorrecto.");
                entrada.nextLine();
            }
        }while (importe<=0);

        return importe;
    }

}
