package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerInformacion {
    public void leerFichero() {
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

                String[] separado = lineaFichero.split("\\s+");

                String municipios = separado[0];
                String sexo = separado[1];
                int periodo = Integer.parseInt(separado[2]);
                double total = Double.parseDouble(separado[3]);

                Municipio municipio = new Municipio(municipios, sexo, periodo, total);
                listaMunicipios.add(municipio);

                System.out.println(listaMunicipios.get(numeroLinea));

                System.out.println("------------------------------------------------------");

                numeroLinea++;
                lineaFichero = bufferReader.readLine();
            }

            System.out.println("\nHemos llegado al final del fichero");

        } catch (IOException ioException) {
            System.out.println("Fichero no encontrado");
        }
    }
}
