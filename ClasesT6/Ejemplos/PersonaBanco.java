package ClasesT6.Ejemplos;

public class PersonaBanco {
    // Atributos

    private String nombre;
    private String accion;
    private double importe;

    // Contructores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public PersonaBanco(String nombre, String accion, double importe) {
        this.nombre = nombre;
        this.accion = accion;
        this.importe = importe;
    }




    @Override
    public String toString(){
        return this.nombre + "-" + this.accion + "-" + this.importe + "€"; 
    }
}
