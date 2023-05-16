import java.util.Map;

import javax.swing.text.Utilities;

import utils.ciclistaUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("==========CICLISTAS!==========");

        ciclistaUtils.leerEquipo("src/recursos/equipos.csv");

        System.out.println("===============================================================");

        Map<Integer, Integer> dic =  ciclistaUtils.leerTiemposDeEtapa("src/recursos/etapa1.json");
        System.out.println(dic);
    }
}
