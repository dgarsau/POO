package org.example.festival;

public class Organizador extends Persona implements  Organizable{

    private String rol;

    public Organizador(String nombre, int edad, String rol) throws EdadMinimaException {
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


    @Override
    public void organizarEvento() {
        System.out.println("Organizando organizadas.");
    }
}
