package utils;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import modelos.Ciclista;

public class ciclistaUtils {
    public static List<Ciclista> leerFicheroDiccionarioPokemon(String path) {
		
		List<Ciclista> listCiclista = null;

        Ciclista ciclista = new Ciclista(null, null, 0, null);

		try {
			File fichero = new File(path);

			ObjectMapper mapper = new ObjectMapper();
			ciclista = mapper.readValue(fichero, Ciclista.class);

            listCiclista.add(ciclista);
		} catch (Exception e) {
			System.out.println(e);
		}

		return listCiclista;
		
	}
}
