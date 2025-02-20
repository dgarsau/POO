package org.example.pokemon;

public class AppPokedex {

    public static void main(String[] args) {

        Electrico pikachu = new Electrico(100, 258);

        pikachu.atacar();

        Agua squirtle = new Agua(57, 163);
        squirtle.atacar();
        squirtle.imprimirDatos();

        squirtle.hidroBomba();

        Pokemon pikacho = new Electrico(93,210);
        Pokemon squirtle2 = new Agua(57, 163);

        Pokemon[] pokemons = {new Electrico(93,210), new Agua(57, 163)};

        for (Pokemon pokemon: pokemons){
            pokemon.atacar();
            pokemon.imprimirDatos();

            if(pokemon instanceof Agua){
                ((AtaquesAgua) pokemon).pistolaAgua();
            }
        }

    }
}
