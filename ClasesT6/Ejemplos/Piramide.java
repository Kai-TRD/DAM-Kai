package ClasesT6.Ejemplos;

public class Piramide {
    // Atributos
    private int altura;

    private static int PiramidesCreadas = 0;

    public static int getPiramidesCreadas() {
        return PiramidesCreadas;
    }

    public void setPiramidesCreadas(int piramidesCreadas) {
        PiramidesCreadas = piramidesCreadas;
    }

    // Contructores
    public Piramide(int altura){
        this.altura = altura;
    }

    @Override
    public String toString(){
        PiramidesCreadas++;
        return "Piramide creada con exito!";
    }
}
