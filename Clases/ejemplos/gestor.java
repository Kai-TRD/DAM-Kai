package Clases.ejemplos;

public class gestor {
    
    private String nombre;
    private int telefono;
    private double importeMaximo;

    public double getImporteMaximo() {
        return importeMaximo;
    }
    public void setImporteMaximo(double importeMaximo) {
        if(puesto.equals("Becario")){
            this.importeMaximo = 10000;
        } else
        if(puesto.equals("Ayudante")){
            this.importeMaximo = 50000;
        } else
        if(puesto.equals("Senior")){
            this.importeMaximo = 200000;
        }
        
        this.importeMaximo = importeMaximo;
    }

    private String puesto;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    
    // Contructores
    public gestor(String nombre, int telefono, String puestos){
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = "Becario";
        this.importeMaximo = 10000;
    }

    public gestor(String nombre, int telefono, double importeMaximo, String puesto){
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
        this.puesto = puesto;
    }

    public 

}
