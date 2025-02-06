package org.example.practica1;

import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String director) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.director = new Empleado(director, "director", null);
        this.listaInvitados = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        listaEmpleados.add(this.director);
        cadena.insertarPrograma(this);
    }

    public void insertarEmpleado(String nombre, String cargo) {

        Empleado empleado = new Empleado(nombre, cargo, director);
        listaEmpleados.add(empleado);

    }

    public void insertarInvitado(String nombre, String profesion, int temporada) {
        System.out.println("Visita de " + nombre + " a " + this.nombre);
        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);

    }

    public void invitadosTemporada(int temporada){

        int totalinvitados=0;

        System.out.println("Invitados de la temporada " + temporada + ":");
        for (Invitado invitado: listaInvitados){
            if(invitado.getTemporada()==temporada){
                System.out.println(invitado);
                totalinvitados++;
            }
        }

        System.out.println("Han venido " + totalinvitados + " invitados a la temporada " + temporada + ".");

    }

    public void vecesInvitado(String nombre){

        int totalveces=0;

        for (Invitado invitado: listaInvitados){
            if(invitado.getNombre()==nombre){
                totalveces++;
            }
        }

        System.out.println(nombre + " ha venido " + totalveces + " veces a " + this.nombre);

    }

    public void rastrearVeces(String nombre){

        vecesInvitado(nombre);

        for (Invitado invitado: listaInvitados){
            if(invitado.getNombre()==nombre){
                System.out.println("Vino en la temporada " + invitado.getTemporada() + " el día " + invitado.getFecha_visita());
            }
        }

    }

    public boolean buscarInvitado(String nombre){

        for (Invitado invitado: listaInvitados){
            if(invitado.getNombre()==nombre){
                return true;
            }
        }
        return false;
    }


    //GETTERS SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString(){
        return "Programa: " + nombre + ", Cadena: " + cadena.getNombre() + ", Director: " + director + ", Temporadas: " + temporadas + ", Empleados: " + listaEmpleados + ", Invitados: " + listaInvitados;
    }

}

