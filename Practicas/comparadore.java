package Practicas;
import java.util.Scanner;

public class comparadore {
    public static void main(String[] args) {
        
        System.out.println("Introduxca numero 1");
        
        Scanner sc = new Scanner(System.in);

        int numero1 =sc.nextInt(); 

        System.out.println("Introduxca numero 2");

        int numero2 =sc.nextInt(); 

        System.out.println("El numero1 es MAYOR que el numero2 = " + (numero1 > numero2));

        boolean resultadoIgualdad = (numero1 == numero2);

        System.out.println("El numero1 es IGUAL que el numero2 = " + (resultadoIgualdad));

        sc.close();
    }
}
