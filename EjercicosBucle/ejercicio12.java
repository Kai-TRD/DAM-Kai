import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad:");
        int cantidad = sc.nextInt();
        sc.close();
        

        System.out.println("----------------");
        switch (cantidad) {
            case 0:
              System.out.println("");
              break;
            case 1:
              System.out.println("0");
              break;
            case 2:
              System.out.println("0");
              System.out.println("1");
              break;
            case 3:
            System.out.println("0");
            System.out.println("1");
            System.out.println("1");
              break;
            default:
            System.out.println("0");
            System.out.println("1");
            int numero1 = 0; 
            int numero2 = 1;
            int numero3 = numero1+numero2;
                for (int i = 1; i <= cantidad*2; i++) {
                    numero3 = numero1;
                    numero1 = numero2;
                    numero2 = numero3 + numero2;
                    System.out.println(numero2);
                    cantidad--;
                }
        }
    }
}
