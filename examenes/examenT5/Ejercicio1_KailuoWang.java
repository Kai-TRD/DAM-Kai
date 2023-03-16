package examenes.examenT5;

import java.util.Arrays;

public class Ejercicio1_KailuoWang {
    public static void main(String[] args) {

        // Inicio el Array con sus valores
        int[] array = { 4, 6, 8, 4, 2, 3, 6, 9, 11, 6, 5, 9, 10, 13, 8, 3, 6, 5, 2, 1, 6, 6, 8, 4 };

        // [4, 6, 8, 14, 2, 3, 16, 9, 11, 17, 5, 25, 10, 13, 21, 24, 18, 26, 23, 1, 19,
        // 20, 22, 15]

        // creo un bucle para comprobar repetidos

        int numero = mayorValor(array);

        System.out.println(numero);
        for (int i = 0; i < array.length; i++) {
            int posiciones = posicionRepetido(array, i);
            cambiar(array, posiciones, numero);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }

    }

    /**
     * Sacamos el mayor numero que hay en el array para empezar a contar desde ahí
     * 
     * @param array
     * @return
     */
    static int mayorValor(int[] array) {
        int numero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numero) {
                numero = array[i];
            }
        }
        return numero;
    }

    /**
     * Cambiar el valor
     * 
     * @param array
     */
    static void cambiar(int[] array, int posiciones, int numero) {
        for (int i = 0; i < array.length; i++) {
            array[posiciones] = array[numero];
            numero++;
        }
    }

    /**
     * Sacar las posiciones repetidas
     * 
     * @param array
     * @param posicion
     * @return
     */
    static int posicionRepetido(int[] array, int posicion) {

        int repetido = 0;
        do {

            int valorBuscar = array[posicion];
            for (int i = 0; i < array.length; i++) {
                if (valorBuscar == array[i]) {
                    repetido = i;
                }
            }
        } while (repetido == -1);

        return repetido;
    }

}
