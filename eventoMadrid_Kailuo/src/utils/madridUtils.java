package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
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

                    String idEvento = separado[0];
                    String titulo = separado[1];
                    String gratuito = separado[3];
                    String codigoPostalInstalacion = separado[separado.length-7];

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






/*

    1   idEvento                    11768385;
    2   titulo                      "�a Marche. Los figurantes. Un retrato poli�drico de la imagen de la infancia";
    3   precio                      "12 euros";
    4   gratuito                    "0";
    5   largaDuracion               "0";
    6   diasSemana                  "";
    7   diasExcluidos               "";
    8   fecha                       "2023-05-06 00:00:00.0";
    9   fechaFin                    "2023-05-06 23:59:00.0";
    10  hora                        "20:00";
    11  descripcion                 "";
    12  contentUrl                  "http://www.madrid.es/sites/v/index.jsp?vgnextchannel=ca9671ee4a9eb410VgnVCM100000171f5a0aRCRD&vgnextoid=7ad0afbfa0423810VgnVCM1000001d4a900aRCRD";
    13  tituloActividad             "�a Marche. Los figurantes. Un retrato poli�drico de la imagen de la infancia.";
    14  urlActividad                "http://www.madrid.es/sites/v/index.jsp?vgnextchannel=ca9671ee4a9eb410VgnVCM100000171f5a0aRCRD&vgnextoid=2fd0afbfa0423810VgnVCM1000001d4a900aRCRD";
    15  urlInstalacion              "http://www.madrid.es/sites/v/index.jsp?vgnextchannel=bfa48ab43d6bb410VgnVCM100000171f5a0aRCRD&vgnextoid=64463d0b5e71c010VgnVCM1000000b205a0aRCRD";
    16  nombreInstalacion           "Centro de Cultura Contempor�nea Conde Duque";
    17  accesibilidadInstalacion    "1";
    18  claseVialInstalacion        "CALLE";
    19  nombreViaInstalacion        "CONDE DUQUE";
    20  numInstalacion              "9";
    21  distritoInstalacion         "CENTRO";
    22  barrioInstalacion           "UNIVERSIDAD";
    23  codigoPostalInstalacion     "28015";
    24  coordenadaX                 "439759";
    25  coordenadaY                 "4475508";
    26  latitud                     "40.42802889001877";
    27  longitud                    "-3.710182353581842";
    28  tipo                        "/contenido/actividades/ProgramacionDestacadaAgendaCultura";
    29  audiencia                   "";


 */

















    public static List<Evento> leerListaEventoFromJSON(String filePath) {
        File ficheroEvento = new File(filePath);

        ObjectMapper objectMapper = new ObjectMapper();

        List<Evento> listaEvento = null;
        try {
            listaEvento = objectMapper.readValue(ficheroEvento, new TypeReference<List<Evento>>() {
            });
        } catch (IOException e) {

            e.printStackTrace();
        }

        return listaEvento;
    }

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
}
