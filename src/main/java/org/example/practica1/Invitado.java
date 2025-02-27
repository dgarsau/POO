package org.example.practica1;

import java.time.LocalDate;

public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        setFecha_visita();
        this.temporada = temporada;
    }

    public void setFecha_visita() {
        this.fecha_visita = Entrada.entradaFecha();
    }


    //GETTERS SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String toString(){
        return "Invitado (Nombre: " + nombre + ", Profesion:" + profesion + ", Fecha de visita: " + fecha_visita + ", Temporada: " + temporada + ")";
    }

}
