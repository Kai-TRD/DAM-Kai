package plantilla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Pokedex {

    ArrayList<Pokemon> pokemon;

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(ArrayList<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    // | Muestro la informacion de un pokemon |
    public void mostrarInfoDe(String pokeName) {
        for (int i = 0; i < pokemon.size(); i++) {
            if (pokemon.get(i).getName().equalsIgnoreCase(pokeName)) {
                System.out.println("\t·Id - " + pokemon.get(i).getId());
                System.out.println("\t·Num - " + pokemon.get(i).getNum());
                System.out.println("\t·Name - " + pokemon.get(i).getName());
                System.out.println("\t·Type - " + pokemon.get(i).getType());
                System.out.println("\t·Height - " + pokemon.get(i).getHeight());
                System.out.println("\t·Weight - " + pokemon.get(i).getWeight());
                System.out.println("\t·Weaknesses - " + pokemon.get(i).getWeaknesses());
                System.out.println("\t·Prev_evolution - " + Arrays.toString(pokemon.get(i).getPrev_evolution()));
                System.out.println("\t·Next_evolution - " + Arrays.toString(pokemon.get(i).getNext_evolution()));
            }
        }
    }

    // | Muestro la informacion de la evolucion de un pokemon |
    public void mostrarInfoEvoDe(String pokeName) {

        for (int i = 0; i < pokemon.size(); i++) {

            if (pokemon.get(i).getName().equalsIgnoreCase(pokeName)) {
                System.out.println("\t·Id - " + pokemon.get(i + 1).getId());
                System.out.println("\t·Num - " + pokemon.get(i + 1).getNum());
                System.out.println("\t·Name - " + pokemon.get(i + 1).getName());
                System.out.println("\t·Type - " + pokemon.get(i + 1).getType());
                System.out.println("\t·Height - " + pokemon.get(i + 1).getHeight());
                System.out.println("\t·Weight - " + pokemon.get(i + 1).getWeight());
                System.out.println("\t·Weaknesses - " + pokemon.get(i + 1).getWeaknesses());
                System.out.println("\t·Prev_evolution - " + Arrays.toString(pokemon.get(i + 1).getPrev_evolution()));
                System.out.println("\t·Next_evolution - " + Arrays.toString(pokemon.get(i + 1).getNext_evolution()));
            }
        }
    }

    // | Muestro la informacion de pokemon de un tipo |
    public ArrayList<Pokemon> mostrarPokeType(String type) {

        ArrayList<Pokemon> list = new ArrayList<>();

        for (int i = 0; i < pokemon.size(); i++) {
            List<String> types = pokemon.get(i).getType();
            for (int j = 0; j < types.size(); j++) {
                if (types.get(j).toLowerCase().contains(type.toLowerCase())) {
                    list.add(pokemon.get(i));
                }

            }
        }

        return list;
    }

    // | Muestro la informacion de pokemons con debilidad |
    public HashSet<Pokemon> mostrarPokeConWeakness(String[] weaknesses) {
        
        HashSet<Pokemon> pokemonList = new HashSet<>();

        for (int i = 0; i < pokemon.size(); i++) {
            for (int j = 0; j < weaknesses.length; j++) {
                if (pokemon.get(i).getWeaknesses().contains(weaknesses[j])) {
                    pokemonList.add(pokemon.get(i));
                }
            }
        }

        return pokemonList;
    }

    // | Muestro la informacion del pokemon con mas debilidad |
    public void mostrarPokeConMasWeakness() {
        
        int weaknessesNumber = 0;

        Pokemon elMasDebil = null;

        for (int i = 0; i < pokemon.size(); i++) {
            if(pokemon.get(i).getWeaknesses().size() > weaknessesNumber) {
                elMasDebil = pokemon.get(i);
                weaknessesNumber = pokemon.get(i).getWeaknesses().size();
            }
        }

        System.out.println(elMasDebil);
    }


        // | Muestro la informacion del pokemon con mas alto |
        public void mostrarPokeMasAlto() {
        
            double height = 0;
            Pokemon elMasAlto = null;
    
            for (int i = 0; i < pokemon.size(); i++) {
                double alturaTemp = Double.parseDouble(pokemon.get(i).getHeight().split(" ")[0]);
                if(alturaTemp > height) {
                    elMasAlto = pokemon.get(i);
                    height = alturaTemp;
                }
            }
            System.out.println(elMasAlto.showHeight());
        }
    

    @Override
    public String toString() {

        String cadena = "";

        for (int i = 0; i < pokemon.size(); i++) {
            cadena += pokemon.get(i).toString() + "\n";
        }
        return cadena;
    }

}
