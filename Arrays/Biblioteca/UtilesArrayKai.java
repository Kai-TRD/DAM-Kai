package Arrays.Biblioteca;

import java.util.Scanner;

/*
1-limpiar() //borra los valores del array. Deque quedar un array vacio

2-rellenar(int[]   array, int numeroElementos) //llena el array con el numero de elementos  indicados, valor de estos numeros será 0   

3-rellenarPersonalizado(int[] array, int numeroElementos, int valor) //llena el array con el numero de elementos indicados con el valor indicado

4-insertarAlFinal(int[] array, int elemento)

5-insertarAlPrincipio(int[] array, int elemento)

6-insertatEnPosicion(int[]   array, int elemento, int posicion)

7-insertarOrdenado(int[] array, int elemento)

8-eliminarUltimo(int[]   array)

9-eliminarPrimero(int[]   array)

10-eliminar(int[] array, int elemento);

11-ordenar(int[] array);

12-desordenar(int[]  array);

13-invertir(int[]   array);

14-imprimir(int[]  array);

15-estaOrdenado( int[] array) //devuelve true si el array está ordendo, false en  caso contrario

16-buscar(int[] array, int elemento) //devuelve -1 si el elemento NO está en el array y en caso de estar DEVUELVE la posición en la que está 

17-partirPor(int[]   array, int posicionInicial, int posicionCorte) // devuelve el array  resultante de partir el array original entre la posicionInical y la  posicionFinal (incluidas las 2)

18-sonIguales(int[]  array1, int[] array2)

19-elementosIguales(int[]array1,  int[] array2, int posicionAComparar) //devuelve true si el elemento en ambos arrays son iguales
 */

public class UtilesArrayKai {

    /**
     * enter
     */
    static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pulsa ENTER para continuar...");
        sc.nextLine();
        System.out.print("\033[H\033[2J");
    }

    /**
     * Limpia el arrya
     * @param array
     */
    static int[] limpiar(){
        int[] array = null;
        return array;
    }
    
    /**
     * Rellenar array con 0
     * @param array
     * @param numeroElementos
     */
    static int[] rellenar(int[] array, int numeroElementos){
        
        int[] nuevo = new int[numeroElementos];
        for (int i = 0; i < nuevo.length; i++) {
            nuevo[i] = 0;
        }
        return nuevo;
    }

    static int[] rellenarPersonalizado(int[] array, int numeroElementos, int valor){

        int[] nuevo = new int[numeroElementos];
        for (int i = 0; i < nuevo.length; i++) {
            nuevo[i] = valor;
        }
        return nuevo;
    }






    /**
     * Imprimir array
     * @param array
     */
    static void imprimir(int[]  array){
        if(array == null){
            System.out.println("El array esta vacio, no se puede imprimir...");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i+"-"+array[i]);
            }
        }
    }
} 
