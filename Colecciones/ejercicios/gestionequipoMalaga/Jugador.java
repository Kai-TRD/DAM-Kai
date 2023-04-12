package Colecciones.ejercicios.gestionequipoMalaga;

public class Jugador {

    private String dni;
    private String nombre;
    private Posicion posicion;
    private int altura;

    public Jugador(String dni, String nombre, Posicion posicion, int altura) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.altura = altura;
    }

    public enum Posicion {
        PORTERO,
        DEFENSA,
        CONTRACAMPISTA,
        DELANTERO
    }

    @Override
    public String toString() {
        String salida = "Jugador: " + this.nombre;
        
        return salida;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public int getAltura() {
        return altura;
    }

}
