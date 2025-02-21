package org.example.CopaDelRey;

public class Masajista extends MutxamelFC{

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
    }

    public void darMasaje(Jugador jugador){

    }

    @Override
    public void concentrarse() {
        System.out.println("Masajista: " + super.getNombre() + " concentrándose para el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Masajista: " + super.getNombre() + " viajando a " + ciudad + "...");
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOL");
    }
}
