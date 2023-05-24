import java.util.List;
import java.util.Map;

import plantilla.csvEvento;
import plantilla.jsonEvento;
import utils.madridUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Eventos de Madrid!");

        /*
         * Desde una asociación de jubilados de Madrid nos piden encontrar los
         * eventos gratuitos que se realizan en madrid.
         * 
         * 
         * Para ello tenemos la información de los eventos que se producen tanto en csv
         * como en json y además un
         * documento donde se explican los diferentes campos del fichero.
         * 
         * 
         * Debemos procesar los eventos y sacar la siguiente información:
         * 
         * - Listado de eventos gratuitos
         * 
         * - Listado de eventos gratuitos de un código postal en concreto
         * 
         * - Numero de eventos totales por código postal. Debe devolver un diccionario
         *   con el código portal y el número de eventos
         * 
         */

        System.out.println("--------EVENTOS -------------------------------");
        List<csvEvento> eventosCSV = madridUtils.LeerFicheroEventos("src/fichero/206974-0-agenda-eventos-culturales-100.csv");
 
        jsonEvento listadoJson = madridUtils.leerFicheroDiccionarioEvento("src/fichero/206974-0-agenda-eventos-culturales-100.json");

        madridUtils.crearArchivoTextoJSON("src/fichero/eventosGratuitosJSON.txt", listadoJson);
        System.out.println("--------GRATUITO - CSV------------------------------");        
        List<csvEvento> eventosGratuitosCSV = madridUtils.ListadoEventoGratuitoCSV(eventosCSV);
        madridUtils.crearArchivoTextoCSV("src/fichero/eventosGratuitos.txt", eventosGratuitosCSV);


    }
}
