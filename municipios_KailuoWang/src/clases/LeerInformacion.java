package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

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
                    String sexo = separado[1];
                    int periodo = Integer.parseInt(separado[2]);
                    int total = Integer.parseInt(separado[3].replace(".", ""));

                    if (ano == null) {
                        Municipio municipioA = new Municipio(municipio, sexo, periodo, total);
                        municipios.add(municipioA);
                    } else {
                        if (periodo == ano) {
                            Municipio municipioA = new Municipio(municipio, sexo, periodo, total);
                            municipios.add(municipioA);
                        }
                    }

                } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    // System.out.println("ERROR! Se ha saltdado una linea");

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
                    String sexo = separado[1];
                    int periodo = Integer.parseInt(separado[2]);
                    int total = Integer.parseInt(separado[3].replace(".", ""));

                    // String[] separarMunicipio = municipio.split(" ");

                    if (municipio.equals("29 Málaga")) {
                        // System.out.println("no se añade");
                    } else {
                        if (municipio.contains(nombre) && ano == periodo) {
                            Municipio municipio2 = new Municipio(municipio, sexo, periodo, total);
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

    public HashMap<String, Integer> IncrementoPoblacion(ArrayList<Municipio> coleccionMunicipios, int year1,
            int year2) {

        LeerInformacion leer = new LeerInformacion();
        ArrayList<Municipio> listaMunicipioYear1 = leer.LeerFicheroMunicipio(year1);

        ArrayList<Municipio> listaMunicipioYear2 = leer.LeerFicheroMunicipio(year2);

        // System.out.println(listaMunicipioYear1.size());
        // System.out.println(listaMunicipioYear2.size());

        HashMap<String, Integer> municipios = new HashMap<>();

        // for (int i = 0; i < listaMunicipioYear1.size(); i++) {
        // String municipioTemp = listaMunicipioYear1.get(i).getMunicipios();
        // int diferencia = listaMunicipioYear1.get(i).getTotal() -
        // listaMunicipioYear2.get(i).getTotal();

        // municipios.put(municipioTemp, diferencia);
        // }


            int j = 0;
            int i = 0;

            while (i < listaMunicipioYear1.size() && j < listaMunicipioYear2.size())
            {
                if (listaMunicipioYear1.get(i).getMunicipios().equals(listaMunicipioYear2.get(j).getMunicipios()) && listaMunicipioYear1.get(i).getSexo().equals(listaMunicipioYear2.get(j).getSexo()))
                {
                    int diferencia = (listaMunicipioYear1.get(i).getTotal()) - (listaMunicipioYear2.get(j).getTotal());
                    municipios.put(listaMunicipioYear1.get(i).getMunicipios(), diferencia);
                    i++;
                    j++;
                }
                else
                {
                    if (listaMunicipioYear1.get(i).getMunicipios().compareTo(listaMunicipioYear2.get(j).getMunicipios())<0)
                    {
                        i++;
                    }
                    else
                    {
                        j++;
                    }
                }

            }

        // for (int i = 0; i < listaMunicipioYear1.size(); i++) {
        //     for (int j = 0; j < listaMunicipioYear2.size(); j++) {
        //         if ((listaMunicipioYear1.get(i).getMunicipios().equals(listaMunicipioYear2.get(j).getMunicipios())
        //                 && (listaMunicipioYear1.get(i).getSexo().equals(listaMunicipioYear2.get(j).getSexo())))) {

        //             String municipioTemp = listaMunicipioYear1.get(i).getMunicipios();
        //             int diferencia = (listaMunicipioYear1.get(i).getTotal()) - (listaMunicipioYear2.get(j).getTotal());

        //             municipios.put(municipioTemp, diferencia);
        //         }
        //     }
        // }

        // int contador = 1;
        // for (HashMap.Entry<String, Integer> entrada : municipios.entrySet()) {
        //     String clave = entrada.getKey();
        //     Integer valor = entrada.getValue();
        //     System.out.println(contador + " - " + clave + " : " + valor);
        //     contador++;
        // }
        // System.out.println(municipios.size());
        return municipios;

    }



}
