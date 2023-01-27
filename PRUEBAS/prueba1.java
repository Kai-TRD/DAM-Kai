package PRUEBAS;
    import java.util.Arrays;
public class prueba1 {

        public static void main(String[] args) {
            int[] array = {4, 6, 8, 4, 2, 3, 6, 9, 11, 6, 5, 9, 10, 13, 8, 3, 6, 5, 2, 1, 6, 6, 8, 4};
            int maxValue = array[0];
    
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
                for (int j = 0; j < i; j++) {
                    int suma = 1;
                    if (array[i] == array[j]) {
                        array[i] = maxValue + suma;

                    }
                    suma++;
                }
            }
    
            System.out.println(Arrays.toString(array));
        }
    }
    