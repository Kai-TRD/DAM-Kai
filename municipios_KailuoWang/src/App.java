import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import clases.Municipio;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("+---Lectura fichero alumnos---+");

        FileReader fr = null;

        BufferedReader bufferReader = null;

        ArrayList<Municipio> listaMunicipios = new ArrayList<>();

        int numeroLinea = 0;

        try {
            fr = new FileReader("src/fichero/PoblacionMunicipiosMalaga.txt");

            bufferReader = new BufferedReader(fr);

            bufferReader.readLine();

            String lineaFichero = bufferReader.readLine();

            while (lineaFichero != null) {
                try {
                    String[] separado = lineaFichero.split("\\t");

                    String municipios = separado[0];
                    String sexo = separado[1];
                    int periodo = Integer.parseInt(separado[2]);
                    String total = separado[3];

                    Municipio municipio = new Municipio(municipios, sexo, periodo, total);
                    listaMunicipios.add(municipio);

                    System.out.println(numeroLinea + " - " + municipio);
                } catch (Exception exception) {
                    System.out.println(numeroLinea + " - " + exception);
                }
                    System.out.println("------------------------------------------------------");



                numeroLinea++;
                lineaFichero = bufferReader.readLine();
            }

            System.out.println("\nHemos llegado al final del fichero");

        } catch (IOException ioException) {
            System.out.println("Fichero no encontrado");
        } catch (NumberFormatException numberFormatException) {
            System.out.println(numberFormatException);
        }

    }
}
