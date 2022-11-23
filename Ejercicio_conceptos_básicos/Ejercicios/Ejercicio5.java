package Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero decimal");
        float decimal1 = sc.nextFloat();
       
        System.out.println("Dime otro numero decimal");
        float decimal2 = sc.nextFloat();

        System.out.println("El resultado es "+(decimal1*decimal2));
        
        sc.close();
    }
}
