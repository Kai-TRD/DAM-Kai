package Colecciones.Mastrix.Personajes;

public class Neo extends Personajes{
    // Atributo
    private boolean elegido;
    private int poder;


    // Constructor
    public Neo(int id, String nombre, String nombreCiudad, String fechaCreacion, int edad, boolean elegido, int poder) {
        super(id, nombre, nombreCiudad, fechaCreacion, edad);
        this.elegido = elegido;
        this.poder = poder;
    }
 
    @Override
    public String toString(){
        String salida = "\n--------------------------------------------"; 
            salida += "\nid: " + this.id;
            salida += "\nnombre: " + this.nombre;
            salida += "\nnombreCiudad: " + this.nombreCiudad;
            salida += "\nfechaCreacion: " + this.fechaCreacion;
            salida += "\nedad: " + this.edad;
            salida += "\nelegido: " + this.elegido;
            salida += "\npoder: " + this.poder;
            salida += "\n--------------------------------------------";

        return salida;
    }
    
}
