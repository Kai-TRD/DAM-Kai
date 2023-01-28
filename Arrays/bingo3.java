package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class bingo3 {

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
            //introduzco los numeros de cada columna
            rellenarNumerosCarton(carton); 
            
            //Coloco los 12 espacios en blanco, distribuidos en 4 por cada fila al azar en las columnas
            ponerBlancos(carton);

            // //pinto el cartón ;
            pintarCarton(carton , numerosGenerados);
            boolean jugar = true;

            
            do{
                System.out.flush();
                System.out.println("Eligue una opción");
                System.out.println("1- Sacar numero");
                System.out.println("2- Terminar juego");
                System.out.println("3- hacks");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("SACAR NUMERO");
                        boolean repetido = true;
                        int numeroNuevo = 0;
                        
                        // Comprobar que no se repitan numeros
                        do {
                            repetido = false;
                            numeroNuevo = (int)(Math.random()*90)+1;
                            for (int i = 0; i < numerosGenerados.length; i++) {
                                if (numeroNuevo == numerosGenerados[i]) {
                                    repetido = true;
                                    break;
                                }
                            }
                        } while (repetido == true);
                        
                        // Añade el numero generado anteriormente al array
                        int[] newArray = Arrays.copyOf(numerosGenerados, numerosGenerados.length + 1);
                        newArray[newArray.length - 1] = numeroNuevo;
                        numerosGenerados = newArray;

                        System.out.println("Numeros: ");

                        // Imprimir numeros generados
                        for (int i = 1; i < numerosGenerados.length; i++) {
                            System.out.print("-"+numerosGenerados[i]);
                        }
                        System.out.println();
                        
                        jugar = true;
                        
                    break;

                    case 2:
                        System.out.println("Terminar juego");
                        jugar = false;
                        salir = true;
                    break;

                    case 3:
                        rellenoTotal(carton);
                    break;
                
                    default:
                    // ...
                        break;
                }

                comprobarValores(numerosGenerados, carton);

                pintarCarton(carton, numerosGenerados);

                // devuelve true si has ganado
                boolean gana = comprobarSiGana(carton);
                if(gana == true){

                    jugar = false;
                }

            }while (jugar == true);
            

            String opcion;

            do {
                System.out.println("Quieres volver a jugar?(s/n):");
                opcion = sc.nextLine();
                switch (opcion) {
                    case "s":
                        salir = false;
                        jugar = true;        
                        break;
                    case "n":
                        salir = true;
                        break;
                    default:
                        opcion = "o";
                        break;
                }
            } while (opcion == "o");



        } while(!salir);
    }

    /**
     * Rellena todo el carton con -1
     * @param carton
     */
    static void rellenoTotal(int[][] carton) {
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                carton[i][j] = -1;
            }
        }
    }

    /**
     * Comprueba si ganas o no
     * @param carton
     * @return
     */
    static boolean comprobarSiGana(int[][] carton) {
        boolean win = true;
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                if (carton[i][j] != -1) {
                    win = false;
                }
            }
        }
        if (win) {
            System.out.println("-------------------------------------------");
            System.out.println("-------------------------------------------");
            System.out.println("\t\tHAS GANADO");
            System.out.println("-------------------------------------------");
            System.out.println("-------------------------------------------");
        }
        return win;
    }


    /**
     * Comprueba si hay numero para poder poner uno en blanco
     * @param numerosGenerados
     * @param carton
     */
    static void comprobarValores(int[] numerosGenerados, int[][] carton) {
        for (int i = 0; i < numerosGenerados.length; i++) {
            for (int j = 0; j < carton.length; j++) {
                for (int k = 0; k < carton[j].length; k++) {
                    if (numerosGenerados[i] == carton[j][k]) {
                        carton[j][k] = -1;
                    }
                }
            }
        }
    }
    
    
    /**
     * PONE 4 BLOQUES A VALOR -1 POR CADA FILA
     * @param carton
     */
        // PONER 4 EN CADA FILA, COMPROBAR QUE LAS FILAS NO HAYA 2, SI HAY DOS, MOVER A OTRA PARTE
        // col0,  col1,  col2,  col3.  col4,  col5,  col6,  col7,  col8
        // [0,0]  [1,0]  [2,0]  [3,0]  [4,0]  [5,0]  [6,0]  [7,0]  [8,0]
        // [0,1]  [1,1]  [2,1]  [3,1]  [4,1]  [5,1]  [6,1]  [7,1]  [8,1]
        // [0,2]  [1,2]  [2,2]  [3,2]  [4,2]  [5,2]  [6,2]  [7,2]  [8,2]
        static void ponerBlancos(int[][] carton) {
            for (int i = 0; i < 3; i++) {
                int contador = 0;
                while (contador < 4) {
                    int random = (int)(Math.random()*9);
                    int contadorColumna = 0;
                    for (int j = 0; j < 3; j++) {
                        if (carton[random][j] == -1) {
                            contadorColumna++;
                        }
                    }
                    if (carton[random][i] != -1 && contadorColumna < 2) {
                        carton[random][i] = -1;
                        contador++;
                    }
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
    
        //PARA PRUEBAS

        // for (int i = 0; i <= 8; i++) {
        //     System.out.print("\t   "+carton[i][0]);
        // }
        // System.out.println();
        // for (int i = 0; i < 9; i++) {

        //     System.out.print("\t   "+carton[i][1]);
        // }
        // System.out.println();
        // for (int i = 0; i < 9; i++) {
        //     System.out.print("\t   "+carton[i][2]);
        // }
        // System.out.println();


        
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
    }
}