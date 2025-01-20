package org.example;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private int peso;
    private int edad;
    private String ciudad;
    private String profesion;


    public Persona(){

    }

    public Persona(String nombre, String apellido, String dni, int peso, int edad, String ciudad, String profesion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.peso = peso;
        this.edad = edad;
        this.ciudad = ciudad;
        this.profesion = profesion;
    }

    //GET

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getDni(){
        return this.dni;
    }

    public int getPeso(){
        return this.peso;
    }

    public int getEdad(){
        return this.edad;
    }

    //EJERCICIO 2

    public String getCiudad(){
        return this.ciudad;
    }

    public String getProfesion(){
        return this.profesion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    //SET

    public void setNombre(String nombre){
        if(!nombre.equalsIgnoreCase("Messi")){
            this.nombre=nombre;
        }
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void setDni(String dni){
        this.dni=dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //Otros

    public String concatenar(){
        return this.nombre + " " + this.apellido;
    }

    public void imprimirInfoPersona(){
        System.out.println(this.nombre + " " + this.apellido + " " + this.dni + " " + this.peso + " " + this.edad);
    }

}
