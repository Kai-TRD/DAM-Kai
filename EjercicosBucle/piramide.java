import java.util.Scanner;
public class piramide {
    public static void main(String[] args) {
        /*     +
         *    +++
         *   +++++
         *  +++++++
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura de la piramide: ");
        int altura = sc.nextInt();
        sc.close();
        int ancho = 1;
        int espacio = altura-1;

        for (int i = 1; i <= altura; i++) {
            System.out.println();

            
            for (int j = espacio; j > 0; j-=1) {
                System.out.print(" ");
            }


            for (int j = 1; j <= ancho; j++) {
                System.out.print("*");
            }
            ancho = ancho + 2;
            espacio = espacio - 1;
        System.out.println();
        }
    }
}
