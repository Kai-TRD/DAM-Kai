package Practicas;
import java.util.Scanner;


public class nombreEdad {
    public static void main(String[] args) {
        
        System.out.println("Dime tu nombre");
        Scanner sc = new Scanner(System.in);

        String nombre =sc.nextLine();

        System.out.println("Dime tu edad");
        
        int edad =sc.nextInt();

        int segundos = (edad * 24 * 60 * 60);

        System.out.println("Tu nombre es \"" + nombre + "\"" + " y has vivido " + "\"" + segundos + "\" segundos");

        sc.close();
    }
}
