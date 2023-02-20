package ClasesAvanzadas.FigurasGeometrica;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double perimetro(double radio, double ancho) {
        double perimetro = 2*Math.PI*radio;
        return perimetro;   
    }

    @Override
    public double area(double radio, double ancho) {
        double area = Math.PI*(radio*radio);
        return area;
    }


    @Override
    public String toString(){
        String cadena = "";
        cadena += "------Circulo------";
        cadena += "\nColor: " + this.color;
        cadena += "\nPerimetro: " + this.perimetro(radio, radio);
        cadena += "\nArea: " + this.area(radio, radio);
        cadena += "\n-------------------";
        return cadena;
    }

}
