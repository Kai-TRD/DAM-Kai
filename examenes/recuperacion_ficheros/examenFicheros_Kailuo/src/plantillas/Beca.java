package plantillas;

public class Beca {
    
    // Atributos
    private String asignatura;
    private double nota;

    // Constructor
    public Beca(String asignatura, double nota) {
        this.asignatura = asignatura;
        this.nota = nota;
    }

    // getter and setter
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
