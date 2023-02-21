package ClasesAvanzadas.Animales;

public class Gato extends Mamifero{

    public Gato(String sonido, int nExtremidades, String color, String habitad) {
        super(sonido, nExtremidades, color, habitad);
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "------Gato------";
        cadena += "\nSonido: " + this.sonido;
        cadena += "\nNumero extremidades: " + this.nExtremidades;
        cadena += "\nColor: " + this.color;
        cadena += "\nHabitad: " + this.habitad;
        cadena += "\n----------------------";
        return cadena;
    }


}
