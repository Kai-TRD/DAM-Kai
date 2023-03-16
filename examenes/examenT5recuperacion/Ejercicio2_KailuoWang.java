package examenes.examenT5recuperacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2_KailuoWang {
    public static void main(String[] args) {

        // Inicializamos el scanner
        Scanner sc = new Scanner(System.in);

        // Inicializo el array que contendra los nuemros
        int[] numero = new int[20];
        int min = -20;
        int max = 20;

        for (int i = 0; i < numero.length; i++) {
            int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (numero[j] == randomNum) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                i--;
            } else {
                numero[i] = randomNum;
            }
        }

        // Imprimo el array
        imprimir(numero);

        System.out.println("Indique una posición entre 1 y 20");
        int posicion = sc.nextInt();
        System.out.println("Elemento: " + posicion);

        // Sumamos todos los valores de la izquerda, asignamos el mayor y el menor
        int[] sumaIzq = eliminarIzquierda(numero, posicion);
        int sumaTotalIzq = 0;
        int mayorIzq = 0;
        int menorIzq = 20;
        for (int i = 0; i < sumaIzq.length; i++) {
            sumaTotalIzq += sumaIzq[i];
            if (sumaIzq[i] > mayorIzq) {
                mayorIzq = sumaIzq[i];
            }
            if (sumaIzq[i] < menorIzq) {
                menorIzq = sumaIzq[i];
            }
        }
        System.out.println("A: Suma a Izquierda: " + sumaTotalIzq);

        // Sumamos todos los valores de la derecha, asignamos el mayor y el menor
        int[] sumaDer = eliminarDerecha(numero, posicion);
        int sumaTotalDer = 0;
        int mayorDer = 0;
        int menorDer = 20;
        for (int i = 0; i < sumaDer.length; i++) {
            sumaTotalDer += sumaDer[i];
            if (sumaDer[i] > mayorIzq) {
                mayorDer = sumaDer[i];
            }
            if (sumaDer[i] < menorIzq) {
                menorDer = sumaDer[i];
            }
        }
        System.out.println("B: Suma a derecha: " + sumaTotalDer);

        // Imprimimos el mayor y menor de derecha e izquierda
        System.out.println("C: A la Izquierda -> Mayores: " + mayorIzq + " Menores: " + menorIzq);
        System.out.println("D: A la Derecha -> Mayores: " + mayorDer + " Menores: " + menorDer);

        // Cerramos el scanner
        sc.close();

    }

    /**
     * eliminar izquierda
     * 
     * @param array
     * @return
     */
    static int[] eliminarIzquierda(int[] array, int posicion) {
        return Arrays.copyOfRange(array, 0, posicion);
    }

    /**
     * eliminar derecha
     * 
     * @param array
     * @return
     */
    static int[] eliminarDerecha(int[] array, int posicion) {
        return Arrays.copyOfRange(array, posicion, array.length);
    }

    /**
     * Imprimo el array
     * 
     * @param array
     */
    static void imprimir(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("]");
    }
}
