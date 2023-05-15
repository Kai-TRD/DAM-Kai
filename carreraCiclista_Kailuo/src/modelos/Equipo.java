package modelos;

public class Equipo {

    // Atributos
    private String codigo;
    private String nombre;
    private String nacionalidad;
    private int presupuesto;

    // Constructor
    // public Equipo(String codigo, String nombre, String nacionalidad, int presupuesto) {

    //     this.codigo = codigo;
    //     this.nombre = nombre;
    //     this.nacionalidad = nacionalidad;
    //     this.presupuesto = presupuesto;

    // }

    // Getter y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

}
