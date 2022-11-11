package Programacion.Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Nombre de usuario:");
        String nombre =sc.nextLine(); 

        System.out.println("Escribe un numeo entero:");
        int entero =sc.nextInt(); 

        System.out.println("EScribe un decimal:");
        float decimal =sc.nextFloat(); 

        sc.nextLine();

        System.out.println("Dime la fecha (HH/MM)");
        String fecha = sc.nextLine();

        System.out.println("Tu nombre es "+nombre+" el número entero es "+entero+" y tu numero decimal es "+decimal);
        System.out.println("La fecha actual es "+fecha);
        sc.close();
    }
}
