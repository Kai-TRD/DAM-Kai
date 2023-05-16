package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import modelos.Corredor;
import modelos.Equipo;

public class ciclistaUtils {

	public static void leerEquipo(String archivo) throws IOException {

		FileReader fr = null;

		BufferedReader bufferReader = null;

		ArrayList<Equipo> listaEquipos = new ArrayList<>();

		int numeroLinea = 0;

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

				System.out.println(listaEquipos.get(numeroLinea));


				numeroLinea++;
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
	}


	public static Map<Integer, Integer> leerTiemposDeEtapa(String relativePathFile) {

		// File ficheroEmpleado = new File("src/recursos/employee.txt");
		File ficheroEmpleado = new File(relativePathFile);
		// byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));

		// create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		Map<Integer, Integer> diccionario = new HashMap<>();

		// convert json string to object
		Corredor cor = null;
		try {
			// TypeReference typeRef = new TypeReference<Map<Integer, Integer>>() {
				
			// };
			diccionario = objectMapper.readValue(ficheroEmpleado, new TypeReference<Map<Integer, Integer>>() {
				
			});
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Employee Object\n" + cor);
		return diccionario;

	}





}
