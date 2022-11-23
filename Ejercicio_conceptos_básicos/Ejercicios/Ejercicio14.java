package Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        //Dada la siguiente función:     y = ax^2 + bx + c

        Scanner sc = new Scanner(System.in);
        
        System.out.println("===================================");
        System.out.println("y = ax^2 + bx + c");
        System.out.println("===================================");

        System.out.println("Dime el valor de a:");
        int a = sc.nextInt();

        System.out.println("Dime el valor de b:");
        int b = sc.nextInt();

        System.out.println("Dime el valor de c:");
        int c = sc.nextInt();

        System.out.println("Dime el valor de x:");
        int x = sc.nextInt();



        int y = a*x*x+b*x+c;

        System.out.println("La solucion es: "+y);
        sc.close();
    }
}
