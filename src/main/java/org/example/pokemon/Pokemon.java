package org.example.pokemon;

abstract class Pokemon {

    private int nivel;
    private int ps;

    public Pokemon(int nivel, int ps){
        this.nivel = nivel;
        this.ps = ps;
    }

    abstract void atacar();

    public void imprimirDatos(){
        System.out.println("Nível= " + nivel + ", Pontos de saúde= " + ps);
    }

}
