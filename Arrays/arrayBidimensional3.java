package Arrays;

import java.util.Scanner;

public class arrayBidimensional3 {
    public static void main(String[] args) {
        
        final int FILA = 4;
        final int COLUMNA = 5;
                

        int[][] tabla = new int[FILA][COLUMNA];
        
        System.out.println("Escribeme los valores de la tabla:");
        Scanner sc = new Scanner(System.in);
        
        int contador = 1;
        int sumatorioTotal = 0;
        boolean valido = false;
        do {
            valido = false;
            System.out.println("---------------------------------");
            System.out.println("| Escoge una de las opciones:\t|");
            System.out.println("| 1-Escribir tu los numeros\t|");
            System.out.println("| 2-Randomizar los numeros\t|");
            System.out.println("| 3-Numeros en orden\t\t|");
            System.out.println("---------------------------------");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                for (int i = 0; i < FILA; i++) {
                    for (int j = 0; j < COLUMNA; j++) {
                        System.out.print("Posicion ["+i+"]["+j+"]:");
                        int valor = sc.nextInt();
        
                        tabla[i][j] = valor;
                    }
                }
                valido = true;
                    break;

                case 2:
                for (int i = 0; i < FILA; i++) {
                    for (int j = 0; j < COLUMNA; j++) {
                        
                        int random = (int)(Math.random()*21);

                        tabla[i][j] = random;
                        
                    }
                }
                valido = true;
                    break;

                case 3:
                for (int i = 0; i < FILA; i++) {
                    for (int j = 0; j < COLUMNA; j++) {
                        
                        tabla[i][j] = contador;
                        contador = contador + 1;
                    }
                }
                valido = true;
                    break;
            
                default:
                    System.out.println("ERROR!:opcion no contemplada, por favor escoga una valida");
                    valido = false;
                    break;
            }
        } while (valido == false);
        


        sc.close();

        System.out.println("----------------------------------------------");
        
        for (int i = 0; i < FILA; i++) {
            
            int sumatorioHorizontal = 0;
        
            System.out.print("|");
            
            for (int j = 0; j < COLUMNA; j++) {
        
                System.out.print(tabla[i][j]+ "\t");
        
                sumatorioHorizontal = sumatorioHorizontal + tabla[i][j];
            }
            
            sumatorioTotal = sumatorioTotal + sumatorioHorizontal;
            
            System.out.println("| Σ" + sumatorioHorizontal+"|");
        }


        System.out.println("|---------------------------------------------");
        
        System.out.print("|");
        
        for (int i = 0; i < COLUMNA; i++) {

            int sumatorioVertical = 0;

            for (int j = 0; j < FILA; j++) {
                
                sumatorioVertical = sumatorioVertical + tabla[j][i];
            
            }
            System.out.print("Σ"+sumatorioVertical+ "\t");            
            //Suma de coluna y filas totales
            // sumatorioTotal = sumatorioTotal + sumatorioVertical;
        }
        System.out.println("| Σ"+sumatorioTotal);

        System.out.println("-----------------------------------------");
    }
}
