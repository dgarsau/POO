package org.example.CopaDelRey;

public class Entrenador extends MutxamelFC{

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo=equipo;
        this.formacionPreferida=formacionPreferida;
    }

    public void planificarEntrenamiento(){

    }

    public void hacerCambios(){

    }

    @Override
    public void concentrarse() {
        System.out.println("Entrenador: " + super.getNombre() + " concentrándose para el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Entrenador: " + super.getNombre() + " viajando a " + ciudad + "...");
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOL");
    }
}
