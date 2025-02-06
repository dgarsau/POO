package org.example.LomBok;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;

@Getter @Setter @ToString
@AllArgsConstructor
public class Instituto {

    @NonNull
    private String nombre;
    private String poblacion;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Curso> listaCursos;

    public Instituto(String nombre){
        this.nombre= Objects.requireNonNullElse(nombre, "Instituto sin nombre");
        listaEstudiantes = new ArrayList<>();
        listaCursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso){
        if(listaCursos.contains(curso)){
            System.out.println("ERROR. El curso ya está añadido");
        } else if (curso==null) {
            System.out.println("ERROR. No se puede añadir un curso nulo");
        } else {
            listaCursos.add(curso);
        }

    }

    public void agregarEstudiante(Estudiante estudiante){
        if(listaEstudiantes.contains(estudiante)){
            System.out.println("ERROR. El estudiante ya está añadido.");
        } else if (estudiante==null){
            System.out.println("ERROR. No se puede añadir un estudiante nulo");
        } else {
            listaEstudiantes.add(estudiante);
        }
    }

}
