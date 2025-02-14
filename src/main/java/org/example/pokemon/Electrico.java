package org.example.pokemon;

public class Electrico extends Pokemon{


    public Electrico(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    void atacar() {
        System.out.println("TROVÃO");
    }
}
