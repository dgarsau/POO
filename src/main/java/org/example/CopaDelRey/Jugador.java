package org.example.CopaDelRey;

import java.util.ArrayList;

public class Jugador extends MutxamelFC implements AccionesDeportivas{

    public static ArrayList<Jugador> jugadores = new ArrayList<>();

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria=categoria;
        setDorsal(dorsal, categoria);
        this.posicion=posicion;
        jugadores.add(this); //para controlar el dorsal
    }

    public void setDorsal(int dorsal, Equipos categoria) {
        for (Jugador jugador : jugadores){
            if (jugador.dorsal==dorsal && jugador.categoria==categoria){
                throw new MismoDorsalException();
            }
        }
        this.dorsal=dorsal;
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

    // Setters

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    // toString

    @Override
    public String toString() {
        return "[Nombre=" + super.getNombre() +
                ", edad=" + super.getEdad() +
                ", categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", posicion=" + posicion + "]"
                ;
    }



}
