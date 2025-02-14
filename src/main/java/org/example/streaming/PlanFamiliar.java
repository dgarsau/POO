package org.example.streaming;

public class PlanFamiliar extends Suscripcion{

    public PlanFamiliar(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición.");
    }
}
