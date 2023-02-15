package clasesHerencia;

public class Empleado extends Persona
{
    private double salario;
    private String puesto;

    public Empleado(String nombre, int edad, double estatura, double salario, String puesto)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.salario = salario;
        this.puesto = puesto;
    }
}
