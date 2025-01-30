package org.example.biblioteca;

import java.util.ArrayList;

public class Estudiante {

    public static int contadorEstudiantes = 0;
    public static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> librosPrestados;

    public Estudiante(String nombre){
        this.nombre = nombre;
        contadorEstudiantes++;
        this.nia=contadorEstudiantes;
        librosPrestados = new ArrayList<>();
    }

    public Estudiante(String nombre, String curso, String email){
        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        this.nia=contadorEstudiantes;
        librosPrestados = new ArrayList<>();
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

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
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

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void anyadirLibro(Libro libro){
        librosPrestados.add(libro);
    }

    public void borrarLibro(Libro libro){
        librosPrestados.remove(libro);
    }

    @Override
    public String toString(){
        if(!librosPrestados.isEmpty()) {
            return "Estudiante: [" + this.nombre + ", " + this.curso + ", " + this.nia + ", " + this.email + ", " + librosPrestados + "]";
        }
        return "Estudiante: [" + this.nombre + ", " + this.curso + ", " + this.nia + ", " + this.email + "]";
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
