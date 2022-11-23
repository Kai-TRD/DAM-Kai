package Seleccion;
import java.util.Scanner;

public class Ejemplo3Seleccion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Escribe el numero1");
        int numero1 = sc.nextInt();
        System.out.println("Escribe el numero2");
        int numero2 = sc.nextInt();

        sc.close();

        if (numero1 / numero2 == 0 || numero2 / numero1 == 0)
        {
            System.out.println("Es multiplo");
        }
        else
        {
            System.out.println("No es multiplo");
        }

        
    }
}
