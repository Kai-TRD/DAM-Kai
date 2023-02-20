package ClasesAvanzadas.FigurasGeometrica;

public abstract class FiguraGeometrica {
    String color;


    public FiguraGeometrica(String color){
        this.color = color; 
    }

    public abstract double perimetro(double ancho, double alto);

    public abstract double area(double ancho, double alto);
}
