import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = sc.nextInt();
        while(numero > 0){

            System.out.println(numero / 10);
        
        }
    sc.close();
    }
}
