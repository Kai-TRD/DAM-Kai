package tests;
import java.util.List;
import java.util.Map;

import utils.ciclistaUtils;
import modelos.Carrera;
import modelos.Ciclista;

public class pruebas {
    public static void main(String[] args) throws Exception {
        System.out.println("==========CARRERA!==========");

        // List<Equipo> listEquipos =
        // ciclistaUtils.leerEquipo("src/recursos/equipos.csv");
        // System.out.println(listEquipos);

        // System.out.println("===============================================================");

        Map<Integer, Integer> tiemposEtapa1 = ciclistaUtils.leerTiemposDeEtapa("src/recursos/etapa1.json");
        System.out.println(tiemposEtapa1);

        Map<Integer, Integer> tiemposEtapa2 = ciclistaUtils.leerTiemposDeEtapa("src/recursos/etapa2.json");
        System.out.println(tiemposEtapa2);

        Map<Integer, Integer> tiemposEtapa3 = ciclistaUtils.leerTiemposDeEtapa("src/recursos/etapa3.json");
        System.out.println(tiemposEtapa3);

        List<Ciclista> listaCiclistas = ciclistaUtils.LeerListCiclistaFromJsonFile("src/recursos/ciclistas.json");

        // List<Corredor> listaCorredores = new ArrayList();

        Carrera carrera = new Carrera(listaCiclistas, "Vuelta a Málaga");
        System.out.println("\n+========= " + carrera.getNombre() + " etapa1 =========+");

        carrera.insertarTiemposEtapa(tiemposEtapa1);

        for (int i = 0; i < listaCiclistas.size(); i++) {
            System.out.println(carrera.getCorredores().get(i));
        }

        System.out.println("\n+========= " + carrera.getNombre() + " etapa2 =========+");

        carrera.insertarTiemposEtapa(tiemposEtapa2);

        for (int i = 0; i < listaCiclistas.size(); i++) {
            System.out.println(carrera.getCorredores().get(i));
        }

        System.out.println("\n+========= " + carrera.getNombre() + " etapa3 =========+");

        carrera.insertarTiemposEtapa(tiemposEtapa3);
        carrera.ordenarCorredoresPorTiempo();

        for (int i = 0; i < listaCiclistas.size(); i++) {
            System.out.println(carrera.getCorredores().get(i));
        }
        System.out.println("\n---buscarCorredorPorDorsal---------------------");
        System.out.println("buscarPorDolsal: " + carrera.buscarCorredorPorDorsal(3));


        System.out.println("\n-----posiciónCorredor--------------------------");
        System.out.println("posicionCorredor: " + carrera.posicionCorredor(carrera.buscarCorredorPorDorsal(22)));

        System.out.println("\n---clasificacionCompleta-----------------------");
        String algo = carrera.clasificacionCompleta();
        System.out.println(algo);

        System.out.println("\n---clasificacionPorEquipos---------------------");
        String clasEquipo = carrera.clasificacionPorEquipos();            
        System.out.println(clasEquipo);

        System.out.println("\n----podium-------------------------------------");
        String podium = carrera.podium();
        System.out.println(podium);

        System.out.println("\n-----------------------------------------------");


    }
}
