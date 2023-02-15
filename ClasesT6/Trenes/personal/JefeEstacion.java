package ClasesT6.Trenes.personal;

public class JefeEstacion {
    // Valores
    private String nombre;
    private String dni;
    private String fechaNombramiento;

    // Contructor
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    public JefeEstacion(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public JefeEstacion(String nombre, String dni, String fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }

}