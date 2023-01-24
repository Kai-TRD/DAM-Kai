package Arrays;

import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.management.openmbean.OpenMBeanConstructorInfo;
import javax.swing.text.StyledEditorKit.StyledTextAction;

import Practicas.edad;

import java.lang.StackWalker.Option;
import java.util.Arrays;

public class relacionando_Arrays {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        /*
         * Añadir alumno ------ nombre
         *                  |
         *                   `- edad
         * 
         * MOstrar alumno   Pepe    10
         *                  Juan    12
         *                  Maria   15
         * 
         * 
         * Mayor edad ---> María con 15 años  
        */
        int[] edades = new int[0];
        String[] nombres = new String[0];

        int opcion = -1;
        do {
            System.out.println("Elige una opción:");
            System.out.println("-----------------");
            System.out.println("1)Añadir alumno");
            System.out.println("2)Mostrar alumno");
            System.out.println("3)Mayor edad");
            System.out.println("0)SALIR");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    addAlumno(edades, nombres);
                    break;
                case 2:
                    imprimir(edades, nombres);
                    break;
                case 3:
                    mayorEdad(edades, nombres);
                    break;
            
                default:
                    break;
            }            
        } while (opcion != 0);

        // do {
            
        // } while ();
        

    }






    /**
     * Añadir alumno
     * @param edades
     * @param nombres
     */
    static void addAlumno(int[] edades, String[] nombres){
        
        System.out.print("Dime el nombre del alumno:");
        sc.nextLine();
        String nombre = sc.nextLine();
        
        for (int i = 0; i < nombres.length; i++) {
            if(nombres[i] != null){
                addLastNombre(nombres, nombre);
            }
        }

        System.out.print("Dime la edad del alumno:");
        int edad = sc.nextInt();

        for (int i = 0; i < edades.length; i++) {
            if(edades[i] != 0){
                addLastEdad(edades, edad);
            }
        }
        
    }


    static String[] addLastNombre(String[] nombres, String nombre){
        String[] copia=Arrays.copyOf(nombres, nombres.length+1);
        copia[copia.length-1]=nombre;
        return copia;
    }

    static int[] addLastEdad(int[] edades, int edad){
        int[] copia=Arrays.copyOf(edades, edades.length+1);
        copia[copia.length-1]=edad;
        return copia;
    }

    /**
     * muestra todos los alumnos
     * @param edades
     * @param nombres
     */
    static void imprimir(int[] edades, String[] nombres){
        if(nombres.length == 0){
            System.out.println("No hay elementos!");
        }
        else
        {
            for (int i = 0; i < nombres.length; i++) {
                System.out.print(nombres[i] + "\t" + edades[i]);
                System.out.println();
            }
        }
    }
    /**
     * Muestra el alumno demayor edad
     * @param edades
     * @param nombres
     */
    static void mayorEdad(int[] edades, String[] nombres){

    }





}
