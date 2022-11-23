package Bucles;

import java.util.Scanner;

public class mostrarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribeme un numero:");
            int maximo = sc.nextInt();
        System.out.print("De cuanto en cuanto??");
            int saltos = sc.nextInt();

        sc.close();

        for(int numero = 0; numero <= maximo; numero += saltos)
        {
            System.out.println(numero);
        }
    
    
    
    }
}
