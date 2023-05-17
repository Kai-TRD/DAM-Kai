package modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import javax.swing.event.ListDataEvent;

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

        List<Corredor> listaFormatAndSort = new ArrayList<>(corredores);

        listaFormatAndSort.ordenarCorredoresPorTiempo();

        return null;

    }
}
