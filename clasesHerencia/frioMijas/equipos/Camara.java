package clasesHerencia.frioMijas.equipos;

public class Camara extends Electrodomesticos{

    private int temperaturaMin;
    private int temperaturaMax;
    private int volumen;
    private int consumo;

    public Camara(int alto, int ancho, int profundidad, int frigorias, String marca) {
        super(alto, ancho, profundidad, frigorias, marca);
    }

    public Camara(int alto, int ancho, int profundidad, int frigorias, String marca, int temperaturaMin, int temperaturaMax) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.temperaturaMin = temperaturaMin;
        this.temperaturaMax = temperaturaMax;
        this.volumen = volumen();
        this.consumo = consumo();
    }

    public Camara(int alto, int ancho, int profundidad, int frigorias, String marca, int temperaturaMin, int temperaturaMax, int volumen) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.temperaturaMin = temperaturaMin;
        this.temperaturaMax = temperaturaMax;
        this.volumen = volumen();
        this.consumo = consumo();
    }

    public Camara(int alto, int ancho, int profundidad, int frigorias, String marca, int temperaturaMin, int temperaturaMax, int volumen, int consumo) {
        super(alto, ancho, profundidad, frigorias, marca);
        this.temperaturaMin = temperaturaMin;
        this.temperaturaMax = temperaturaMax;
        this.volumen = volumen();
        this.consumo = consumo();
    }


    public int volumen(){
        return this.alto * this.ancho;
    }

    public int consumo(){
        return frigorias * 5;
    }
    
    @Override
    public String toString() {

        String temp  = " \n\t----- Camara - " + this.marca + " ----- ";
               temp += " \n\t -Alto:" + this.alto;
               temp += " \n\t -Ancho:" + this.ancho;
               temp += " \n\t -Profundidad:" + this.profundidad;
               temp += " \n\t -Frigorias:" + this.frigorias;
               temp += " \n\t -Marca:" + this.marca;
               temp += " \n\t -Temperatura Minima:" + this.temperaturaMin;
               temp += " \n\t -Temperatura Maxima:" + this.temperaturaMax;
               temp += " \n\t -Volumen:" + this.volumen;
               temp += " \n\t -Consumo:" + this.consumo;
                
        return temp;
    }

    
}
