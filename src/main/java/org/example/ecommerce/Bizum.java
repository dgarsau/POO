package org.example.ecommerce;

import java.util.Random;

public class Bizum extends MetodoPago{

    public static Random random = new Random();

    private String telefono;
    private int pin;

    public Bizum() {
        construirBizum();
    }

    @Override
    void procesarPago(double importe) {

    }

    public void introducirDatos(){

    }

    public void construirBizum(){

    }

}
