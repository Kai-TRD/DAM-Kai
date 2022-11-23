package Bucles;

import java.util.Scanner;

public class tablaDeMultiplicarN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime le nº de la tabla que quieres sacar");
        int N = sc.nextInt();
        System.out.println("La tabla del "+N);
        System.out.println("---------------------------");
        for(int aux = 1;aux <= 10 ; aux++)
        {
            System.out.println(N+"x"+aux+"="+(N*aux));
        }
        sc.close();
    }
}
