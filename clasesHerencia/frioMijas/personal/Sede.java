package clasesHerencia.frioMijas.personal;

import java.util.Arrays;

public class Sede {

    private String ciudad;
    private String direccion;
    private int codigoSede;
    public Empleado[] empleado;
    private Jefe jefe;

    public Sede(String ciudad, String direccion, int codigoSede){
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoSede = codigoSede;
        this.empleado = new Empleado[0];
        }

    public Sede(String ciudad, String direccion, int codigoSede, Jefe jefe){
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoSede = codigoSede;
        this.jefe = jefe;
        this.empleado = new Empleado[0];
    }

    public Sede(String ciudad, String direccion, int codigoSede, Jefe jefe, Empleado[] empleado){
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoSede = codigoSede;
        this.jefe = jefe;
        // this.empleado = empleado;
        this.empleado = new Empleado[0];
    }

    

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public void addEmpleado(Empleado elemento) {
        Empleado[] copia=Arrays.copyOf(empleado, empleado.length+1);
        copia[copia.length-1]=elemento;
        this.empleado = copia;
    }

    @Override
    public String toString() {

        String jefe  = " \n----- Sede ----- ";
               jefe += " \n -Coudad:" + this.ciudad;
               jefe += " \n -Direccion:" + this.direccion;
               jefe += " \n -Cod.Sede:" + this.codigoSede;
               jefe += " \n -Jefe de sede:" + this.jefe;
               jefe += " \n -Empleados:";
               for (int i = 0; i < empleado.length; i++) {
                    jefe += empleado[i];
               }
        return jefe;
    }
}
