package Interfaz.ejercicios;

public class usoNegocio {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Pepe", 55.5);
        Cliente c2 = new Cliente("Mario", 55.5);

        Ferreteria ferreteriaGonzalez = new Ferreteria("FERRETERIA_GONZALEZ");

        ferreteriaGonzalez.abrir();

        ferreteriaGonzalez.cobrar(); // no hay nadie en la cola

        ferreteriaGonzalez.ponerEnCola(c1);
        ferreteriaGonzalez.ponerEnCola(c2);

        ferreteriaGonzalez.cobrar(); //cobramos a c1

        // ordenacion por el mayor dinero gastado a menor con un Comparator

            for (int i = 0; i <  ; i++) {
                
            }

        // int[] arrayNumero = {4, 6 ,2, 9, 1, 5}

    }
}
