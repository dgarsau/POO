package org.example.herencia_persona;

public class Organizador extends Persona{

    private String rol;

    public Organizador(String nombre, int edad, String rol) {
        super(nombre, edad);
        this.rol = rol;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); //llamamos al método de la clase Persona
        System.out.println("Rol: " + rol);
    }

    public void accederEvento(){
        System.out.println("Accediendo como Organizador: Coordinando el evento.");
    }


}
