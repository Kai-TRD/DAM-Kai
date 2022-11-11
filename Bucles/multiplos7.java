package Programacion.Bucles;

import java.util.Scanner;

public class multiplos7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribeme un numero:");
            int maximo = sc.nextInt();
        sc.close();
        for(int numero = 0; numero <= maximo; numero +=7)
        {
            System.out.println(numero);
        }
    


    }
}
