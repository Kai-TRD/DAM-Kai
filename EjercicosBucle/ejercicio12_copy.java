import java.util.Scanner;

public class ejercicio12_copy {
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
            int fibactual = numero1 + numero2;
            System.out.println(numero1);
            System.out.println(numero2);
            while(cantidad>0)
              {
                System.out.println(fibactual);
                numero1 = numero2;
                numero2 = fibactual;
                fibactual = numero1 + numero2;
                cantidad--;
              }
              }
      }
}
