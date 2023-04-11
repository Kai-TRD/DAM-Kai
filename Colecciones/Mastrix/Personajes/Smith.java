package Colecciones.Mastrix.Personajes;

public class Smith extends Personajes {

    // Atributo
    private int poderInfeccion;


    // Constructor
    public Smith(int id, String nombre, String nombreCiudad, String fechaCreacion, int edad, int poderInfeccion) {
        super(id, nombre, nombreCiudad, fechaCreacion, edad);
        this.poderInfeccion = poderInfeccion;
    }

    @Override
    public String toString(){
        String salida = "\n--------------------------------------------"; 
            salida += "\nid: " + this.id;
            salida += "\nnombre: " + this.nombre;
            salida += "\nnombreCiudad: " + this.nombreCiudad;
            salida += "\nfechaCreacion: " + this.fechaCreacion;
            salida += "\nedad: " + this.edad;
            salida += "\npoderInfeccion: " + this.poderInfeccion;
            salida += "\n--------------------------------------------";

        return salida;
    }

}
