package modelos;

public class Corredor extends Ciclista {

    // Atributos
    private int dorsal;
    private int tiempo;
    private Ciclista c;

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

}
