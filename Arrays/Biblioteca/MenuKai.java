package Arrays.Biblioteca;

import java.util.Scanner;

public class MenuKai {
    public static void main(String[] args) {

        boolean salida = false;
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println("La cantidad por defecto del array es: "+array.length);
        UtilesArrayKai.enter();
        do {

            System.out.println("---Menu Array---");
            System.out.println("1-Limpiar array");
            System.out.println("2-Llenar el array(longitud personalizada y contenido 0)");
            System.out.println("3-Llenar el array(longitud y contenido personalizado)");
            System.out.println("4-");
            System.out.println("5-");
            System.out.println("6-");
            System.out.println("7-");
            System.out.println("8-");
            System.out.println("9-");
            System.out.println("10-");
            System.out.println("11-");
            System.out.println("12-");
            System.out.println("13-");
            System.out.println("14-Imprimir");
            System.out.println("15-");
            System.out.println("16-");
            System.out.println("17-");
            System.out.println("18-");
            System.out.println("19-");
            System.out.println("0-Salir");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    salida = true;
                break;
            
                case 1:
                    array = UtilesArrayKai.limpiar();
                    UtilesArrayKai.enter();
                break;

                case 2:
                    System.out.print("indique el nº de elementos: ");
                    int numeroElementos = sc.nextInt();
                    array = UtilesArrayKai.rellenar(array, numeroElementos);
                    UtilesArrayKai.enter();
                break;

                case 3:
                    System.out.print("Indique el nº de elementos: ");
                    int numeroElementos2 = sc.nextInt();
                    System.out.println("EL valor del contenido: ");
                    int valor = sc.nextInt(); 
                    array = UtilesArrayKai.rellenarPersonalizado(array, numeroElementos2, valor);
                    UtilesArrayKai.enter();
                break;

                case 4:
                    
                break;  

                case 5:
                    
                break;

                case 6:
                    
                break;

                case 7:
                    
                break;

                case 8:
                    
                break;

                case 9:
                    
                break;

                case 10:
                    
                break;

                case 11:
                    
                break;

                case 12:
                    
                break;

                case 13:
                    
                break;

                case 14:
                    UtilesArrayKai.imprimir(array);
                    UtilesArrayKai.enter();
                break;

                case 15:
                    
                break;

                case 16:
                    
                break;

                case 17:
                    
                break;

                case 18:
                    
                break;

                case 19:
                    
                break;
            }
        } while (salida != true);
        sc.close();
    }
}
