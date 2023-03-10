package examenT6y7.pasajero;

public class Pasajero {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private boolean derechoCamarote;

    private int codUnico;
    private int contador;

    public Pasajero(String nombre, String apellido, String nacionalidad, boolean derechoCamarote){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.derechoCamarote = derechoCamarote;
        
        this.codUnico = generarCodUnico(contador);
    }


    public int generarCodUnico(int contador){
        return (int)(Math.random()*1000+1000);
    }


    // getter de pasajero
    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }


    public boolean isDerechoCamarote() {
        return derechoCamarote;
    }


    public int getCodUnico() {
        return codUnico;
    }

    @Override
    public String toString(){
        String persona = this.nombre + " - " + this.apellido + " - " + this.nacionalidad + " - Camarote: " + this.derechoCamarote + " (Codigo=" + this.codUnico + " ) ";
        return persona;
    }

}