package clasesHerencia.frioMijas.RecursosHumanos;

public class Empleado extends Trabajadores {

    public Empleado(String nombre,String apellidos, int edad, double salario, String dni) {
        super(nombre, edad, apellidos, dni, salario);
    }

    @Override
    public String toString() {

        String empleado  = " --- Empleado --- ";
               empleado += " \n -Nombre:" + this.nombre;
               empleado += " \n -Apellido:" + this.apellidos;
               empleado += " \n -Edad:" + this.edad;
               empleado += " \n -Salario:" + this.salario;
               empleado += " \n -DNI:" + this.dni;

        return empleado;
    }
}
