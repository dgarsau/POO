package org.example;

public class Televisor {

    private int canal;
    private int volumen;

    public Televisor(){
        setCanal(1);
        setVolumen(5);
    }

    public Televisor(int valorCanal, int valorVolumen){
        setCanal(valorCanal);
        setVolumen(valorVolumen);
    }

    //CANAL

    public void subirCanal() {
        if (canal<99) {
            this.canal = canal+1;
            mostrarCanalNuevo();
        }
    }

    public void bajarCanal() {
        if (canal>1) {
            this.canal = canal-1;
            mostrarCanalNuevo();
        }
    }

    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int valorCanal) {
        if (valorCanal>0 && valorCanal<100){
            this.canal = valorCanal;
        }else {
            this.canal=1;
        }
        mostrarCanalNuevo();
    }

    //VOLUMEN

    public int getVolumen(){
        return this.volumen;
    }

    public void setVolumen(int valorVolumen) {
        if (valorVolumen>0 && valorVolumen<=100) {
            this.volumen = valorVolumen;
        }else{
            this.volumen=5;
        }
        mostrarVolumenNuevo();
    }

    public void mostrarCanalNuevo(){
        System.out.println("Canal: " + canal);
    }

    public void mostrarVolumenNuevo(){
        System.out.println("Volumen: " + volumen);
    }


}
