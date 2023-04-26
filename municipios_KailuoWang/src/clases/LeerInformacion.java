package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.ldap.HasControls;

public class LeerInformacion {

    public ArrayList<Municipio> LeerFicheroMunicipio(Integer ano) {
        FileReader fr = null;

        BufferedReader bufferReader = null;
        ArrayList<Municipio> municipios = new ArrayList<>();
        try {
            fr = new FileReader("src/fichero/PoblacionMunicipiosMalaga.txt");

            bufferReader = new BufferedReader(fr);

            bufferReader.readLine();

            String lineaFichero = bufferReader.readLine();

            while (lineaFichero != null) {

                String[] separado = lineaFichero.split("\\t");

                try {
                    String municipio = separado[0];
                    String edad = separado[1];
                    int periodo = Integer.parseInt(separado[2]);
                    String total = separado[3];

                    if (ano == null) {
                        Municipio municipioA = new Municipio(municipio, edad, periodo, total);
                        municipios.add(municipioA);
                    } else {
                        if (periodo == ano) {
                            Municipio municipioA = new Municipio(municipio, edad, periodo, total);
                            municipios.add(municipioA);
                        }
                    }

                } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    System.out.println("ERROR! Se ha saltdado una linea");

                }
                lineaFichero = bufferReader.readLine();
            }

        } catch (IOException ioException) {
            System.out.println("Fichero no encontrado");
        }
        return municipios;
    }

    public ArrayList<Municipio> BuscarMunicipio(ArrayList<Municipio> coleccionMunicipios, String nombre, Integer ano) {
        FileReader fr = null;

        BufferedReader bufferReader = null;
        ArrayList<Municipio> municipios = new ArrayList<>();
        try {
            fr = new FileReader("src/fichero/PoblacionMunicipiosMalaga.txt");

            bufferReader = new BufferedReader(fr);

            bufferReader.readLine();

            String lineaFichero = bufferReader.readLine();

            while (lineaFichero != null) {

                String[] separado = lineaFichero.split("\\t");

                try {
                    String municipio = separado[0];
                    String edad = separado[1];
                    int periodo = Integer.parseInt(separado[2]);
                    String total = separado[3];

                    String[] separarMunicipio = municipio.split(" ");

                    if (municipio.equals("29 Málaga")) {
                        System.out.println("no se añade");
                    } else {
                        if (municipio.contains(nombre) && ano == periodo) {
                            Municipio municipio2 = new Municipio(municipio, edad, periodo, total);
                            municipios.add(municipio2);
                        }
                    }

                } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

                }
                lineaFichero = bufferReader.readLine();
            }

        } catch (IOException ioException) {
            System.out.println("Fichero no encontrado");
        }
        return municipios;
    }

    public HashMap<String, Integer> IncrementoPoblacion(ArrayList<Municipio> coleccionMunicipios, int year1, int year2) {
        
        FileReader fr = null;

        BufferedReader bufferReader = null;
        HashMap<String, Integer> municipios = new HashMap<>();
        try {
            fr = new FileReader("src/fichero/PoblacionMunicipiosMalaga.txt");

            bufferReader = new BufferedReader(fr);

            bufferReader.readLine();

            String lineaFichero = bufferReader.readLine();

            while (lineaFichero != null) {

                String[] separado = lineaFichero.split("\\t");

                try {
                    String municipio = separado[0];
                    String edad = separado[1];
                    int periodo = Integer.parseInt(separado[2]);
                    String total = separado[3];
                    
                    
                    if(periodo == year1) {

                    }

                    municipios.put(municipio, null);




                } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

                }
                lineaFichero = bufferReader.readLine();
            }

        } catch (IOException ioException) {
            System.out.println("Fichero no encontrado");
        }
        return municipios;

    }
}
