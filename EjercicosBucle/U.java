import java.util.Scanner;


/*
6

100001
100001
100001
100001
100001
 1111
 */

public class U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int valor = sc.nextInt();
        sc.close();

        for (int i = 0; i < valor; i++) {
            System.out.print("*");
            for (int j = 0; j < valor-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.print(" ");
        for (int i = 0; i < valor-2; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
