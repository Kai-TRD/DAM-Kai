import java.util.List;

import plantilla.Evento;
import plantilla.jsonEvento;
import utils.madridUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Eventos de Madrid!");


        // List<csvEvento> listaEventos = madridUtils.LeerFicheroEventos("src/fichero/206974-0-agenda-eventos-culturales-100.csv");

        // List<Evento> lisaJsonEventos = madridUtils.leerListaEventoFromJSON("src/fichero/206974-0-agenda-eventos-culturales-100.json");

        jsonEvento prueba = madridUtils.leerFicheroDiccionarioEvento("src/fichero/206974-0-agenda-eventos-culturales-100.json");

        for (int i = 0; i < prueba.getEventos().size(); i++) {
            System.out.println(prueba.getEventos().get(i));
        }
    }
}
