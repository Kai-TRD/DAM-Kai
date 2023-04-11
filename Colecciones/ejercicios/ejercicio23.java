package Colecciones.ejercicios;

import java.util.ArrayList;

public class ejercicio23 {
    public static void main(String[] args) {

        // public enum X

        ArrayList<Figura> figuras = new ArrayList<>();

        // Genera las figuras
        figuras.add(new Figura("Dama", 9, 1));
        figuras.add(new Figura("Torre", 5, 2));
        figuras.add(new Figura("Alfil", 3, 2));
        figuras.add(new Figura("Caballo", 2, 2));
        figuras.add(new Figura("Peón", 1, 8));

        System.out.println(figuras);

        System.out.println("Fichas capturadas por el jugador:");


        int capturasTotales = (int) (Math.random() * 16);
        int contadorCapturas = 0;
        int peonesTotales = 0;

        do {

            // Selecciona Figura Random
            Figura figuraRandom = figuras.get((int) (Math.random() * figuras.size()));

            if (figuraRandom.esCapturable()) {

                figuraRandom.captura();

                System.out.println(figuraRandom);

                contadorCapturas++;
                peonesTotales += figuraRandom.getValor();
            }
        } while (contadorCapturas < capturasTotales);

        System.out.println("Puntos totales: " + peonesTotales);
    }
}
