package Arrays;

import java.util.Scanner;

public class ejercicioArraySimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la longitud del Array:");
        int array = sc.nextInt();

        
        String[] tabla = new String[array];

        boolean salir = false;
        
        int opcion;
        
        do {
            opcion = menu(array);

            switch(opcion){
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
                    pausa();
                    salir = true;
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
            System.out.println("6-Salir");
            System.out.println("================================");
            int opcion = sc.nextInt();
        
            return opcion;
        }

    /**
     * 1-Limpiar tabla
     * @param tabla
     */
        static void limpiarTabla(String[] tabla){
            for (int aux = 0; aux < tabla.length; aux++) {
                tabla[aux] = null;
            }
        }

    /**
     * 2-Mostrar tabla
     * @param tabla
     */
        static void mostrarTabla(String tabla[],int array){
            Scanner sc = new Scanner(System.in);

            System.out.println("En que posición?");
            int posicion = sc.nextInt();

            if(posicion > array || posicion < 0){
                System.out.println("Error: fuera de rango");
            } else {
                System.out.println("Dime el nombre para poner en la tabla:");
                sc.nextLine();
                String nombre = sc.nextLine();

                tabla[posicion]=nombre;
            }
        }

    /**
     * 3-Imprimir tabla
     * @param tabla
     */
        static void imprimirTabla(String[] tabla){
            for (int i = 0; i < tabla.length; i++) {
                System.out.println("["+i+"]"+"-"+tabla[i]);
            }
        }

    /**
     * 4-Borrar tabla
     * @param tabla
     */
        static void borrarTabla(String[] tabla, int array){
            Scanner sc = new Scanner(System.in);
            System.out.print("Dima que posicin borrar:");
            int posicion = sc.nextInt();
            if(posicion > 4 && posicion < 0){
                System.out.println("Error: fuera de rango");
            } else {
            tabla[posicion] = null;
            }
        }

    /**
     * 5-Llenado
     * @param tabla
     */
        static void llenado(String[] tabla){
            for (int aux = 0; aux < tabla.length; aux++) {
                tabla[aux] = "Posicion "+aux;
            }
            System.out.println("Operacion realizada");
        }
}
