package Arrays;

import java.util.Scanner;

public class ejemplo2 {
    public static void main(String[] args) {

        String[] tabla = new String[5];

        boolean salir = false;
        
        int opcion;
        
        do {
            opcion = menu();

            switch(opcion){
                case 1:
                    limpiarTabla(tabla);
                break;
                case 2:
                    mostrarTabla(tabla);
                    break;
                case 3:
                    for (int i = 0; i < tabla.length; i++) {
                        System.out.println(i+"-"+tabla[i]);
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("OPcion no valida");
                break;
            }












        } while (salir!= true);



        

    }
    /**
     * Menu
     * @return
     */
        static int menu(){
            Scanner sc = new Scanner(System.in);
            System.out.println("1-Limpiar Array");
            System.out.println("2-Almacenar nombre en tabla");
            System.out.println("3-");
            System.out.println("4-");
            System.out.println("5-");
            System.out.println("6-Salir");
            int opcion = sc.nextInt();
        
            return opcion;
        }
    /**
     * Limpiar tabla
     * @param tabla
     */
        static void limpiarTabla(String[] tabla){
            for (int aux = 0; aux < tabla.length; aux++) {
                tabla[aux] = null;
            }
        }

        static void mostrarTabla(String tabla[]){
            Scanner sc = new Scanner(System.in);

            System.out.println("En que posición?");
            int posicion = sc.nextInt();
            System.out.println("Dime el nombre para poner en la tabla:");
            sc.nextLine();
            String nombre = sc.nextLine();

            tabla[posicion]=nombre;
        }



}
