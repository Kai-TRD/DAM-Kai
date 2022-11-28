import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la base: ");
        int base = sc.nextInt();
        System.out.print("Dime el exponente: ");
        int exponente = sc.nextInt();
        sc.close();
        int n = 0;
        for (int i = 0; i < exponente; i++) {
            n = n + 1;
            System.out.println(base+"^"+n);
        }






    }
}
