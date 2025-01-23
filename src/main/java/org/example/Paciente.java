package org.example;

import java.util.Random;

public class Paciente {

    private final static char GENERO_DEF = 'X';
    public final static int SOBREPESO = 1;
    public final static int PESO_BAJO = -1;
    public final static int PESO_IDEAL = 0;
    private final static int MAYOR_EDAD = 18;

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private float peso;
    private float altura;

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
        comprobarGenero(genero);
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

    private void generarDni(){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10000000, 99999999);

        this.dni=Integer.toString(numero) + letras[numero%23];
    }

    public int calcularIMC(){

        double imc = peso/Math.pow(altura, 2);

        if(imc>25){
            return SOBREPESO;
        } else if (imc<20){
            return PESO_BAJO;
        } else {
            return PESO_IDEAL;
        }
    }

    public boolean esMayorDeEdad(){

        if(edad>MAYOR_EDAD){
            return true;
        }
        return false;

    }

    public void comprobarGenero(char genero){

        if(genero != 'H' && genero != 'M'){
            this.genero=GENERO_DEF;
        } else {
            this.genero=genero;
        }

    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public char getGenero(){
        return this.genero;
    }

    public float getPeso(){
        return this.peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        comprobarGenero(genero);
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}