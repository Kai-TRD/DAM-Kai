package clasesHerencia.frioMijas.personal;

public class Trabajadores {
    
    protected String nombre;
    protected int edad;
    protected String apellidos;
    protected String dni;
    protected double salario;
    protected int codUnico;

    public Trabajadores(String nombre,int edad,String apellidos,String dni,double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.dni = dni;
        this.salario = salario;
    }
}
