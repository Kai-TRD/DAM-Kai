package examenes.examenT5recuperacion;

import java.util.Scanner;

public class Ejercicio1_KailuoWang {
    public static void main(String[] args) {

        // Inicializamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Inicio el array bidimensional
        int[][] hoyos = new int[4][9];

        // llenamos los hoyos con un "0"
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                hoyos[i][j] = 0;
            }
        }

        // Asignamos las posiciones predeterminadas

        String[] nombreJugadores = { "Pepe", "Juan", "Sara", "Javi" };

        // Iniciamos el boolena de partido
        boolean partido = true;
        // Iniciamos el contador de rondas
        int ronda = 0;

        // Iniciamos el contador de puntos totales
        int[] totalPuntos = { 0, 0, 0, 0 };
        // Iniciamos el enter
        String enter = "";

        do {
            mostrarTabla(hoyos, nombreJugadores, totalPuntos);

            // Pausa para ver mejor el partido
            System.out.println("Pulse una tecla para empezar la partida....");
            enter = sc.nextLine();

            for (int i = 0; i < nombreJugadores.length; i++) {
                int puntos = (int) ((Math.random() * 4) + 1);
                System.out.println(nombreJugadores[i] + ": " + puntos + " golpes");
                hoyos[i][ronda] = puntos;
                totalPuntos[i] += puntos;
            }

            // Contador de rondas y finalizador de partida
            if (ronda == 8) {
                partido = false;
                mostrarTabla(hoyos, nombreJugadores, totalPuntos);
            } else {
                ronda++;
            }

        } while (partido == true);
        // Mensaje de final de partido
        System.out.println("PARTIDO TERMINADO");

        // Localizo el jugador con mas puntos
        // int numeroMasGrande = 0;
        // for (int r = 0; r < totalPuntos.length; r++) {
        // if (totalPuntos[r] > numeroMasGrande) {
        // numeroMasGrande = totalPuntos[r];
        // }
        // }
        // System.out.println(numeroMasGrande);

        // Para que no me ponga que no he usado la variable enter
        enter = "";
        System.out.println(enter);
        sc.close();
    }

    /**
     * Imprimo la tabla de resultados
     * 
     * @param hoyos
     * @param nombreJugadores
     * @param totalPuntos
     */
    static void mostrarTabla(int[][] hoyos, String[] nombreJugadores, int[] totalPuntos) {

        System.out.print("Jugador | ");

        for (int i = 1; i <= 9; i++) {
            System.out.print("H" + i + " | ");
        }
        System.out.println();
        System.out.println("====================================================================");

        for (int i = 0; i < 4; i++) {

            // Imprimo los puntos de los jugadores
            System.out.print(nombreJugadores[i] + " | ");
            for (int j = 0; j < 9; j++) {
                System.out.print(hoyos[i][j] + " | ");
            }

            // Imprimo el total de los puntos de cada jugador
            System.out.print("-->" + totalPuntos[i]);
            System.out.println();

        }
    }

}
