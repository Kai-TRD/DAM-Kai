package ClasesT6.Trenes.personal;

public class Mecanico {

    // Valores
    private String nombre;
    private int tlf;
    private String especialidad;
    // La especialida dpuede ser frenos, hidráulica, electricidad o motor

    // Contructor

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Mecanico(String nombre, int tlf, String especialidad) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.especialidad = especialidad;
    }
}