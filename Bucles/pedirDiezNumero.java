package Programacion.Bucles;

import java.util.Scanner;

public class pedirDiezNumero {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        System.out.println("Dime 10 numeros");
        for(int aux = 1; aux <= 10; aux++) 
        {
            System.out.print("nº"+aux+": ");
            int numero = sc.nextInt();
            suma = suma+ numero;
        }

        System.out.println("La suma de los 10 numeros es: "+suma);
        System.out.println("La media de los 10 numeros es: "+(suma/10));
        sc.close();
    }
}
