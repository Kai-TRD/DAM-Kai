package ClasesAvanzadas.Animales;

public class Canario extends Ave {
    public Canario(String sonido, int nExtremidades, String color, String habitad) {
        super(sonido, nExtremidades, color, habitad);
    }

    @Override
    public String hacerSonido() {
        return "pio";
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "------Canario------";
        cadena += "\nSonido: " + this.hacerSonido();
        cadena += "\nNumero extremidades: " + this.nExtremidades;
        cadena += "\nColor: " + this.color;
        cadena += "\nHabitad: " + this.habitad;
        cadena += "\n----------------------";
        return cadena;
    }




}
