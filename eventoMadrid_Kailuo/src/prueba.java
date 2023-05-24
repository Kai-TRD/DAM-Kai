import java.util.List;

import plantilla.csvEvento;
import plantilla.jsonEvento;
import utils.madridUtils;

public class prueba {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Eventos de Madrid!");


        List<csvEvento> listaEventos = madridUtils.LeerFicheroEventos("src/fichero/206974-0-agenda-eventos-culturales-100.csv");

        for (int i = 0; i < listaEventos.size(); i++) {
            System.out.println(i + " - " +listaEventos.get(i));
        }

        jsonEvento prueba = madridUtils.leerFicheroDiccionarioEvento("src/fichero/206974-0-agenda-eventos-culturales-100.json");

        for (int i = 0; i < prueba.getEventos().size(); i++) {
            System.out.println(prueba.getEventos().get(i));
        }
    }
}
