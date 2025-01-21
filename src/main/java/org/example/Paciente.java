package org.example;

import java.util.Random;

public class Paciente {

    private final static char GENERO_DEF = 'X';

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private float peso;
    private float altura;

    private void generarDni(){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10000000, 99999999);

        this.dni=Integer.toString(numero) + letras[numero%23];
    }

    public Paciente() {
//        generarDni();
//        this.genero = GENERO_DEF;
        this("", 0, GENERO_DEF, 0, 0);
    }

    public Paciente(String nombre, int edad, char genero){
        this(nombre, edad, genero, 0, 0);
    }

    public Paciente(String nombre ,int edad ,char genero ,float peso ,float altura) {
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
        this.peso=peso;
        this.altura=altura;
        generarDni();
    }

    public void mostrarInfoPaciente(){

        System.out.println("Paciente: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Género: " + this.genero);
        System.out.println("DNI: " + this.dni);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);

    }


}