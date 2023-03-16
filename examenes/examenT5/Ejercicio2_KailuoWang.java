package examenes.examenT5;

import java.util.Scanner;
import java.util.concurrent.FutureTask;

import javax.management.RuntimeOperationsException;
import javax.swing.text.Position;

import java.util.Arrays;

public class Ejercicio2_KailuoWang {

    static public Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {


        String[] frutasArray = new String[0];
        double[] preciosArray = new double[0];
        double[] cantidadVendidaArray = new double[0];

        String option = "y";

        String nombreFruta = null;
        double cantidadVendidad = 0;
        double precio = 0;
        int posicion = 0;
        do{
            option = menu();
            switch(option){
            case "a":
                //Insertar Fruta (programa pide el nombre de la fruta, y la introduce en el sistema con precio 1 y con cantidad vendida 0)
                System.out.print("Dime el nombre de la fruta: ");
                nombreFruta = sc.nextLine();
                
                frutasArray = insertarAlFinalString(frutasArray, nombreFruta);
                preciosArray = insertarAlFinalDouble(preciosArray, 1);
                cantidadVendidaArray = insertarAlFinalDouble(cantidadVendidaArray, 0);
                System.out.println("La fruta se añadio correctamente!");
                



                break;
            case "b":

                System.out.print("Dime el nombre de la fruta: ");
                nombreFruta = sc.nextLine();

                System.out.print("Dime la cantidad vendida de la fruta: ");
                cantidadVendidad = sc.nextDouble();

                posicion = buscarFruta(frutasArray, nombreFruta);
                
                cantidadVendidaArray[posicion] = cantidadVendidad;
                System.out.println(frutasArray[posicion] + "-" + cantidadVendidaArray[posicion]);



                break;
            case "c":

                System.out.print("Dime el nombre de la fruta: ");
                nombreFruta = sc.nextLine();

                System.out.print("Dime el precio de la fruta: ");
                precio = sc.nextDouble();

                posicion = buscarFruta(frutasArray, nombreFruta);
                
                preciosArray[posicion] = precio;
                System.out.println(frutasArray[posicion] + "-" + preciosArray[posicion]);

                break;
            case "d":
                System.out.println("opcion d");
                break;
            case "e":
                Double totalPrecio = 0.0;
                Double totalCantidad = 0.0;

                System.out.println("\t\tprecio\tcantidad\tganancia");

                for (int i = 0; i < frutasArray.length; i++) {
                    System.out.println("Fruta: "+frutasArray[i] + "-" +"\t-" + cantidadVendidaArray[i] + "-" +"\t-" + preciosArray[i] + "-" +"\t\t" + (cantidadVendidaArray[i] * preciosArray[i]));
                }

                System.out.println("-------------------------------------------------------------------");
                System.out.println("\t\t");
                for (int i = 0; i < cantidadVendidaArray.length; i++) {
                    totalCantidad = totalCantidad + cantidadVendidaArray[i];
                }
                System.out.print(totalCantidad);

                for (int i = 0; i < preciosArray.length; i++) {
                    totalPrecio = totalPrecio + preciosArray[i];
                }
                System.out.print("\t" + totalPrecio);

                break;
            case "x":
                System.out.println("bye");
                break;
            }

        System.out.println();
        }while( !option.equals("x") );
    }


    /**
     * Imprimir el menu
     * @return
     */
    static String menu(){

        System.out.println("a - Insertar fruta");
        System.out.println("b - Añadir compra");
        System.out.println("c - modificar precio fruta");
        System.out.println("d - Modificar todos los precios");
        System.out.println("e - mostrar informe");
        System.out.println("x - salir");
        System.out.println("---------------------------------------------");
        System.out.println(" Indique opción...");
        System.out.println();
        String opcion = sc.nextLine();
        return opcion;
    }

    /**
     * insertar valor al final de un array String
     * @param array
     * @param elemento
     * @return
     */
    static String[] insertarAlFinalString(String[] array, String elemento){
        
        String[] copia = Arrays.copyOf(array, array.length+1);

        copia[copia.length-1]=elemento;
        
        return copia;
    }

        /**
     * insertar valor al final de un array double
     * @param array
     * @param elemento
     * @return
     */
    static double[] insertarAlFinalDouble(double[] array, double elemento){
        
        double[] copia = Arrays.copyOf(array, array.length+1);

        copia[copia.length-1]=elemento;
        
        return copia;
    }



    static int buscarFruta(String[] array, String nombre){
        int posicion = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == nombre){
                posicion = i;
            }
        }

        return posicion;
    }
}
