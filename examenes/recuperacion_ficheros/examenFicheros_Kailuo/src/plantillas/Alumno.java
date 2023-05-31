package plantillas;

import java.util.Map;

public class Alumno {

    // Atributo
    private String nombre;
    private String dni;
    private Map<String, Double> notas;

    // Constructor
    public Alumno() {

    }

    // getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Map<String, Double> getNotas() {
        return notas;
    }

    public void setNotas(Map<String, Double> notas) {
        this.notas = notas;
    }

    // toString
    @Override
    public String toString() {
        return this.nombre + ";" + this.dni + ";" + NotaMedia();
    }

    public double NotaMedia() {
        double nm = 0;

        for (double nota : notas.values()) {
            nm += nota;
        }

        return nm/notas.size();
    }

}
