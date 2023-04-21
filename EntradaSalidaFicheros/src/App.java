import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------Leemos un fichero de texto----------");

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
            fr = new FileReader("src/recursos/ficheroNumeros.txt");

            bufferReader = new BufferedReader(fr);

            String lineaFichero = bufferReader.readLine();

            int sumaTotalLinea = 0;

            int nLineas = 1;

            while (lineaFichero != null) {

                // crear un array, trocear por espacio y luego sumar los valores
                String[] numeros = lineaFichero.split(" ");


                ArrayList<String> numeros2 = new ArrayList<>();

                for (int i = 0; i < numeros.length; i++) {
                    numeros2.add(numeros[i]);
                }

                for (int i = 0; i < numeros2.size(); i++) {
                    sumaTotalLinea += Integer.parseInt(numeros2.get(i));
                }

                System.out.println("Linea " + nLineas + ": " +sumaTotalLinea);

                nLineas++;
                sumaTotalLinea = 0;
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
