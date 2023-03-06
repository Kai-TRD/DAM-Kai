package clasesHerencia.frioMijas.personal;

import java.util.Arrays;

public class Sede {

    private String ciudad;
    private String direccion;
    private int codigoSede;
    private Jefe jefeDeSede;
    private Empleado[] empleado;

    public Sede(String ciudad, String direccion, int codigoSede){
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoSede = codigoSede;
    }

    public Sede(String ciudad, String direccion, int codigoSede, Jefe jefeDeSede){
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.codigoSede = codigoSede;
    }

    public void setJefe(Jefe jefe2) {
        this.jefeDeSede = jefe2;
    }



    public void addEmpleado(Empleado elemento){
        Empleado[] copia=Arrays.copyOf(empleado, empleado.length+1);
        copia[copia.length]=elemento;
    }
}
