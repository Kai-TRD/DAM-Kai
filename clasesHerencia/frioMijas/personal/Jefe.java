package clasesHerencia.frioMijas.personal;

public class Jefe extends Trabajadores {

    private String password;

    public Jefe(String nombre, String apellidos, int edad , double salario, String dni) {
        super(nombre, edad, apellidos, dni, salario);
    }

    public Jefe(String nombre, String apellidos, int edad , double salario, String dni, String password) {
        super(nombre, edad, apellidos, dni, salario);
        this.password = password;
    }
    @Override
    public String toString() {

        String jefe  = " ----- Jefe ----- ";
               jefe += " \n -Nombre:" + this.nombre;
               jefe += " \n -Apellido:" + this.apellidos;
               jefe += " \n -Edad:" + this.edad;
               jefe += " \n -Salario:" + this.salario;
               jefe += " \n -DNI:" + this.dni;

        return jefe;
    }

}
