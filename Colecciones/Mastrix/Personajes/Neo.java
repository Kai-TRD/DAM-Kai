package Colecciones.Mastrix.Personajes;

public class Neo extends Personajes{
    // Atributo
    private boolean elegido;
    private int poder;


    // Constructor
    public Neo(int id, String nombre, String nombreCiudad, String fechaCreacion, int edad, int probabilidadMorir, boolean elegido, int poder) {
        super(id, nombre, nombreCiudad, fechaCreacion, edad, probabilidadMorir);
        this.elegido = elegido;
        this.poder = poder;
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
            salida += "elegido: " + this.elegido;
            salida += "poder: " + this.poder;
            salida += "--------------------------------------------";

        return salida;
    }
    
}
