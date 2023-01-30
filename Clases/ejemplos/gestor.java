package Clases.ejemplos;

public class gestor {
    
    private String nombre;
    private int telefono;
    private double importeMaximo;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    
    // Contructores
    public gestor(String nombre, int telefono){
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10000;
    }

    public gestor(String nombre, int telefono, double importeMaximo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }



}
