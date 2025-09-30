package servicio;

import modelo.Pokemon;
import repositorio.Fichero;

public class ServicioFichero {

    public static void guardar(String tipo, String nombre){
        Pokemon pikachu = new Pokemon(tipo, nombre);
        Fichero pokedex = new Fichero("datos/pokemon.txt");
        pokedex.addDato(pikachu.toString());

    }

    public static void guardar(Pokemon miPokemon){
        Fichero pokedex = new Fichero("datos/pokemon.txt");
        pokedex.addDato(pokedex.toString());

    }


}