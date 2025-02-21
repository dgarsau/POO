package org.example.CopaDelRey;

public class Jugador extends MutxamelFC{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria=categoria;
        this.dorsal=dorsal;
        this.posicion=posicion;
    }

    public void calentar(){

    }

    public void descansar(){

    }

    public void marcarGol(){

    }

    @Override
    public void concentrarse() {
        System.out.println("Jugador: " + super.getNombre() + " concentrándose para el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Jugador: " + super.getNombre() + " viajando a " + ciudad + "...");
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOL");
    }
}
