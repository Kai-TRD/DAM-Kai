package clasesHerencia.frioMijas.equipos;

public class Minibar extends Electrodomesticos{

    private int numeroDeBaldas;
    private int consumo;

    public Minibar(int alto, int ancho, int profundidad, int frigorias, String marca) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.consumo = consumo();
    }

    public Minibar(int alto, int ancho, int profundidad, int frigorias, String marca, int numeroDeBaldas) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.numeroDeBaldas = numeroDeBaldas;
        this.consumo = consumo();
    }

    public Minibar(int alto, int ancho, int profundidad, int frigorias, String marca, int numeroDeBaldas, int consumo) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.numeroDeBaldas = numeroDeBaldas;
        this.consumo = consumo();
    }
    public int consumo(){
        return this.consumo = this.frigorias * 3;
    }

    @Override
    public String toString() {

        String temp  = " \n\t----- Miibar - " + this.marca + " ----- ";
               temp += " \n\t -Alto:" + this.alto;
               temp += " \n\t -Ancho:" + this.ancho;
               temp += " \n\t -Profundidad:" + this.profundidad;
               temp += " \n\t -Frigorias:" + this.frigorias;
               temp += " \n\t -Marca:" + this.marca;
               temp += " \n\t -Numero de baldas:" + this.numeroDeBaldas;
               temp += " \n\t -Consumo:" + this.consumo;
                
        return temp;
    }
}
