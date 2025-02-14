package org.example.streaming;

abstract class Suscripcion {

    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precio) {
        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }

    abstract void obtenerBeneficios();

}
