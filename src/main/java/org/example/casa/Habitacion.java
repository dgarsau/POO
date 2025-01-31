package org.example.casa;

import java.util.ArrayList;

public class Habitacion {
    private String nombre;
    private double metrosCuadrados;
    private ArrayList<Electrodomestico> electrodomesticos;

    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados=metrosCuadrados;
        this.electrodomesticos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void agregarElectrodomestico(String nombre, double consumo) {

        for (Electrodomestico elec : electrodomesticos){
            if(elec.getNombre().equals(nombre)){
                System.out.println("ERROR. El electrodoméstico ya existe.");
                return;
            }
        }

        Electrodomestico electrodomestico = new Electrodomestico(nombre, consumo); //solamente la Casa crea las habitaciones
        electrodomesticos.add(electrodomestico);
    }

//    public void eliminarElectrodomestico(String nombre) {
//
//        for (Electrodomestico elec : electrodomesticos){
//            if(elec.getNombre().equals(nombre)){
//                electrodomesticos.remove(elec);
//                System.out.println("Electrodoméstico eliminado");
//                return;
//            }
//        }
//
//        System.out.println("El electrodoméstico no existe, no se puede borrar.");
//
//    }

    public void mostrarElectrodomésticos() {

        System.out.println("Electrodomésticos de " + nombre + ": ");
        for (Electrodomestico elec: electrodomesticos){
            System.out.println("- " + elec.getNombre() + " (" + elec.getConsumo() + " kWh)");
        }
    }

    public double calcularConsumo() {
        double total=0;

        for (Electrodomestico elec: electrodomesticos){
            total+=elec.getConsumo();
        }

        return total;
    }



    @Override
    public String toString() {
        return nombre + " (" + metrosCuadrados + ") m2";
    }
}
