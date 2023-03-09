package clasesHerencia.Instituto.recursosHumanos;

public class Profesor extends Persona {

    private double salarioBase;
    private String materia;
    private boolean esTutor;
    private String salario;

    public Profesor(String nombre, int tlf, String email) {
        super(nombre, tlf, email);
    }

    public Profesor(String nombre, int tlf, String email, double salarioBase, String materia, boolean esTutor, String salario) {
        super(nombre, tlf, email);
        this.salarioBase = salarioBase;
        this.materia = materia;
        this.esTutor = esTutor;
        this.salario = salario;
    }
    
}
