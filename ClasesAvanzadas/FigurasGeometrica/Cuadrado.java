package ClasesAvanzadas.FigurasGeometrica;

public class Cuadrado extends FiguraGeometrica {

    private double ancho;
    private double alto;

    public Cuadrado(double alto, String color) {
        super(color);
        this.ancho = alto;
        this.alto = alto;
    }

    @Override
    public double perimetro(double ancho, double alto) {
        double perimetro = ancho * 4;

        return perimetro;
    }

    @Override
    public double area(double ancho, double alto) {
        double area = alto * alto;
        return area;
    }

    // Pintamos el cuadrado
    public void pintar() {
        for (int j = 0; j < this.alto; j++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < this.alto - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < this.alto - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int j = 0; j < this.alto; j++) {
            System.out.print("*");
        }

        System.out.println();
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "------Cuadrado------";
        cadena += "\nColor: " + this.color;
        cadena += "\nPerimetro: " + this.perimetro(ancho, alto);
        cadena += "\nArea: " + this.area(ancho, alto);
        cadena += "\n--------------------";
        return cadena;
    }

}
