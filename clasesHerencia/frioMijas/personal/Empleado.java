package clasesHerencia.frioMijas.personal;

public class Empleado extends Trabajadores {

    public Empleado(String nombre,String apellidos, int edad, double salario, String dni) {
        super(nombre, edad, apellidos, dni, salario);
    }

    @Override
    public String toString() {

        String empleado  = " \n\t-- Empleado -- ";
               empleado += " \n\t -Nombre:" + this.nombre;
               empleado += " \n\t -Apellido:" + this.apellidos;
               empleado += " \n\t -Edad:" + this.edad;
               empleado += " \n\t -Salario:" + this.salario;
               empleado += " \n\t -DNI:" + this.dni;

        return empleado;
    }
}
