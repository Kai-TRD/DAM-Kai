package ClasesT6.Ejemplos;

public class Punto {
    // Atributos
    private double coordenadaX;
    private double coordenadaY;

    // Constructor
    public Punto(double coordenadaX, double coordenadaY){
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    @Override
    public String toString(){
        return "(" + coordenadaX + "," + coordenadaY + ")";
    }
}
