package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import plantilla.Evento;
import plantilla.csvEvento;
import plantilla.jsonEvento;

public class madridUtils {

    public static List<csvEvento> LeerFicheroEventos(String filePath) {

        FileReader fr = null;

        BufferedReader bufferReader = null;

        ArrayList<csvEvento> Eventos = new ArrayList<>();

        try {
            // direccion del archivo
            fr = new FileReader(filePath);

            bufferReader = new BufferedReader(fr);

            bufferReader.readLine();

            String lineaFichero = bufferReader.readLine();

            // int suma = 1;

            while (lineaFichero != null) {

                // La separacion en este caso es un punto y coma (";")
                String[] separado = lineaFichero.split(";");

                try {

                    int idEvento = Integer.parseInt(separado[0]);
                    String titulo = separado[1];
                    String gratuito = separado[3];
                    String codigoPostalInstalacion = separado[separado.length - 7];

                    csvEvento eventoTemp = new csvEvento(idEvento, titulo, gratuito, codigoPostalInstalacion);

                    Eventos.add(eventoTemp);
                    // System.out.println(suma + " - " + eventoTemp);
                    // suma++;
                } catch (NumberFormatException e) {
                    System.out.println("Formato añadido no valido");
                }
                lineaFichero = bufferReader.readLine();
            }

        } catch (IOException ioException) {
            System.out.println("Fichero no encontrado");
        }
        return Eventos;
    }

    /**
     * Esto no hace nada
     * 
     * @param filePath
     * @return
     */
    // public static List<Evento> leerListaEventoFromJSON(String filePath) {
    // File ficheroEvento = new File(filePath);

    // ObjectMapper objectMapper = new ObjectMapper();

    // List<Evento> listaEvento = null;
    // try {
    // listaEvento = objectMapper.readValue(ficheroEvento, new
    // TypeReference<List<Evento>>() {
    // });
    // } catch (IOException e) {

    // e.printStackTrace();
    // }

    // return listaEvento;
    // }

    public static jsonEvento leerFicheroDiccionarioEvento(String path) {

        // List<Pokemon> diccionario = null;

        jsonEvento poke = null;

        try {
            File fichero = new File(path);

            ObjectMapper mapper = new ObjectMapper();
            poke = mapper.readValue(fichero, jsonEvento.class);

        } catch (Exception e) {
            System.out.println(e);
        }

        return poke;

    }

    public static List<csvEvento> ListadoEventoGratuitoCSV(List<csvEvento> listado) {

        List<csvEvento> listaEventosGratis = new ArrayList<>();

        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).getGratuito().equals("\"1\"")) {
                listaEventosGratis.add(listado.get(i));
            } else if (listado.get(i).getGratuito().equals("\"Gratuito\"")) {
                listaEventosGratis.add(listado.get(i));
            }
        }

        return listaEventosGratis;
    }


    public static List<csvEvento> ListadoEventoGratuitoPostalConcreto(List<csvEvento> listado, String codPostal) {

        List<csvEvento> listaFinal = new ArrayList<>();

        List<csvEvento> temp = ListadoEventoGratuitoCSV(listado);

        for (int i = 0; i < temp.size(); i++) {
            if(temp.get(i).getCodigoPostalInstalacion().replace("\"", "").equals(codPostal)) {
                listaFinal.add(temp.get(i));
            }
        }

        return listaFinal;
    }

    // public static List<Evento> ListadoEventoGratuitoJSON(List<Evento> listado) {
    // List<Evento> listaEventosGratis = new ArrayList<>();

    // for (int i = 0; i < listado.size(); i++) {
    // if (listado.get(i).getFree() == 1) {
    // listaEventosGratis.add(listado.get(i));
    // }
    // }

    // return listaEventosGratis;
    // }

    public static void crearArchivoTextoCSV(String ruta, List<csvEvento> personas) {
        try {

            // Crear un objeto File con la ruta y el nombre del archivo
            File archivo = new File(ruta);

            // Crear el archivo si no existe
            // if (archivo.createNewFile()) {
            // System.out.println("El archivo se ha creado correctamente.");
            // } else {
            // System.out.println("El archivo ya existe.");
            // }

            FileWriter writer = new FileWriter(archivo, false); // Indicamos que reescriba el archivo

            for (csvEvento evento : personas) {
                writer.write(evento.toString());
                writer.write(System.lineSeparator());
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    // public static void crearArchivoTextoJSON(String ruta, jsonEvento jsonEvento) {
    //     try {

    //         File archivo = new File(ruta);

    //         FileWriter writer = new FileWriter(archivo, false); // Indicamos que reescriba el archivo

    //         for (Evento evento : jsonEvento.getEventos()) {
    //             writer.write(evento.toString());
    //             writer.write(System.lineSeparator());
    //         }

    //         writer.close();
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }




    public static Map<String, Integer> contarEventosPorCodPostal(List<csvEvento> lista) {
        Map<String, Integer> contador = new HashMap<>();

        for (csvEvento evento : lista) {
            String codPostal = evento.getCodigoPostalInstalacion();
            contador.put(codPostal, contador.getOrDefault(codPostal, 0) + 1);
        }

        return contador;
    }
    /*
     * 
     * 
     * 
     * 
     * ID-EVENTO 11961228;
     * TITULO "Blas de Lezo y la Guerra del Asiento";
     * PRECIO "";
     * GRATUITO "1";
     * LARGA-DURACION "1";
     * DIAS-SEMANA "L,M,X,J,V,S,D";
     * DIAS-EXCLUIDOS "";
     * FECHA "2023-03-16 00:00:00.0";
     * FECHA-FIN "2023-04-28 23:59:00.0";
     * HORA "";
     * DESCRIPCION "";
     * CONTENT-URL
     * "http://www.madrid.es/sites/v/index.jsp?vgnextchannel=ca9671ee4a9eb410VgnVCM100000171f5a0aRCRD&vgnextoid=93b7976b0e5e6810VgnVCM1000001d4a900aRCRD";
     * TITULO-ACTIVIDAD "";
     * URL-ACTIVIDAD "";
     * URL-INSTALACION
     * "http://www.madrid.es/sites/v/index.jsp?vgnextchannel=bfa48ab43d6bb410VgnVCM100000171f5a0aRCRD&vgnextoid=dc8d531521b74810VgnVCM1000001d4a900aRCRD";
     * NOMBRE-INSTALACION "Centro Cultural Emilia Pardo Baz�n (Salamanca)";
     * ACCESIBILIDAD-INSTALACION "1";
     * CLASE-VIAL-INSTALACION "CALLE";
     * NOMBRE-VIA-INSTALACION "GOYA";
     * NUM-INSTALACION "1";
     * DISTRITO-INSTALACION "SALAMANCA";
     * BARRIO-INSTALACION "RECOLETOS";
     * CODIGO-POSTAL-INSTALACION "28001";
     * COORDENADA-X "441502";
     * COORDENADA-Y "4475253";
     * LATITUD "40.42585800515975";
     * LONGITUD "-3.689601594290468";
     * TIPO "/contenido/actividades/Exposiciones";
     * AUDIENCIA "";
     * 
     */

}
