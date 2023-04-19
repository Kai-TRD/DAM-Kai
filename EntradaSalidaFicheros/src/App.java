import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Leemos un fichero de texto");

        FileReader fr = null;

        try {

            fr = new FileReader("src/recursos/fichero.txt");

            int caracterLeido = fr.read();
            while (caracterLeido != -1) {
                System.out.print((char) caracterLeido);
                caracterLeido = fr.read();
            }

            System.out.println("\nHemos llegado al final del fichero");

        } catch (IOException ioException) {
            System.out.println("Fichero no encontrado");
        } finally {
            if (fr != null) {
                fr.close();
            }
        }

        // Trabajamos con BufferedReader
        System.out.println("\n----------Trabajamos con BufferedReader----------");

        BufferedReader bufferReader = null;

        try {
            fr = new FileReader("src/recursos/fichero.txt");

            bufferReader = new BufferedReader(fr);

            String lineaFichero = bufferReader.readLine();

            while (lineaFichero != null) {
                System.out.println(lineaFichero);
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

        // ejercicio sumar numeros de lineas
        System.out.println("\n----------Suma de numeros----------");

        try {
            fr = new FileReader("src/recursos/fichero.txt");

            bufferReader = new BufferedReader(fr);

            String lineaFichero = bufferReader.readLine();

            while (lineaFichero != null) {

                // crear un array, trocear por espacio y luego sumar los valores

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
