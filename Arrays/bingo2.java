package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class bingo2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        //Declaracion de variables
        
        int[] col0 = new int[3];
        int[] col1 = new int[3];
        int[] col2 = new int[3];
        int[] col3 = new int[3];
        int[] col4 = new int[3];
        int[] col5 = new int[3];
        int[] col6 = new int[3];
        int[] col7 = new int[3];
        int[] col8 = new int[3];
        
        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};
        

        // col0,  col1,  col2,  col3.  col4,  col5,  col6,  col7,  col8
        // [0,0]  [1,0]  [2,0]  [3,0]  [4,0]  [5,0]  [6,0]  [7,0]  [8,0]
        // [0,1]  [1,1]  [2,1]  [3,1]  [4,1]  [5,1]  [6,1]  [7,1]  [8,1]
        // [0,2]  [1,2]  [2,2]  [3,2]  [4,2]  [5,2]  [6,2]  [7,2]  [8,2]


        int[] numerosGenerados = new int[1];


        //variable para controlar si salimos del programa o jugamos otro cartón
        boolean salir = true;

        do{
            //Crear/restaurar carton vacio y vaciado de los numeros generados en eljuego anterior
            //introduzco los numeros de cada columna
            rellenarNumerosCarton(carton); 
            
            //Coloco los 12 espacios en blanco, distribuidos en 4 por cada fila al azar en las columnas
            ponerBlancos(carton);

            // //pinto el cartón ;
            pintarCarton(carton , numerosGenerados);

            // //pregunto si quiero sacar otra bola o terminar este juego

            System.out.println("Sacar otra bola?(s/n):");
            boolean jugar = true;
            String opcion = sc.nextLine();
            
            switch (opcion) {
                case "s":
                    jugar = true; 
                    break;
                case "n":
                    jugar = false;
                    break;
            
                default:
                    System.out.println("OPCION NO VALIDA, VUELVA A INTENTARLO");
                    break;
            }

            while(jugar){

            //saco numero aleatorio - no se debe repetir
                sacarNumAleatorio(numerosGenerados);

                for (int i = 0; i < numerosGenerados.length; i++) {
                    System.out.println(numerosGenerados[i]);
                }
            //pinto el carton con numeros sacados
                // int numeroAciertos = pintarCarton(carton , numerosGenerados);


            //Eres ganador??
                    // if (numeroAciertos >= 15)
                    // {
                    //     System.out.println("-----------------------------");
                    //     System.out.println("--------  BINGO -------------");
                    //     System.out.println("-----------------------------");
                    // }

            //pregunto si quiero sacar otra bola o terminar este juego
                

               
            }

            // //Pregunto si quiero jugar otro cartón o salir definitivamente del programa
           
            
        } while(!salir);
    }






















    static void sacarNumAleatorio(int[] numerosGenerados){
        
        int random = (int)(Math.random()*90)+1;

        
        int[] newArray = Arrays.copyOf(numerosGenerados, numerosGenerados.length + 1);
        newArray[newArray.length - 1] = 4;

        // return random;
    }









    /**
     * PONE 4 BLOQUES A VALOR -1 POR CADA FILA
     * @param carton
     */
    static void ponerBlancos(int[][] carton){
        // PONER 4 EN CADA FILA, COMPROBAR QUE LAS FILAS NO HAYA 2, SI HAY DOS, MOVER A OTRA PARTE
        // col0,  col1,  col2,  col3.  col4,  col5,  col6,  col7,  col8
        // [0,0]  [1,0]  [2,0]  [3,0]  [4,0]  [5,0]  [6,0]  [7,0]  [8,0]
        // [0,1]  [1,1]  [2,1]  [3,1]  [4,1]  [5,1]  [6,1]  [7,1]  [8,1]
        // [0,2]  [1,2]  [2,2]  [3,2]  [4,2]  [5,2]  [6,2]  [7,2]  [8,2]
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                boolean colocado = false;
                do {
                    int random = (int)(Math.random()*9);
                    if(carton[random][i] == -1){
                        colocado = false;
                    } else {
                        carton[random][i] = -1;
                        colocado = true;
                    }
                    carton[random][i] = -1;                    
                } while (colocado == false);

            }
        }
    }
    /**
     * RELLENA DE NUMEROA RANDOM EL CARTON
     * @param carton
     */
    static void rellenarNumerosCarton(int[][] carton){

        // col0,  col1,  col2,  col3.  col4,  col5,  col6,  col7,  col8
        // [0,0]  [1,0]  [2,0]  [3,0]  [4,0]  [5,0]  [6,0]  [7,0]  [8,0]
        // [0,1]  [1,1]  [2,1]  [3,1]  [4,1]  [5,1]  [6,1]  [7,1]  [8,1]
        // [0,2]  [1,2]  [2,2]  [3,2]  [4,2]  [5,2]  [6,2]  [7,2]  [8,2]



        for (int i = 0; i < 9; i++) {


            int[] lista = {1,2,3,4,5,6,7,8,9,10};

            for (int j = 0; j < 3; j++) {
                
                int random = (int)(Math.random()*9);

                int temp = lista[random];

                // lista.remove(random);
                System.arraycopy(lista, random + 1, lista, random, lista.length - 1 - random);

                carton[i][j] = temp+10*i;

                //comprobar que random no esté ya en la columna (i)
                // for (int k = 0; k < lista.length; k++) {
                //     System.out.print(lista[k]);
                // }
                // System.out.println();
            }
            Arrays.sort(carton[i]);
        }
    }


    /**
     * imprimir el carton
     * @param carton
     * @param numerosGenerados
     */
    static void pintarCarton(int[][] carton, int[] numerosGenerados){         
    
        for (int i = 0; i <= 8; i++) {
            System.out.print("\t   "+carton[i][0]);
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {

            System.out.print("\t   "+carton[i][1]);
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.print("\t   "+carton[i][2]);
        }
        System.out.println();


        
        System.out.println("\t╔═══════╗╔══════╗╔══════╗╔══════╗╔══════╗╔══════╗╔══════╗╔══════╗╔══════╗");
        System.out.print("\t");
        
        for (int i = 0; i <= 8; i++) {
            if(carton[i][0] == -1){
                System.out.print("║ ████\t║");
            } else {
                System.out.print("║  "+carton[i][0]+"\t║");
            }
        }

        System.out.println();
        System.out.print("\t");
        System.out.println("╚═══════╝╚══════╝╚══════╝╚══════╝╚══════╝╚══════╝╚══════╝╚══════╝╚══════╝");
        System.out.print("\t");
        System.out.println("╔═══════╗╔══════╗╔══════╗╔══════╗╔══════╗╔══════╗╔══════╗╔══════╗╔══════╗");
        System.out.print("\t");

        for (int i = 0; i < 9; i++) {
            if(carton[i][1] == -1){
                System.out.print("║ ████\t║");
            } else {
                System.out.print("║  "+carton[i][1]+"\t║");
            }
        }

        System.out.println();
        System.out.println("\t╚═══════╝╚══════╝╚══════╝╚══════╝╚══════╝╚══════╝╚══════╝╚══════╝╚══════╝");
        System.out.println("\t╔═══════╗╔══════╗╔══════╗╔══════╗╔══════╗╔══════╗╔══════╗╔══════╗╔══════╗");
        System.out.print("\t");

        for (int i = 0; i < 9; i++) {
            if(carton[i][2] == -1){
                System.out.print("║ ████\t║");
            } else {
                System.out.print("║  "+carton[i][2]+"\t║");
            }
        }
        System.out.println();
        System.out.println("\t╚═══════╝╚══════╝╚══════╝╚══════╝╚══════╝╚══════╝╚══════╝╚══════╝╚══════╝");
        
    // System.out.println("╔╦═╦═╦═╦═╦═╦═╦═╦═╦═╦╗");
    // System.out.println("╠╩╦╩╦╩╦╩╦╩╦╩╦╩╦╩╦╩╦╩╣");
    // System.out.println("╠╦╩╦╩╦╩╦╩╦╩╦╩╦╩╦╩╦╩╦╣");
    // System.out.println("╠╩╦╩╦╩╦╩╦╩╦╩╦╩╦╩╦╩╦╩╣");
    // System.out.println("╠╦╩╦╩╦╩╦╩╦╩╦╩╦╩╦╩╦╩╦╣");
    // System.out.println("╚╩═╩═╩═╩═╩═╩═╩═╩═╩═╩╝");
    }


}