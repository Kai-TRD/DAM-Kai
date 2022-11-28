import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = sc.nextInt();
        int resto = 0;
        int invertido = 0;
        while( numero > 0 ) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
         }
        System.out.println(invertido);

        sc.close();
    }
}
