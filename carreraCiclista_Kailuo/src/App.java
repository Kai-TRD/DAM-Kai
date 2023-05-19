import java.util.List;
import java.util.Map;

import modelos.Carrera;
import modelos.Ciclista;
import utils.ciclistaUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("==========CARRERA!==========");
        Map<Integer, Integer> tiemposEtapa1 = ciclistaUtils.leerTiemposDeEtapa("src/recursos/etapa1.json");
        // System.out.println(tiemposEtapa1);

        Map<Integer, Integer> tiemposEtapa2 = ciclistaUtils.leerTiemposDeEtapa("src/recursos/etapa2.json");
        // System.out.println(tiemposEtapa2);

        Map<Integer, Integer> tiemposEtapa3 = ciclistaUtils.leerTiemposDeEtapa("src/recursos/etapa3.json");
        // System.out.println(tiemposEtapa3);

        List<Ciclista> listaCiclistas = ciclistaUtils.LeerListCiclistaFromJsonFile("src/recursos/ciclistas.json");

        // List<Corredor> listaCorredores = new ArrayList();

        Carrera carrera = new Carrera(listaCiclistas, "Vuelta a Málaga");

        carrera.insertarTiemposEtapa(tiemposEtapa1);
        carrera.insertarTiemposEtapa(tiemposEtapa2);
        carrera.insertarTiemposEtapa(tiemposEtapa3);

        String contenido = "==== " + carrera.getNombre() + " ====";

        contenido += "\n\n====CICLISTAS PARTICIPANTES EN LA CARRERA ====\n";
        for (int i = 0; i < listaCiclistas.size(); i++) {
            contenido += "\n" + carrera.getCorredores().get(i).getDorsal()
                    + " - " + carrera.getCorredores().get(i).getNombre()
                    + "(" + carrera.getCorredores().get(i).getCodigoEquipo() + ")";
        }

        contenido += "\n\n==== CLASIFICACION FINAL ====\n";
        contenido += carrera.clasificacionCompleta();

        contenido += "\n\n==== PODIUM ====\n";
        contenido += carrera.podium();

        contenido += "\n\n==== CLASIFICACIÓN POR EQUIPOS====\n";
        contenido += carrera.clasificacionPorEquipos();

        contenido += "\n\n==== POSICIÓN DEL CORREDOR: Wilco Kelderman(BOHA) Dorsal: 22 ====\n";
        contenido += "Posicion del jugador: " + carrera.posicionCorredor(carrera.buscarCorredorPorDorsal(22));

        ciclistaUtils.crearArchivoTexto("src/recursos/VueltaAMalaga.txt", contenido);

    }
}
