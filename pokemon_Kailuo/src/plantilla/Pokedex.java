package plantilla;

import java.util.List;

public class Pokedex {

    List<Pokemon> pokemon;

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {

        String cadena = ""  ;

        for (int i = 0; i < pokemon.size(); i++) {
            cadena += pokemon.get(i).toString() + "\n";
        }
        return cadena;
    }

}
