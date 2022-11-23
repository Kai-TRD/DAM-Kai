package Seleccion;
import java.util.Scanner;

public class Ejemplo7Seleccion {
    public static void main(String[] args) {
        /*
         * Dime las cifras que tiene
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Pon un numero de varias cifras:");
         int numero = sc.nextInt();
        sc.close();
        if (numero >= 0 && numero <10)
        {
            System.out.println("Tiene 1 cifra");
        }
        else if (numero >= 10 && numero <100)
        {
            System.out.println("Tiene 2 cifra");
        }
        else if (numero >= 100 && numero <1000)
        {
            System.out.println("Tiene 3 cifra");
        }
        else if (numero >= 1000 && numero <10000)
        {
            System.out.println("Tiene 4 cifra");
        }
        else if (numero >= 10000 && numero <100000)
        {
            System.out.println("Tiene 5 cifra");
        }
        else if (numero >= 100000 && numero <1000000)
        {
            System.out.println("Tiene 6 cifra");
        }
        else if (numero > 1000000)
        {
            System.out.println("El numero supera las 6 cifras");
        }

    }
}
