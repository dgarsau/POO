package org.example.pokemon;

public class Agua extends Pokemon {

    public Agua(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    void atacar() {
        System.out.println("PISTOLA DE ÁGUA");
    }
}
