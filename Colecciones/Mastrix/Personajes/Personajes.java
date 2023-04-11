package Colecciones.Mastrix.Personajes;

public class Personajes {

    // Atributos
    protected int id;
    protected String nombre;
    protected String nombreCiudad;
    protected String fechaCreacion;
    protected int edad;

    // Contructor
    public Personajes(int id, String nombre, String nombreCiudad, String fechaCreacion, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.nombreCiudad = nombreCiudad;
        this.fechaCreacion = fechaCreacion;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public int getEdad() {
        return edad;
    }

    
}
