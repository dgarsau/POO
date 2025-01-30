package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class EjerciciosArrayList {

    public static void main(String[] args){

        ArrayList<String> listaCompra = new ArrayList<>();
        estaVacia(listaCompra);
        listaCompra.add("Papel Higiénico");
        estaVacia(listaCompra);
        listaCompra.addAll(Arrays.asList("Huevos", "Pan", "Leche", "Cereales", "Gel"));
        System.out.println("Lista de la compra: " + listaCompra);
        listaCompra.get(2);
        listaCompra.set(1, "Queso");
        contieneElemento(listaCompra, "Leche");

    }

    public static void estaVacia(ArrayList<String> lista){
        if (lista.isEmpty()){
            System.out.println("La lista está vacía");
        } else {
            System.out.println("La lista no está vacía");
        }
    }

    public static void contieneElemento(ArrayList<String> lista, String elemento){
        if(lista.contains(elemento)){
            System.out.println("El elemento (" + elemento + ") está en la lista.");
        } else {
            System.out.println("El elemento (" + elemento + ") no está en la lista.");
        }
    }

}
