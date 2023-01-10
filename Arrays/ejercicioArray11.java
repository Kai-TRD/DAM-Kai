package Arrays;

import java.lang.reflect.AnnotatedParameterizedType;
import java.lang.reflect.Array;

import Recursividad.funcionesRecursivas;

public class ejercicioArray11 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int[] primo = buscarPrimos(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*101);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

      }
      static int{} buscarPrimos(int[] array){
        funcionesRecursivas.esPrimo()
      }


}

