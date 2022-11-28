import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Dime 10 numeros: ");
        int positivo = 0;
        int negativo = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int numero = sc.nextInt();
            if(numero < 0){positivo = positivo+1;}
            if(numero > 0){negativo = negativo+1;}
        }
    sc.close();
    System.out.println("Los numero negativos son: "+negativo);
    System.out.println("Los numeros positivos son: "+positivo);
    }
}
