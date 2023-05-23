import java.util.List;

import plantilla.Evento;
import utils.madridUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        // List<csvEvento> listaEventos = madridUtils.LeerFicheroEventos("src/fichero/206974-0-agenda-eventos-culturales-100.csv");

        List<Evento> lisaJsonEventos = madridUtils.leerListaEventoFromJSON("src/fichero/206974-0-agenda-eventos-culturales-100.json");
    }
}
