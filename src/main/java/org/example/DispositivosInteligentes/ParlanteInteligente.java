package org.example.DispositivosInteligentes;

public class ParlanteInteligente extends Dispositivo{

    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if(isEstado()){
            System.out.println("El parlante ya está encendido.");
        }else{
            System.out.println("Encendiendo parlante...");
            setEstado(true);
        }
    }

}
