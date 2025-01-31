package org.example.casa;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    Scanner entrada = new Scanner(System.in);

    private String direccion;

    private ArrayList<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setPropietario();
    }

    public void agregarHabitacion(String nombre, double metros) {

        for (Habitacion hab : habitaciones){
            if(hab.getNombre().equals(nombre)){
                System.out.println("ERROR. La habitación ya existe.");
                return;
            }
        }

        Habitacion habitacion = new Habitacion(nombre, metros); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);
    }

    public void eliminarHabitacion(String nombre) {

        for (Habitacion hab : habitaciones){
            if(hab.getNombre().equals(nombre)){
                habitaciones.remove(hab);
                System.out.println("Habitación " + nombre + " eliminada.");
                return;
            }
        }

        System.out.println("La habitación no existe, no se puede borrar.");

    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene " + habitaciones.size()+ " habitaciones:");
        System.out.println("Propietario: " + propietario.getNombre());
        for (Habitacion hab: habitaciones){
            System.out.println("- " + hab.getNombre() + " (" + hab.getMetrosCuadrados() + " m2)");
        }

    }

    public Habitacion getHabitacionMasGrande(){

        Habitacion mayor = habitaciones.get(0);

        for (Habitacion hab : habitaciones) {
            if(hab.getMetrosCuadrados()>mayor.getMetrosCuadrados()){
                mayor=hab;
            }
        }

        return mayor;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario:");
        String nombre = entrada.next();
        System.out.println("Introduce la edad:");
        int edad = entrada.nextInt();

        propietario = new Propietario(nombre, edad);
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void consumoMáximo(){

        double mayorConsumo = 0;
        Habitacion habitacionConsumo = habitaciones.get(0);

        for (Habitacion hab : habitaciones) {
            if(hab.calcularConsumo()>mayorConsumo){
                habitacionConsumo=hab;
                mayorConsumo=hab.calcularConsumo();
            }

        }

        System.out.println("La habitación con mayor consumo es: " + habitacionConsumo.getNombre() + ", " + mayorConsumo);

    }

}
