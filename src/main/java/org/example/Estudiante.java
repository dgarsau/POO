package org.example;

import javax.print.DocFlavor;

public class Estudiante {

    public static int contadorEstudiantes = 0;
    public static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private Libro libroPrestado;

    public Estudiante(String nombre){
        this.nombre = nombre;
        contadorEstudiantes++;
        this.nia=contadorEstudiantes;
    }

    public Estudiante(String nombre, String curso, String email){
        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        this.nia=contadorEstudiantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getCurso(){
        return this.nombre;
    }

    public int getNia() {
        return this.nia;
    }

    public String getEmail() {
        return this.email;
    }

    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    @Override
    public String toString(){
        if(libroPrestado!=null) {
            return this.nombre + " " + this.curso + " " + this.nia + " " + this.email + " " + libroPrestado.getTitulo();
        }
        return this.nombre + " " + this.curso + " " + this.nia + " " + this.email;
    }

    public static int obtenerTotalEstudiantes(){
        return contadorEstudiantes;
    }

    public static void validarCorreo(String email){
        if(email.matches(CORREO_FORMAT)){
            System.out.println("El correo es válido");
        }else {
            System.out.println("El correo no es válido.");
        }
    }

}
