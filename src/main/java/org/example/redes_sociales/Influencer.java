package org.example.redes_sociales;

import java.util.ArrayList;
import java.util.Arrays;

public class Influencer extends Usuario{

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String username, int seguidores) {
        super(nombre, edad, username, seguidores);
        colaboraciones=new ArrayList<>();
    }

    public void insertarColaboracion(String... colaboracion){
        colaboraciones.addAll(Arrays.asList(colaboracion));
    }

    public void mostrarInfo(){
        System.out.println("Información del Influencer:");
        super.mostrarInfoBase();
        System.out.println("Colaboraciones: " + colaboraciones);

        AppRedSocial.separador();
    }
}
