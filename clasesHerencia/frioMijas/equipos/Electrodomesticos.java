package clasesHerencia.frioMijas.equipos;

public class Electrodomesticos {

    protected double alto;
    protected double ancho;
    protected double profundidad;
    protected int frigorias;
    protected String marca;
    
    public Electrodomesticos(double alto, double ancho, double profundidad, int frigorias, String marca){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.frigorias = frigorias;
        this.marca = marca;
    }
}
