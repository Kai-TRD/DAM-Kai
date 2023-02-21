package ClasesAvanzadas.Animales;

public class Perro extends Mamifero {

    public Perro(String sonido, int nExtremidades, String color, String habitad) {
        super(sonido, nExtremidades, color, habitad);
        //TODO Auto-generated constructor stub
    }




    @Override
    public String toString() {
        String cadena = "";
        cadena += "------Perro------";
        cadena += "\nSonido: " + this.sonido;
        cadena += "\nNumero extremidades: " + this.nExtremidades;
        cadena += "\nColor: " + this.color;
        cadena += "\nHabitad: " + this.habitad;
        cadena += "\n----------------------";
        return cadena;
    }
}
