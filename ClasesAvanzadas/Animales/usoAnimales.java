package ClasesAvanzadas.Animales;

public class usoAnimales {
    public static void main(String[] args) {
        Animal[] coleccion = new Animal[4];

        coleccion[0] = new Gato("miau", 4, "negro", "bosques y casas");
        System.out.println(coleccion[0]);
        coleccion[1] = new Perro("guao", 4, "blanco", "casas y praderas");
        System.out.println(coleccion[1]);
        coleccion[2] = new Canario("pio pio", 4, "amarillo", "bosque");
        System.out.println(coleccion[2]);
        coleccion[3] = new Pinguino("waa", 4, "negro y blanco", "Antartida");
        System.out.println(coleccion[3]);
    }
}
