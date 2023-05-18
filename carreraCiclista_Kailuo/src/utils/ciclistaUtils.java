package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import modelos.Ciclista;
import modelos.Corredor;
import modelos.Equipo;

public class ciclistaUtils {

	public static List<Equipo> leerEquipo(String archivo) throws IOException {

		FileReader fr = null;

		BufferedReader bufferReader = null;

		ArrayList<Equipo> listaEquipos = new ArrayList<>();

		try {
			fr = new FileReader(archivo);

			bufferReader = new BufferedReader(fr);

			bufferReader.readLine();

			String lineaFichero = bufferReader.readLine();

			while (lineaFichero != null) {

				String[] separado = lineaFichero.split(",");

				String codigo = separado[0];
				String nombre = separado[1];
				String nacionalidad = separado[2];
				int presupuesto = Integer.parseInt(separado[3]);

				Equipo equipo = new Equipo(codigo, nombre, nacionalidad, presupuesto);

				listaEquipos.add(equipo);

				lineaFichero = bufferReader.readLine();
			}

			// System.out.println(listaEquipos);

			// System.out.println("\nHemos llegado al final del fichero");

		} catch (IOException ioException) {
			System.out.println("Fichero no encontrado");
		} finally {
			if (bufferReader != null) {
				bufferReader.close();
			}
		}

		return listaEquipos;
	}








	public static List<Ciclista> LeerListCiclistaFromJsonFile(String relativePathFile) {
		File ficheroEmpleado = new File(relativePathFile);

		ObjectMapper objectMapper = new ObjectMapper();

		List<Ciclista> listaCiclista = null;
		try {
			listaCiclista = objectMapper.readValue(ficheroEmpleado, new TypeReference<List<Ciclista>>() {
			});
		} catch (IOException e) {

			e.printStackTrace();
		}

		return listaCiclista;
	}


	


	public static Map<Integer, Integer> leerTiemposDeEtapa(String relativePathFile) {

		// File ficheroEmpleado = new File("src/recursos/employee.txt");
		File ficheroEmpleado = new File(relativePathFile);
		// byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));

		// create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		Map<Integer, Integer> diccionario = new HashMap<>();

		// convert json string to object
		try {
			// TypeReference typeRef = new TypeReference<Map<Integer, Integer>>() {
				
			// };
			diccionario = objectMapper.readValue(ficheroEmpleado, new TypeReference<Map<Integer, Integer>>() {
				
			});
		} catch (IOException e) {

			e.printStackTrace();
		}

		return diccionario;

	}



	public static List<Corredor> ordenar(List<Corredor> lista) {
		List<Corredor> sortedList = new ArrayList<>(lista);
        Collections.sort(sortedList, new Comparator<Corredor>() {
            @Override
            public int compare(Corredor corredor1, Corredor corredor2) {
                return Integer.compare(corredor1.getTiempo(), corredor2.getTiempo());
            }
        });
		return sortedList;
	}



	public static void crearArchivoTexto(String ruta, String contenido) {

        try {
            // Crear un objeto File con la ruta y el nombre del archivo
            File archivo = new File(ruta);

            // Crear el archivo si no existe
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }

            // Escribir el contenido en el archivo
            FileWriter escritor = new FileWriter(archivo);
            escritor.write(contenido);
            escritor.close();

            System.out.println("Se ha escrito el contenido en el archivo.");

        } catch (IOException e) {
            System.out.println("Error al crear o escribir en el archivo: " + e.getMessage());
        }
    }


}
