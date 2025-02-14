package org.example.redes_sociales;

public class Usuario {

    private String nombre;
    private int edad;
    private String username;
    private int seguidores;

    public Usuario(String nombre, int edad, String username, int seguidores) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.seguidores = seguidores;
    }

    public void mostrarInfo(){
        System.out.println("Información del Usuario:");
        mostrarInfoBase();
        System.out.println("Seguidores: " + seguidores);
        AppRedSocial.separador();
    }

    public void mostrarInfoBase(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de usuario: " + username);
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

}
