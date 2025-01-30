package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class CosasArrayList {

    public static void main(String[] args){

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(3);
        listaNumeros.add(14);
        listaNumeros.add(45);
        listaNumeros.add(1,9);
        System.out.println(listaNumeros.get(0));
        listaNumeros.remove(0);
        System.out.println(listaNumeros.get(0));
        listaNumeros.remove(Integer.valueOf(45));
        System.out.println(listaNumeros);
        System.out.println("Posición del número 14: " + listaNumeros.indexOf(14));
        System.out.println("Posición del número 45: " + listaNumeros.indexOf(45));

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }

        System.out.println("------");

        for(int lista : listaNumeros){
            System.out.println(lista);
        }

        listaNumeros.set(0,56);
        System.out.println(listaNumeros.get(0));

        Object Lista_copia = listaNumeros.clone();

        listaNumeros.clear();
        System.out.println(listaNumeros);
        System.out.println(Lista_copia);

        if(listaNumeros.contains(45)){
            System.out.println("Está en la lista");
        } else {
            System.out.println("No está en la lista");
        }

        if (listaNumeros.isEmpty()){
            System.out.println("La lista está vacía");
        } else {
            System.out.println("La lista no está vacía");
        }

        listaNumeros.addAll(Arrays.asList(2,5,8,12,33));
        System.out.println(listaNumeros);

        insertarVarios(listaNumeros, 1,2,3,4,5,6,7,8);
        System.out.println(listaNumeros);

    }

    public static void insertarVarios(ArrayList<Integer> lista, Integer... numeros){

        lista.addAll(Arrays.asList(numeros));

    }

}
