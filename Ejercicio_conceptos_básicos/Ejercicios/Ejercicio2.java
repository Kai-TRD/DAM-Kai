package Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu edad");
        int edad = sc.nextInt();

        System.out.println("Tu edad en el siguiente año es "+(++edad));
        sc.close();
    }
}
