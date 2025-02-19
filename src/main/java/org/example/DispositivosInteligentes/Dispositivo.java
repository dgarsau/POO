package org.example.DispositivosInteligentes;

abstract class Dispositivo {

    private String nombre;
    private boolean estado; //encendido/apagado

    public Dispositivo(String nombre){
        this.nombre=nombre;
        estado=false;
    }

    public abstract void encender();

    public void apagar(){
        if(estado){
            System.out.println(nombre + " apagado.");
            this.estado=false;
        } else {
            System.out.println(nombre + " ya está apagado.");
        }

    }

    public void mostrarEstado(){
        if(estado){
            System.out.println(nombre + ": Encendido.");
        } else {
            System.out.println(nombre + ": Apagado.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
