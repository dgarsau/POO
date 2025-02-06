package org.example.practica1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        listaProgramas = new ArrayList<>();
    }

    public void insertarPrograma(Programa programa) {
        listaProgramas.add(programa);
    }

    public void invitadoAntes(String nombre){

        LocalDate fechaanterior = LocalDate.of(3000,1,1);
        Programa programaanterior = new Programa(null, this, null);

        for (Programa programa: listaProgramas){
            for (Invitado invitado: programa.getListaInvitados()){
                if(!programa.buscarInvitado(nombre)){
                    System.out.println("El invitado no ha ido a " + programa.getNombre());
                    break;
                } else {
                    if(invitado.getFecha_visita().isBefore(fechaanterior)){
                        fechaanterior=invitado.getFecha_visita();
                        programaanterior=programa;
                    }
                }
            }
        }

        System.out.println("El invitado " + nombre + " estuvo antes en " + programaanterior.getNombre() + " (El día " + fechaanterior + ")");

    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Cadena: " + nombre + ", Programas:" + listaProgramas;
    }

}
