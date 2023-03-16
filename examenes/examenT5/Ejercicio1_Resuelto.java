package examenes.examenT5;


public class Ejercicio1_Resuelto {
    public static void main(String[] args) {

        // Inicio el Array con sus valores
        int[] array = { 4, 6, 8, 4, 2, 3, 6, 9, 11, 6, 5, 9, 10, 13, 8, 3, 6, 5, 2, 1, 6, 6, 8, 4 };
        // [4, 6, 8, 14, 2, 3, 16, 9, 11, 17, 5, 25, 10, 13, 21, 24, 18, 26, 23, 1, 19, 20, 22, 15]



        imprime(array); 

        // Sacamos el mayor valor del array
        int mayorNum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > mayorNum){
                mayorNum = array[i];
            }
        }

        //para cada elemento del array busco si esta duplicado en el resto del array (posicion del elemento +1)

        for (int i = 0; i < array.length; i++) 
        {
            int elemento = array[i];


            for (int j = i+1; j < array.length; j++) 
            {
                if (elemento == array[j])
                {
                    //este elemento en array[j] esta repetido
                    mayorNum++;
                    array[j] = mayorNum;
                    
                }
            }
        }

        imprime(array);

    }

    /**
     * Imprime el array que se le da
     * @param array
     */
    public static void imprime(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");
    }

}
