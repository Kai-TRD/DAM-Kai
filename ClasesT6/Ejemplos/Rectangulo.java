package ClasesT6.Ejemplos;

public class Rectangulo {
    
    // Atributos
    private int base;
    private int altura;

    private static int RectangulosCreados = 0;

    public static int getRectangulosCreados() {
        return RectangulosCreados;
    }

    public void setRectangulosCreados(int rectangulosCreados) {
        RectangulosCreados = rectangulosCreados;
    }


    // Contructores
    public Rectangulo(int base, int altura){
        this.altura = altura;
        this.base = base;
    }


    @Override
    public String toString(){
        RectangulosCreados++;
        return "Rectangulo creada con exito!";
    }
}
