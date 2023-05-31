package plantillas;

import java.util.List;

public class Profesores {

    // Atributos
    private String nombre;
    private String codigo;
    private String especialidad;
    private List<Alumno> alumnos;

    // Constructor
    public Profesores() {

    }

    // getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    // toString
    @Override
    public String toString() {
        return "NOMBRE: " + nombre + "\t CODIGO:" + codigo;
    }

}
