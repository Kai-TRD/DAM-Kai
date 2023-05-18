import java.util.List;
import java.util.Map;

import modelos.Carrera;
import modelos.Ciclista;
import utils.ciclistaUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("==========CARRERA!==========");
        Map<Integer, Integer> tiemposEtapa1 = ciclistaUtils.leerTiemposDeEtapa("src/recursos/etapa1.json");
        System.out.println(tiemposEtapa1);

        Map<Integer, Integer> tiemposEtapa2 = ciclistaUtils.leerTiemposDeEtapa("src/recursos/etapa2.json");
        System.out.println(tiemposEtapa2);

        Map<Integer, Integer> tiemposEtapa3 = ciclistaUtils.leerTiemposDeEtapa("src/recursos/etapa3.json");
        System.out.println(tiemposEtapa3);

        List<Ciclista> listaCiclistas = ciclistaUtils.LeerListCiclistaFromJsonFile("src/recursos/ciclistas.json");

        // List<Corredor> listaCorredores = new ArrayList();

        Carrera carrera = new Carrera(listaCiclistas, "Vuelta a Málaga");

        String contenido = "====NOMBRE DE LA CARRERA ====";
        contenido += "\n====CICLISTAS PARTICIPANTES EN LA CARRERA ====";
        for (int i = 0; i < listaCiclistas.size(); i++) {
            System.out.println(listaCiclistas.get(i).toString());
        }

        ciclistaUtils.crearArchivoTexto("src/recursos/prueba.txt", contenido);

        /*
         * ====CICLISTAS PARTICIPANTES EN LA CARRERA ====
         * ==== CLASIFICACIÓN FINAL ====
         * ==== PODIUM ====
         * ==== CLASIFICACIÓN POR EQUIPOS====
         * ==== POSICIÓN DEL CORREDOR: Wilco Kelderman(BOHA) Dorsal: 22 ====
         */
    }
}
