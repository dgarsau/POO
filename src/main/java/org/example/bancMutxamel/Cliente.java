package org.example.bancMutxamel;

import lombok.*;

import java.util.Scanner;

@Getter @Setter
@ToString
public class Cliente{

    static Scanner entrada = new Scanner(System.in);
    private int contador_clientes = 0;

    private int id;
    private String nombre;
    private String apellidos;

    public Cliente(){
        contador_clientes++;
        setId();
        setNombre();
        setApellidos();
    }

    public void setId() {
        id=contador_clientes;
    }

    public void setNombre(){
        System.out.println("Introduce el nombre:");
        this.nombre=entrada.next();
    }

    public void setApellidos(){
        System.out.println("Introduce los apellidos:");
        this.apellidos= entrada.nextLine();
    }

}
