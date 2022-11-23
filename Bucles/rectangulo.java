package Bucles;

import java.util.Scanner;

public class rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribeme los valores de un rectangulo");
        System.out.print("Anchura: ");
        int N = sc.nextInt();
        System.out.print("ALtura: ");
        int R = sc.nextInt();
        System.out.print("Caracter Interior: ");
        sc.nextLine();
        String caracter = sc.nextLine();
        System.out.println("------------------------------------------------");
        for(int altura = 1; altura <= R; altura++)
        {
            for(int anchura = 1; anchura <= N; anchura++)
            {
                System.out.print(caracter);
            }
            System.out.println("");
        }
        sc.close();
    }
}
