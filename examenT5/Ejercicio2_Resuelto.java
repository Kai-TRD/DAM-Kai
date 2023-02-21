package examenT5;

import java.util.Scanner;

import java.util.Arrays;

public class Ejercicio2_Resuelto {

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

                String[] temp1 = new String[frutasArray.length];

                for (int i = 0; i < frutasArray.length; i++) {
                    temp1[i] = frutasArray[i].toUpperCase();
                }
                posicion = buscarFruta(temp1, nombreFruta.toUpperCase());
                
                cantidadVendidaArray[posicion] = cantidadVendidad;
                System.out.println(frutasArray[posicion] + "-" + cantidadVendidaArray[posicion]);



                break;
            case "c":

                System.out.print("Dime el nombre de la fruta: ");
                nombreFruta = sc.nextLine();

                System.out.print("Dime el precio de la fruta: ");
                precio = sc.nextDouble();

                String[] temp2 = new String[frutasArray.length];

                for (int i = 0; i < frutasArray.length; i++) {
                    temp2[i] = frutasArray[i].toUpperCase();
                }


                posicion = buscarFruta(temp2, nombreFruta.toUpperCase());
                
                preciosArray[posicion] = precio;
                System.out.println(frutasArray[posicion] + "-" + preciosArray[posicion]);

                break;
            case "d":
                for (int i = 0; i < preciosArray.length; i++) {
                    System.out.println("Dime el precio de la \"" + frutasArray[i] + "\":");
                    precio = sc.nextDouble();
                    preciosArray[i] = precio;
                }

                System.out.println("Precios cabmbiados satisfactoriamente");

                break;
            case "e":
                Double totalPrecio = 0.0;
                Double totalCantidad = 0.0;

                System.out.println("\t\tprecio\tcantidad\tganancia");
                // Cantidad de frutas vendidas total
                for (int i = 0; i < cantidadVendidaArray.length; i++) {
                    totalCantidad += cantidadVendidaArray[i];
                }

                for (int i = 0; i < frutasArray.length; i++) {
                    System.out.print("Fruta: "+frutasArray[i] + "-" +"\t-" + preciosArray[i] + "-" +"\t-" + cantidadVendidaArray[i] + "-" +"\t\t" + (cantidadVendidaArray[i] * preciosArray[i]));
                
                    if((cantidadVendidaArray[i] > totalCantidad/cantidadVendidaArray.length)){
                        System.out.println("(+)");
                    }
                    if((cantidadVendidaArray[i] == totalCantidad/cantidadVendidaArray.length)){
                        System.out.println("(=)");
                    }
                    if((cantidadVendidaArray[i] < totalCantidad/cantidadVendidaArray.length)){
                        System.out.println("(-)");
                    }

                }
                System.out.println("-------------------------------------------------------------------");
                System.out.print("\t\t\t");

                System.out.print(totalCantidad);

                for (int i = 0; i < preciosArray.length; i++) {
                    totalPrecio += cantidadVendidaArray[i] * preciosArray[i];
                }
                System.out.print("\t\t" + totalPrecio);

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
            if(array[i].equals(nombre)){
                posicion = i;
            }
        }

        return posicion;
    }
}
