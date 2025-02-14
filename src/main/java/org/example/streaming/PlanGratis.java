package org.example.streaming;

public class PlanGratis extends Suscripcion{

    public PlanGratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    void obtenerBeneficios() {
        System.out.println("Acceso limitado con anuncios.");
    }
}
