package clasesHerencia.frioMijas.equipos;

public class Electrodomesticos {

    protected int alto;
    protected int ancho;
    protected int profundidad;
    protected int frigorias;
    protected String marca;
    
    public Electrodomesticos(int alto, int ancho, int profundidad, int frigorias, String marca){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.frigorias = frigorias;
        this.marca = marca;
    }
}
