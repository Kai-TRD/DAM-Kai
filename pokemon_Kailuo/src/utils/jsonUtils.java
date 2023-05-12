package utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import plantilla.Pokedex;
import plantilla.Pokemon;

public class jsonUtils {

    // public static List<Pokemon> LeerListPokemonFromJsonFile(String relativePathFile) {
    //     File ficheroPokemon = new File(relativePathFile);

    //     ObjectMapper objectMapper = new ObjectMapper();

    //     List<Pokemon> listaPokemon = null;
    //     try {
    //         listaPokemon = objectMapper.readValue(ficheroPokemon, new TypeReference<List<Pokemon>>() {
    //         });
    //     } catch (IOException e) {

    //         e.printStackTrace();
    //     }

    //     return listaPokemon;
    // }


    public static Pokedex leerFicheroDiccionarioPokemon(String path) {
		
		// List<Pokemon> diccionario = null;

        Pokedex poke = null;

		try {
			File fichero = new File(path);

			ObjectMapper mapper = new ObjectMapper();
			poke = mapper.readValue(fichero, Pokedex.class);

		} catch (Exception e) {
			System.out.println(e);
		}

		return poke;
		
	}
}
