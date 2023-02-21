package ClasesAvanzadas.Animales;

public abstract class Animal {
    String sonido;
    int nExtremidades;
    String color;
    String habitad;

    public Animal(String sonido, int nExtremidades, String color, String habitad) {
        this.sonido = sonido;
        this.nExtremidades = nExtremidades;
        this.color = color;
        this.habitad = habitad;
    }

}
