package examenT5;

import java.lang.reflect.Array;
import java.net.ContentHandlerFactory;
import java.util.Arrays;

public class Ejercicio1_Resuelto {
    public static void main(String[] args) {

        // Inicio el Array con sus valores
        int[] array = { 4, 6, 8, 4, 2, 3, 6, 9, 11, 6, 5, 9, 10, 13, 8, 3, 6, 5, 2, 1, 6, 6, 8, 4 };

        // [4, 6, 8, 14, 2, 3, 16, 9, 11, 17, 5, 25, 10, 13, 21, 24, 18, 26, 23, 1, 19,
        // 20, 22, 15]



        imprime(array); 

        // Sacamos el mayor valor del array
        int mayorNum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > mayorNum){
                mayorNum = array[i];
            }
        }
        // int[] ordenado = array;
        // Arrays.sort(ordenado);
        // imprime(ordenado);
        int[] limpio = removeDuplicates(array);

        imprime(limpio);

        int cuenta = 0;
        do{
            int i;
            int elNumero = limpio[cuenta];
                for (i = 1; i < array.length; i++) {
                    if(array[i] == elNumero){
                        array[i] = mayorNum+1;
                        mayorNum++;
                    }
                    i++;

                }

                cuenta += 1;
        }while(cuenta != limpio.length);






        imprime(array);

    }
//  4-6-8-14-2-3-16-9-11-17-5-25-10-13-21-24-18-26-23-1-19-20-22-15
//  4-16-22-14-25-27-17-29-31-18-32-30-34-35-23-28-19-33-26-36-20-21-24-15-







    public static void imprime(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
        System.out.println();
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < idx; j++) {
                if (arr[i] == result[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[idx] = arr[i];
                idx++;
            }
        }
        int[] newArr = new int[idx];
        for (int i = 0; i < idx; i++) {
            newArr[i] = result[i];
        }
        return newArr;
    }

}
