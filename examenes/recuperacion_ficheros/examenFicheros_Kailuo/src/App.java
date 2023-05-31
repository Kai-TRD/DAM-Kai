
import java.util.Map;

import plantillas.ListadoProfesores;
import utils.ficheroUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Lista de profesores
        ListadoProfesores listaProfesores = ficheroUtils.leerFicheroJSON("src/ficheros/profesores-alumnos-notas");

        for (int i = 0; i < listaProfesores.getProfesores().size(); i++) {
            System.out.println(listaProfesores.getProfesores().get(i));
        }

        // Creando el archivo de alumnos
        ficheroUtils.crearArchivoTextoCSV("src/ficheros/infoAlumnos.csv");

        // Leer becas
        Map<String, Double> listaBecas = ficheroUtils.leerFicheroBecas("src/ficheros/becas2023.txt");

        // for (Map.Entry<String, Double> entry : prueba.entrySet()) {
            // String c = entry.getKey();
            // Double v = entry.getValue();
            // System.out.println(c + " : " + v);
        // }

        ficheroUtils.crearFicheroAlumnosConDerechoABecaCSV("src/ficheros/AlumnosBeca2023.txt");

        ficheroUtils.AlumnosAnaGarcia("src/ficheros/AlumnosAnaGarcia.json");
    }
}
