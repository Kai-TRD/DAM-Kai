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

            while (lineaFichero != null) {

                // La separacion en este caso es un punto y coma (";")
                String[] separado = lineaFichero.split(";");

                try {

                    String idEvento = separado[0];
                    String titulo = separado[1];
                    String precio = separado[2];
                    String gratuito = separado[3];
                    String largaDuracion = separado[4];
                    String diasSemana = separado[5];
                    String diasExcluidos = separado[6];
                    String fecha = separado[7];
                    String fechaFin = separado[8];
                    String hora = separado[9];
                    String descripcion = separado[10];
                    String contentUrl = separado[11];
                    String tituloActividad = separado[12];
                    String urlActividad = separado[13];
                    String urlInstalacion = separado[14];
                    String nombreInstalacion = separado[15];
                    String accesibilidadInstalacion = separado[16];
                    String claseVialInstalacion = separado[17];
                    String nombreViaInstalacion = separado[18];
                    String numInstalacion = separado[19];
                    String distritoInstalacion = separado[20];
                    String barrioInstalacion = separado[21];
                    String codigoPostalInstalacion = separado[22];
                    String coordenadaX = separado[23];
                    String coordenadaY = separado[24];
                    String latitud = separado[25];
                    String longitud = separado[26];
                    String tipo = separado[27];
                    String audiencia = separado[28];

                    
                    csvEvento EventoTemp = new csvEvento(idEvento, titulo, precio, gratuito, largaDuracion, diasSemana, diasExcluidos, fecha, fechaFin, hora, descripcion, contentUrl, tituloActividad, urlActividad, urlInstalacion, nombreInstalacion, accesibilidadInstalacion, claseVialInstalacion, nombreViaInstalacion, numInstalacion, distritoInstalacion, barrioInstalacion, codigoPostalInstalacion, coordenadaX, coordenadaY, latitud, longitud, tipo, audiencia);
                    
                    Eventos.add(EventoTemp);
                    
                        

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
