package ClasesT6.Ejemplos;

public class Incidencia {
    
    enum EstadoIncidencia{Pendiente, Resuelta};

    // Atributos
    private int codIncidencia;
    private String descripcion;
    private int numIncidenciaCreadas;
    // private EstadoIncidencia estado;
    private String solucion;
    private static int Pendientes; 
    private int codigo;
    public static int getPendientes() {
        return Pendientes;
    }


    // Constructores
    public Incidencia(int codIncidencia, String descripcion){
        this.codIncidencia = codIncidencia; 
        this.descripcion = descripcion;
        // this.estado = EstadoIncidencia.Pendiente;
        this.solucion = "Pendientes";
        // this.Pendientes += 1;
        numIncidenciaCreadas++;
        this.codigo = numIncidenciaCreadas;
    }





public void resuelve(String solucion){
    // this.estado = EstadoIncidencia.Resuelta;
    this.solucion = solucion;
    // this.Pendientes -= 1;
}


@Override
public String toString(){    
    return "Incidencia " + codigo + " - Puesto: "+ this.codIncidencia +" - "+ this.descripcion +" - " + this.solucion;
}










}
