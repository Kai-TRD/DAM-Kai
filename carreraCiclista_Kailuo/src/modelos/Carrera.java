package modelos;

import java.util.List;
import java.util.Map;

import utils.ciclistaUtils;

public class Carrera {
    
    private List<Equipo> equipos;
    private List<Ciclista> corredores;
    private String nombre;

    public Carrera(List<Equipo> equipos, List<Ciclista> corredores, String nombre) {
        this.equipos = equipos;
        this.corredores = corredores;
        this.nombre = nombre;

    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Ciclista> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Ciclista> corredores) {
        this.corredores = corredores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void insertarTiemposEtapa(Map<Integer, Integer> tiempos) {

            
    }




    
}
