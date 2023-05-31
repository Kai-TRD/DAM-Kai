package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import exception.NoExisteDNIException;
import plantillas.ListadoProfesores;
import plantillas.Profesores;

public class ficheroUtils {

	public static ListadoProfesores leerFicheroJSON(String path) {

		// List<Pokemon> diccionario = null;

		ListadoProfesores lp = null;

		try {
			File fichero = new File(path);

			ObjectMapper mapper = new ObjectMapper();
			lp = mapper.readValue(fichero, ListadoProfesores.class);

		} catch (Exception e) {
			System.out.println(e);
		}

		return lp;

	}

	public static void crearArchivoTextoCSV(String ruta) {
		try {
			ListadoProfesores lp = leerFicheroJSON("src/ficheros/profesores-alumnos-notas");
			File archivo = new File(ruta);
			FileWriter writer = new FileWriter(archivo, false);

			for (int i = 0; i < lp.getProfesores().size(); i++) {
				for (int j = 0; j < lp.getProfesores().get(i).getAlumnos().size(); j++) {
					try {
						if (lp.getProfesores().get(i).getAlumnos().get(j).getDni().isEmpty()) {
							throw new NoExisteDNIException(lp.getProfesores().get(i).getAlumnos().get(j).getNombre());
						} else {
							writer.write(lp.getProfesores().get(i).getAlumnos().get(j).toString());
							writer.write(System.lineSeparator());
						}
					} catch (NoExisteDNIException e) {
						System.out.println(e.getMessage());
					}
				}
			}

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Map<String, Double> leerFicheroBecas(String ruta) {

		FileReader fr = null;
		BufferedReader bufferReader = null;
		Map<String, Double> becas = new HashMap<>();

		try {
			fr = new FileReader(ruta);
			bufferReader = new BufferedReader(fr);

			String lineaFichero = bufferReader.readLine();

			while (lineaFichero != null) {

				// separa por un '-'
				String[] separado = lineaFichero.split("-");

				String asignatura = separado[0];
				double nota = Double.parseDouble(separado[1]);

				becas.put(asignatura, nota);

				lineaFichero = bufferReader.readLine();
			}

		} catch (IOException ioException) {
			System.out.println("Fichero no encontrado");
		}
		return becas;
	}

	public static void crearFicheroAlumnosConDerechoABecaCSV(String ruta) {
		try {
			ListadoProfesores lp = leerFicheroJSON("src/ficheros/profesores-alumnos-notas");

			Map<String, Double> listaBecas = ficheroUtils.leerFicheroBecas("src/ficheros/becas2023.txt");

			File archivo = new File(ruta);
			FileWriter writer = new FileWriter(archivo, false);

			for (Map.Entry<String, Double> entry : listaBecas.entrySet()) {
				String c = entry.getKey();
				Double v = entry.getValue();
				writer.write("== " + c + " ==");
				writer.write(System.lineSeparator());
				for (int i = 0; i < lp.getProfesores().size(); i++) {
					for (int j = 0; j < lp.getProfesores().get(i).getAlumnos().size(); j++) {
						for (Map.Entry<String, Double> entry2 : lp.getProfesores().get(i).getAlumnos().get(j).getNotas().entrySet()) {
							Double nota = entry.getValue();
							if(nota >= v) {
								writer.write(lp.getProfesores().get(i).getAlumnos().get(j).getNombre() + " : " + nota);
							}
						}
					}
				}

			}

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void AlumnosAnaGarcia(String ruta) {
		try {
			ListadoProfesores listaProfesores = ficheroUtils.leerFicheroJSON("src/ficheros/profesores-alumnos-notas");

			Profesores ana = null;

			for (int i = 0; i < listaProfesores.getProfesores().size(); i++) {
				if(listaProfesores.getProfesores().get(i).getCodigo().equals("P002")) {
					ana = listaProfesores.getProfesores().get(i);
				}	
			}

			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
			objectMapper.writeValue(new File(ruta), ana);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
