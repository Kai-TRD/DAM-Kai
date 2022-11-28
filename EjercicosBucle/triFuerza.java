import java.util.Scanner;


/*
oooo11116
oooo111666
oooo1166666
oooo16666666
1111611111116
11166611111666
116666611166666
1666666616666666
 */

public class triFuerza {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int valor = sc.nextInt();
        sc.close();
        
        
        int numero = valor/2;
        int numero2 = numero;
        int solido = numero;
        int anchura = 0;
        int anchura2 = 0;


        while(numero != 0){
            for (int i = 0; i < solido; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < numero; i++) {
                System.out.print(" ");
            }
            
            for (int i = anchura; i >= 0; i--) {
                System.out.print("*");
            }
            System.out.println();
            numero-=1;
            anchura += 2;
        }
        while(numero2 != 0){
            for (int i = 0; i < numero2; i++) {
                System.out.print(" ");
            }
            
            for (int i = anchura2; i >= 0; i--) {
                System.out.print("*");
            }
            for (int i = 0; i < numero2*2-1; i++) {
                System.out.print(" ");
            }
            for (int i = anchura2; i >= 0; i--) {
                System.out.print("*");
            }
            System.out.println();
            numero2-=1;
            anchura2 += 2;
        }
    }
}

