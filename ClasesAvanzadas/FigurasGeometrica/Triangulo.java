package ClasesAvanzadas.FigurasGeometrica;

public class Triangulo extends FiguraGeometrica {

    private double ancho;
    private double alto;

    public Triangulo(double alto, double ancho, String color) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double perimetro(double ancho, double alto) {
        double perimetro = ancho * 3;

        return perimetro;
    }

    @Override
    public double area(double ancho, double alto) {
        double area = (ancho + alto) / 2;
        return area;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "------Triangulo------";
        cadena += "\nColor: " + this.color;
        cadena += "\nPerimetro: " + this.perimetro(ancho, alto);
        cadena += "\nArea: " + this.area(ancho, alto);
        cadena += "\n---------------------";
        return cadena;
    }

}
