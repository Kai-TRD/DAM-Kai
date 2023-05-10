import java.util.List;

import plantilla.Pokedex;
import plantilla.Pokemon;
import utils.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Dado el fichero pokemon.json donde guardamos la información que se guarda en
         * una pokedex (enciclopedia electrónica portátil que los entrenadores
         * Pokémon llevan consigo para registrar automáticamente las fichas de
         * todas las diversas especies Pokémon vistas y capturada)
         * 
         * Crea un proyecto llamado pokemon_TUNombre en el cual tendrás que implementar
         * las clases Pokedex y Pokemon con los atributos necesarios, las clases para la
         * lectura de un json y obtener la siguiente información
         * 
         * 
         * -Los 5 ultimos pokemons según el listado
         * 
         * -Datos de Pikachu (mediante un método de búsqueda por nombre en la clase
         * pokedex)
         * 
         * -Evolución de Charmander (debemos buscar el pokemon con el método buscar por
         * nombre de la clase pokedex)
         * 
         * -Pokemons de tipo fire (Crear método en la clase pokedex que permita buscar
         * por diferentes tipos)
         * 
         * -Pokemons con debilidad water o electric (debilidad es la propiedad:
         * weaknesses) (Crear método en la clase pokedex que permita buscar por
         * diferentes debilidades)
         * 
         * -Pokemon con mas debilidades
         * 
         * -Pokemon más alto
         *
         * Toda esta información la debes guardar en un fichero llamado
         * consultasPokemon.txt
         */

        System.out.println(" + ======== POKEDEX ======== + ");

        //Pokedex pokedex = new Pokedex();


        Pokedex pokedex = jsonUtils.leerFicheroDiccionarioPokemon("src/ficheros/Pokemon.json");

        //pokedex.setPokemon(array);

        System.out.println(pokedex);

        // List<Pokemon> listaPokemons = jsonUtils.LeerListPokemonFromJsonFile("src/recursos/employeeArray.txt");

        // for (Pokemon pokemon : listaPokemons) {
        //     System.out.println(pokemon);
        // }

    }
}
