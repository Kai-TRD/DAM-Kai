import java.util.Scanner;

public class ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Indroduzca la altura de la L: ");
        int numero = sc.nextInt();
        sc.close();
        for (int i = 1; i <= numero-1; i++) {
            System.out.println("*");
        }
        for (int i = 1; i <= (numero/2)+1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
