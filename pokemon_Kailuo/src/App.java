import java.util.ArrayList;
import java.util.HashSet;
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
         * -[X] Los 5 ultimos pokemons según el listado
         * 
         * -[X] Datos de Pikachu (mediante un método de búsqueda por nombre en la clase
         *  pokedex)
         * 
         * -[X] Evolución de Charmander (debemos buscar el pokemon con el método buscar por
         *  nombre de la clase pokedex)
         * 
         * -[X] Pokemons de tipo fire (Crear método en la clase pokedex que permita
         *  buscar
         *  por diferentes tipos)
         * 
         * -[X] Pokemons con debilidad water o electric (debilidad es la propiedad:
         *  weaknesses) (Crear método en la clase pokedex que permita buscar por
         *  diferentes debilidades)
         * 
         * -[X] Pokemon con mas debilidades
         * 
         * -[X] Pokemon más alto
         *
         * Toda esta información la debes guardar en un fichero llamado
         * consultasPokemon.txt
         */

        System.out.println(" + ======== POKEDEX ======== + \n");

        
        System.out.println(" ======== Los 5 ultimos pokemon ========");

        Pokedex pokedex = jsonUtils.leerFicheroDiccionarioPokemon("src/ficheros/Pokemon.json");

        ArrayList<Pokemon> los5Ultimos = new ArrayList<>();
        int position = 4;

        for (int i = 0; i < pokedex.getPokemon().size(); i++) {
            if ((pokedex.getPokemon().size() - position) == pokedex.getPokemon().get(i).getId()) {
                // System.out.println(pokedex.getPokemon().get(i));
                los5Ultimos.add(pokedex.getPokemon().get(i));
                position--;
            }
        }
        System.out.println(los5Ultimos);


        System.out.println("\n ======== Muestro el pokemon que quiero ========");
        pokedex.mostrarInfoDe("pIkAcHu");


        System.out.println("\n ======== Muestro la evo de un pokemon ========");
        pokedex.mostrarInfoEvoDe("charmander");


        System.out.println("\n ======== Muestro los pokemons de un tipo ========");
        ArrayList<Pokemon> listaDeUnType = pokedex.mostrarPokeType("fiRe");
        System.out.println(listaDeUnType);


        System.out.println("\n ======== Muestro los pokemons con debilidad ========");
        String[] weaknesses = { "Fire", "Electric" };

        System.out.print("·· Pokemons con debilidades ");
        for (int i = 0; i < weaknesses.length; i++) {
            System.out.print(weaknesses[i]);
            System.out.print(", ");
        }
        System.out.println("··");

        HashSet<Pokemon> listaPokemonDebilidades = pokedex.mostrarPokeConWeakness(weaknesses);
        System.out.println(listaPokemonDebilidades);


        System.out.println("\n ======== Muestro el pokemon con mas debilidad ========");
        pokedex.mostrarPokeConMasWeakness();


        System.out.println("\n ======== Muestro el pokemon mas alto ========");
        pokedex.mostrarPokeMasAlto();




    }
}
