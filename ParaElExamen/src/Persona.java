public class Persona {
    // Clase de ejemplo
    private String nombre;
    private int edad;
    private String mascota;
    private int tiempo;


    // constructor - no hay que inicializarlos si es un objeto para sacar de json
    // si no es para json hay que poner constrictor
    public Persona() {

    }



    // gets and sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }



    public int getTiempo() {
        return tiempo;
    }



    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    
}
