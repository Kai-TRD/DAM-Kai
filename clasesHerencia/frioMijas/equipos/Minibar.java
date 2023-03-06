package clasesHerencia.frioMijas.equipos;

public class Minibar extends Electrodomesticos{

    private int numeroDeBaldas;

    public Minibar(double alto, double ancho, double profundidad, int frigorias, String marca) {
        super(alto, ancho, profundidad, frigorias, marca);
    }

    public Minibar(double alto, double ancho, double profundidad, int frigorias, String marca, int numeroDeBaldas) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.numeroDeBaldas = numeroDeBaldas;
    }
}
