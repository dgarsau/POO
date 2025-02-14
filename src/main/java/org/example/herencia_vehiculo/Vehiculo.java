package org.example.herencia_vehiculo;

public class Vehiculo {

    private String marca;
    private String matricula;

    public Vehiculo(String marca, String matricula){
        this.marca=marca;
        this.matricula=matricula;
    }

    public void imprimirInfo(){
        System.out.println("Vehículo de la marca " + marca + " con matrícula " + matricula);
    }

    public void ruido(){
        System.out.println("brrrr brrrr");
    }

}
