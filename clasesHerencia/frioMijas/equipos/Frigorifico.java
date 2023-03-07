package clasesHerencia.frioMijas.equipos;

public class Frigorifico extends Electrodomesticos{

    private int volumen;
    private int consumo;

    public Frigorifico(int alto, int ancho, int profundidad, int frigorias, String marca) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.volumen = volumen();
        this.consumo = consumo();
    }

    public Frigorifico(int alto, int ancho, int profundidad, int frigorias, String marca, int volumen) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.volumen = volumen();
        this.consumo = consumo();
    }

    public Frigorifico(int alto, int ancho, int profundidad, int frigorias, String marca, int volumen, int consumo) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.volumen = volumen();
        this.consumo = consumo();
    }

    public int volumen(){
        return this.alto * this.ancho;
    }

    public int consumo(){
        return this.frigorias * 3;
    }
    
    @Override
    public String toString() {

        String temp  = " \n\t----- Frigorifico - " + this.marca + " ----- ";
               temp += " \n\t -Alto:" + this.alto;
               temp += " \n\t -Ancho:" + this.ancho;
               temp += " \n\t -Profundidad:" + this.profundidad;
               temp += " \n\t -Frigorias:" + this.frigorias;
               temp += " \n\t -Marca:" + this.marca;
               temp += " \n\t -Volumen:" + this.volumen;
               temp += " \n\t -Consumo:" + this.consumo;
                
        return temp;
    }
}
