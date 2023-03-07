package clasesHerencia.frioMijas.equipos;

public class Arcon extends Electrodomesticos{

    public enum tipoApertura{LATERAL, HORIZONTAL, PERSIANA}

    private tipoApertura tipoApertura;
    private int consumo;

    public Arcon(int alto, int ancho, int profundidad, int frigorias, String marca) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.consumo = consumo();
    }

    public Arcon(int alto, int ancho, int profundidad, int frigorias, String marca, tipoApertura tipoApertura) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.tipoApertura = tipoApertura;
        this.consumo = consumo();
    }

    public Arcon(int alto, int ancho, int profundidad, int frigorias, String marca, tipoApertura tipoApertura, int consumo) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.tipoApertura = tipoApertura;
        this.consumo = consumo();
    }

    public int consumo(){
        return frigorias * 2;
    }

    @Override
    public String toString() {

        String temp  = " \n\t----- Arcon - " + this.marca + " ----- ";
               temp += " \n\t -Alto:" + this.alto;
               temp += " \n\t -Ancho:" + this.ancho;
               temp += " \n\t -Profundidad:" + this.profundidad;
               temp += " \n\t -Frigorias:" + this.frigorias;
               temp += " \n\t -Marca:" + this.marca;
               temp += " \n\t -Tipo Apertura:" + this.tipoApertura;
               temp += " \n\t -Consumo:" + this.consumo;
                
        return temp;
    }
}
