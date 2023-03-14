package Interfaz.ejercicios;

public class Cliente {
    

    // Atributo
    String nombre;
    double dinero;

    // Constructor
    public Cliente(String nombre, double dinero){
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    
}
