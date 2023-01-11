package Arrays;

import java.util.Arrays;

public class arrayBidimensional {
    public static void main(String[] args) {
        
        int[][] datos = new int[3][2];  //3 filas y 2 columnas = 3 arrays de 2 elementos

        datos[0][0] = 0;
        datos[0][1] = 1;
        datos[1][0] = 2;
        datos[1][1] = 3;
        datos[2][0] = 4;
        datos[2][1] = 5;

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 2; j++) {
        //         datos[i][j] = (int)(Math.random()*10);
        //     }
        //     System.out.println();

        // }

        System.out.println(Arrays.deepToString(datos));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(datos[i][j]+ " ");
            }
            System.out.println();

        }
    }
}
