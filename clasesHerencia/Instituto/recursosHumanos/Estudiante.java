package clasesHerencia.Instituto.recursosHumanos;

public class Estudiante extends Persona {

    private int numeroCarnetEstudiante;
    private double notaMedia;

    public Estudiante(String nombre, int tlf, String email) {
        super(nombre, tlf, email);
    }

    public Estudiante(String nombre, int tlf, String email, int numeroCarnetEstudiante, double notaMedia) {
        super(nombre, tlf, email);
        this.numeroCarnetEstudiante = numeroCarnetEstudiante;
        this.notaMedia = notaMedia;
    }
}