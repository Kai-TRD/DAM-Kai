package Arrays;

import java.util.Scanner;

public class arrayBidimensional2 {
    public static void main(String[] args) {

        final int FILA = 4;
        final int COLUMNA = 4;

        int[][] tabla = new int[FILA][COLUMNA];

        System.out.println("Escribeme los valores de la tabla:");
        Scanner sc = new Scanner(System.in);
        int valor = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // System.out.print("Posicion ["+i+"]["+j+"]:");
                // int valor = sc.nextInt();

                tabla[i][j] = valor;
            
                // valor++;
            }
        }
        sc.close();

        int ejValorX = 0;
        Boolean magica = true;
        for (int i = 0; i < FILA; i++) {
            int sumaX = 0;
            for (int j = 0; j < COLUMNA; j++) {
                System.out.print(tabla[i][j]+ "\t");

                sumaX = sumaX + tabla[i][j];

            }
            if(i == 0){ejValorX = sumaX;}
            if(sumaX != ejValorX){
                magica = false;
            }
            // System.out.println("|"+sumaX);
            System.out.println();
        }


        for (int i = 0; i < COLUMNA; i++) {
            int sumaY = 0;
            for (int j = 0; j < FILA; j++) {
                sumaY = sumaY + tabla[j][i];
            }
            // System.out.print("Σ"+sumaY+ "\t");            
            
            if(i == 0){ejValorX = sumaY;}
            if(sumaY != ejValorX){
                magica = false;
            }
        }

        if(magica == true){
            System.out.println("La tabla es magica");
        } else {
            System.out.println("La tabla NO es magica");
        }



    }
}
