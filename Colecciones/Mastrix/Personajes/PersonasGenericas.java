package Colecciones.Mastrix.Personajes;

public class PersonasGenericas extends Personajes {

    
    

    public PersonasGenericas(int id, String nombre, String nombreCiudad, String fechaCreacion, int edad,
            int probabilidadMorir) {
        super(id, nombre, nombreCiudad, fechaCreacion, edad, probabilidadMorir);
    }

    @Override
    public String toString(){
        String salida = "\n--------------------------------------------"; 
            salida += "\nid: " + this.id;
            salida += "\nnombre: " + this.nombre;
            salida += "\nnombreCiudad: " + this.nombreCiudad;
            salida += "\nfechaCreacion: " + this.fechaCreacion;
            salida += "\nedad: " + this.edad;
            salida += "\nprobabilidadMorir: " + this.probabilidadMorir;
            salida += "\n--------------------------------------------";

        return salida;
    }


}
