package ClasesAvanzadas.Animales;

public abstract class Ave extends Animal{

    public Ave(String sonido, int nExtremidades, String color, String habitad) {
        super(sonido, nExtremidades, color, habitad);
        //TODO Auto-generated constructor stub
    }

    public abstract String hacerSonido();

}
