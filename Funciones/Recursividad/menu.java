package Recursividad;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Suma");
        System.out.println("2.Factorial");
        System.out.println("3.Piramide");
        System.out.println("4.Array cadeba");
        System.out.println("Elige una de las opciones");
        int opcion = sc.nextInt();

        int numero = 0;

        switch(opcion){
            case 1:
                System.out.println("Dime un numero al cual sumar:");
                numero = sc.nextInt();
                int suma = funcionesRecursivas.suma(numero);
                System.out.println(suma);
                
            break;

            case 2:
                System.out.println("Dime un numero al cual hacer su factorial:");
                numero = sc.nextInt();
                int factorial = funcionesRecursivas.factorial(numero);
                System.out.println(factorial);

            break;

            case 3:
                System.out.println("Dime un numero al cual hacer su piramide:");
                numero = sc.nextInt();
                int piramide = funcionesRecursivas.piramide(numero);
                System.out.println("Hay "+ piramide + " caracteres");
            break;

            case 4:

            String cadena = "la vaca lola esta loca de la cabeza";
            System.out.println(cadena);
            break;


        }

        sc.close();

    }
}
