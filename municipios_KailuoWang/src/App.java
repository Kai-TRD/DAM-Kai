package municipios_KailuoWang.src;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("+---Lectura fichero alumnos---+");

        FileReader fr = null;

        BufferedReader bufferReader = null;

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        int numeroLinea = 0;

        try {
            fr = new FileReader("src/fichero/ficheroAlumnos.txt");

            bufferReader = new BufferedReader(fr);

            bufferReader.readLine();

            String lineaFichero = bufferReader.readLine();

            while (lineaFichero != null) {

                String[] separado = lineaFichero.split("\\s+");

                String sexo = separado[0];
                String edad = separado[1];
                double estatura = Double.parseDouble(separado[2].replace(",", "."));
                int puntuacion1 = Integer.parseInt(separado[3]);
                int puntuacion2 = Integer.parseInt(separado[4]);
                String calificacion = separado[5];

                Alumno alumno = new Alumno(sexo, edad, estatura, puntuacion1, puntuacion2, calificacion);
                listaAlumnos.add(alumno);

                System.out.println(listaAlumnos.get(numeroLinea));

                System.out.println("------------------------------------------------------");

                numeroLinea++;
                lineaFichero = bufferReader.readLine();
            }

            System.out.println("\nHemos llegado al final del fichero");

        } catch (IOException ioException) {
            System.out.println("Fichero no encontrado");
        } finally {
            if (bufferReader != null) {
                bufferReader.close();
            }
        }
    }
}
