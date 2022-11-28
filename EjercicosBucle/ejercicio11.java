import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numero = sc.nextInt();
        sc.close();
        System.out.println(" n | n² | n³");
        System.out.println("-------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(" "+numero+" | "+numero*numero+" | "+numero*numero*numero+" ");
            numero++;
        }
        

      }
    }