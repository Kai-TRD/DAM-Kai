package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioArraySimpleInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la longitud del Array:");
        int array = sc.nextInt();

        
        int[] tabla = new int[array];

        boolean salir = false;
        
        int opcion;
        
        do {
            opcion = menu(array);

            switch(opcion){
                case 0:
                    pausa();
                    salir = true;
                break;

                case 1:
                    limpiarTabla(tabla);
                    pausa();
                break;

                case 2:
                    mostrarTabla(tabla, array);
                    pausa();
                break;
                
                case 3:
                    imprimirTabla(tabla);
                    pausa();
                break;
                
                case 4:
                    borrarTabla(tabla, array);
                    pausa();
                break;
                
                case 5:
                    llenado(tabla);
                    pausa();
                break;
                
                case 6:
                    llenarConAleatorios(tabla);
                break;


                
                default:
                    System.out.println("OPcion no valida");
                    pausa();
                break;
            }
        } while (salir!= true);
        sc.close();
    }


    /*ENter */
        static void pausa(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Pulsa enter para continuar...");
            String enter = sc.nextLine();
            System.out.print("\033[H\033[2J");
        }

    /**
     * Menu
     * @return
     */
        static int menu(int array){
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            System.out.println("Cantidad de celdas: "+array);
            System.out.println("================================");
            System.out.println("1-Limpiar Array");
            System.out.println("2-Almacenar nombre en tabla");
            System.out.println("3-Imprimir Array");
            System.out.println("4-Borrar elmento");
            System.out.println("5-Llenar");
            System.out.println("6-Llenar la tabla de aleatorios");
            System.out.println("0-Salir");
            System.out.println("================================");
            int opcion = sc.nextInt();
        
            return opcion;
        }

    /**
     * 1-Limpiar tabla
     * @param tabla
     */
        static void limpiarTabla(int[] tabla){
            for (int aux = 0; aux < tabla.length; aux++) {
                tabla[aux] = 0;
            }
        }

    /**
     * 2-Mostrar tabla
     * @param tabla
     */
        static void mostrarTabla(int tabla[],int array){
            Scanner sc = new Scanner(System.in);

            System.out.println("En que posición?");
            int posicion = sc.nextInt();

            if(posicion > array || posicion < 0){
                System.out.println("Error: fuera de rango");
            } else {
                System.out.println("Dime el numero para poner en la tabla:");
                sc.nextLine();
                int numero = sc.nextInt();

                tabla[posicion]=numero;
            }
        }

    /**
     * 3-Imprimir tabla
     * @param tabla
     */
        static void imprimirTabla(int[] tabla){
            for (int i = 0; i < tabla.length; i++) {
                System.out.println("["+i+"]"+"-"+tabla[i]);
            }
        }

    /**
     * 4-Borrar tabla
     * @param tabla
     */
        static void borrarTabla(int[] tabla, int array){
            Scanner sc = new Scanner(System.in);
            System.out.print("Dima que posicin borrar:");
            int posicion = sc.nextInt();
            if(posicion > 4 && posicion < 0){
                System.out.println("Error: fuera de rango");
            } else {
            tabla[posicion] = 0;
            }
        }

    /**
     * 5-Llenado
     * @param tabla
     */
        static void llenado(int[] tabla){
            // for (int aux = 0; aux < tabla.length; aux++) {
            //     tabla[aux] = "Posicion "+aux;
            // }
            
            Arrays.fill(tabla, 10 );

            System.out.println("Operacion realizada");
        }

    /**
     * 6-Llena la tabla de aleatorios
     * @param tabla
     */
        static void llenarConAleatorios(int[] tabla){
            for (int i = 0; i < tabla.length; i++) {
                int aleatorio = (int)(Math.random()*100);
                tabla[i]=aleatorio;
            }
        }



        static int buscar(int[] tabla){
            Scanner sc = new Scanner(System.in);
            int resultado = -1;
            System.out.println("¿Que valor quieres buscar?");
            int numeroBuscado = sc.nextInt();

            int indiceBuscado = 0;
            while()


            return resultado;
        }
}
