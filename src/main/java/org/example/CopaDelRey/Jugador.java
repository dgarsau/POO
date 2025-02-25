package org.example.CopaDelRey;

public class Jugador extends MutxamelFC implements AccionesDeportivas{

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
        System.out.println("Jugador " + super.getNombre() + " calentando...");
    }

    public void descansar(){
        System.out.println("Jugador " + super.getNombre() + " descansando...");
    }

    public void marcarGol(){
        System.out.println("Jugador " + super.getNombre() + " ha marcado un gol");
    }

    @Override
    public void concentrarse() {
        System.out.println("Jugador " + super.getNombre() + " concentrándose para el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Jugador " + super.getNombre() + " viajando a " + ciudad + "...");
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOL");
    }

    @Override
    public void entrenar() {
        System.out.println("Jugador " + super.getNombre() + " entrenando");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Jugador " + super.getNombre() + " jugando un partido contra el " + rival);
    }
}
