package modelos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import utils.ciclistaUtils;

public class Carrera {

    private List<Equipo> equipos;
    private List<Corredor> corredores;
    private String nombre;

    /**
     * Convierte la lista de ciclistas en corredores y le da un nombre a la carrera
     * “Vuelta a Málaga”
     * 
     * @param listaCiclistas
     * @param nombre
     */
    public Carrera(List<Ciclista> listaCiclistas, String nombre) {

        int contDorsal = 1;

        corredores = new ArrayList<>();

        for (Ciclista c : listaCiclistas) {
            Corredor corredor = new Corredor(c, contDorsal);
            corredores.add(corredor);

            contDorsal++;
        }

        this.nombre = nombre;

    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Corredor> corredores) {
        this.corredores = corredores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Inserta los tiempos de los corredores - si hay mas de 1 etapa entonces se
     * suman junto a las anteriores
     * 
     * @param tiempos
     */
    public void insertarTiemposEtapa(Map<Integer, Integer> tiempos) {

        List<Corredor> nuevoCorredores = new ArrayList<>(corredores);

        int maxTiempo = 0;

        for (int i = 0; i < corredores.size(); i++) {
            if (tiempos.get(i) == null) {

            } else if (tiempos.get(i) > maxTiempo) {
                maxTiempo = tiempos.get(i);
            }
        }

        System.out.println("maxTiempo: " + maxTiempo);

        for (int i = 0; i < nuevoCorredores.size(); i++) {
            int dorsalCorredor = nuevoCorredores.get(i).getDorsal();

            if (tiempos.containsKey(dorsalCorredor)) {
                nuevoCorredores.get(i).setTiempo(
                        nuevoCorredores.get(i).getTiempo() + tiempos.get(nuevoCorredores.get(i).getDorsal()));
            } else {
                nuevoCorredores.get(i).setTiempo(nuevoCorredores.get(i).getTiempo() + maxTiempo);
            }
        }

        setCorredores(nuevoCorredores);
    }

    // ordena los corredores por tiempo total empleado en la carrera, de menor a
    // mayor
    public void ordenarCorredoresPorTiempo() {
        Collections.sort(corredores, new Comparator<Corredor>() {
            @Override
            public int compare(Corredor corredor1, Corredor corredor2) {
                return Integer.compare(corredor1.getTiempo(), corredor2.getTiempo());
            }
        });
        System.out.println("--- Ordenado por tiempo ---");
    }

    /**
     * Pasas un dorsal y este te devuelve el corredor
     * 
     * @param dorsal
     * @return
     */
    public Corredor buscarCorredorPorDorsal(int dorsal) {
        for (int i = 0; i < corredores.size(); i++) {
            if (corredores.get(i).getDorsal() == dorsal) {
                return corredores.get(i);
            }
        }

        return null;
    }

    /**
     * 
     * @param c
     * @return
     */
    public Integer posiciónCorredor(Corredor c) {

        System.out.println(c);
        for (int i = 0; i < corredores.size(); i++) {
            if (corredores.get(i).equals(c)) {
                return i;
            }
        }
        return null;
    }

    /**
     * Devuelve el pelotón completo ordenado por tiempo, cada linea será un
     * ciclista con este formato: “dorsal – NombreCiclista (codEquipo) : tiempo”
     * 
     * @return
     */
    public String clasificacionCompleta() {

        List<Corredor> listaFormatAndSort = ciclistaUtils.ordenar(corredores);

        String lista = "dorsal - NombreCiclista (codEquipo) : tiempo";
        for (int i = 0; i < listaFormatAndSort.size(); i++) {
            lista += "\n" + listaFormatAndSort.get(i).getDorsal() + " - " + listaFormatAndSort.get(i).getNombre() + " ("
                    + listaFormatAndSort.get(i).getCodigoEquipo() + ") : " + listaFormatAndSort.get(i).getTiempo();
        }

        // System.out.println(listaFormatAndSort);

        return lista;
    }

    /**
     * Para calcular la clasificación por equipos se toman los 3 mejores
     * corredores de cada equipo y se suman sus tiempo.
     * (Puede haber equipos que no tienen corredores en alguna carrera
     * en tal caso no deben aparecer en el resultado.
     * 
     * @return
     * @throws IOException
     */
    public String clasificacionPorEquipos() throws IOException {

        List<Equipo> equipos = ciclistaUtils.leerEquipo("src/recursos/equipos.csv");

        List<Corredor> corredoresOrdenados = ciclistaUtils.ordenar(corredores);

        List<Corredor> temp = new ArrayList<>();

        String clasificacion = "--- Clasificacion de los equipos ---";

        int tiempo = 0;

        // Recorres fori de equipos, luego dentro otro fori donde esten corredores
        // si coincide con equipo.get(i) entonces añades a la lista de equipos ordenados

        for (int i = 0; i < equipos.size(); i++) {
            for (int j = 0; j < corredoresOrdenados.size(); j++) {
                if (corredoresOrdenados.get(j).getCodigoEquipo().equals(equipos.get(i).getCodigo())) {
                    temp.add(corredoresOrdenados.get(j));
                }

            }

            // guntar el tiempo de los 3
            for (int j = 0; j < 3; j++) {
                if (i < temp.size()) {
                    tiempo += temp.get(i).getTiempo();
                }
            }

            // Poner las cosas en el String
            if (tiempo != 0) {
                clasificacion += "\n" + equipos.get(i).getNombre() + "(" + equipos.get(i).getCodigo() + ") - time: " + tiempo;
            }

            // Reiniciamos valores
            temp.clear();
            tiempo = 0;
        }

        for (int i = 0; i < temp.size(); i++) {
            System.out.println(temp.get(i));
        }

        return clasificacion;
    }


    public String podium() {

        String podium = "=========== PODIUM ====================";
        List<Corredor> corredoresOrdenados = ciclistaUtils.ordenar(corredores);

        for (int i = 0; i < 3; i++) {
            podium += "\nPuesto " + (i+1) + ": " + corredoresOrdenados.get(i).getDorsal() + " - " + corredoresOrdenados.get(i).getNombre() + " ("
                    + corredoresOrdenados.get(i).getCodigoEquipo() + ") : " + corredoresOrdenados.get(i).getTiempo();

        }

        return podium;
    }

}