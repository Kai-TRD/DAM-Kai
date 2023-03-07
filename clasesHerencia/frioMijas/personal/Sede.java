package clasesHerencia.frioMijas.personal;

import java.util.Arrays;

import clasesHerencia.frioMijas.equipos.Electrodomesticos;

public class Sede {

    private String ciudad;
    private String direccion;
    private int codigoSede;
    public Empleado[] empleado;
    private Jefe jefe;
    public Electrodomesticos[] electrodomesticos;

    public Sede(String ciudad, String direccion, int codigoSede){
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoSede = codigoSede;
        this.empleado = new Empleado[0];
        this.electrodomesticos = new Electrodomesticos[0];
        }

    public Sede(String ciudad, String direccion, int codigoSede, Jefe jefe){
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoSede = codigoSede;
        this.jefe = jefe;
        this.empleado = new Empleado[0];
        this.electrodomesticos = new Electrodomesticos[0];
    }

    public Sede(String ciudad, String direccion, int codigoSede, Jefe jefe, Empleado[] empleado){
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoSede = codigoSede;
        this.jefe = jefe;
        this.empleado = new Empleado[0];
        this.electrodomesticos = new Electrodomesticos[0];
    }

    public Sede(String ciudad, String direccion, int codigoSede, Jefe jefe, Empleado[] empleado, Electrodomesticos[] electrodomesticos){
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoSede = codigoSede;
        this.jefe = jefe;
        this.empleado = new Empleado[0];
        this.electrodomesticos = new Electrodomesticos[0];
    }

    

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public void addEmpleado(Empleado elemento) {
        boolean repetido = false;
        for (int i = 0; i < empleado.length; i++) {
            if(empleado[i].getDni().equals(elemento.getDni())){
                repetido = true;
            }
        }
        if(!repetido){
            Empleado[] copia=Arrays.copyOf(empleado, empleado.length+1);
            copia[copia.length-1]=elemento;
            this.empleado = copia;
        }
    }

    public void addElectrodomesticos(Electrodomesticos elemento) {
        Electrodomesticos[] copia=Arrays.copyOf(electrodomesticos, electrodomesticos.length+1);
        copia[copia.length-1]=elemento;
        this.electrodomesticos = copia;
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
               jefe += " \n -Electrodomesticos:";
               for (int i = 0; i < electrodomesticos.length; i++) {
                    jefe += electrodomesticos[i];
               }

        return jefe;
    }
}
