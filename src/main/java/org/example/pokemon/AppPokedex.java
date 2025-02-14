package org.example.pokemon;

public class AppPokedex {

    public static void main(String[] args) {

        Electrico pikachu = new Electrico(100, 258);
        Pokemon pikacho = new Electrico(93,210);
        pikacho.atacar();

        Agua squirtle = new Agua(57, 163);
        squirtle.atacar();
        squirtle.imprimirDatos();

    }
}
