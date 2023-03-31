package Colecciones.Mastrix.Personajes;

public class Smith extends Personajes {

    // Atributo
    private int poderInfeccion;


    // Constructor
    public Smith(int id, String nombre, String nombreCiudad, String fechaCreacion, int edad, int probabilidadMorir, int poderInfeccion) {
        super(id, nombre, nombreCiudad, fechaCreacion, edad, probabilidadMorir);
        this.poderInfeccion = poderInfeccion;
    }

    @Override
    public String toString(){
        String salida = "--------------------------------------------"; 
            salida += "id: " + this.id;
            salida += "nombre: " + this.nombre;
            salida += "nombreCiudad: " + this.nombreCiudad;
            salida += "fechaCreacion: " + this.fechaCreacion;
            salida += "edad: " + this.edad;
            salida += "probabilidadMorir: " + this.probabilidadMorir;
            salida += "poderInfeccion: " + this.poderInfeccion;
            salida += "--------------------------------------------";

        return salida;
    }

}
