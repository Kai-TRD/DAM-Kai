package modelos;

public class Corredor extends Ciclista {

    // Atributos

    // Siendo Integer tengo que definir a 0 ya que es una clase si fuera int entonces
    // es un primirtivo y no hace falta inicializarlo y automaticamente le pone 0
    private Integer dorsal;
    private Integer tiempo;
    // private Ciclista c;

    // Constructor
    public Corredor(Ciclista c, Integer dorsal) {
        super(c.getNombre(), c.getCodigoEquipo(), c.getPeso(), c.getPais());
        this.dorsal = dorsal;
        this.tiempo = 0;
    }

    // Getters y Setters

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Corredor [dorsal=" + dorsal + ", tiempo=" + tiempo + "]";
    }

}
