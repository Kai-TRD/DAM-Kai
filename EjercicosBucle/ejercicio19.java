import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
            
        /*     +
         *    +++
         *   +++++
         *  +++++++   
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura de la piramide: ");
        int altura = sc.nextInt();
        System.out.print("Dime un caracter");
        sc.nextLine();
        String caracter = sc.nextLine();
        sc.close();

        int ancho = 1;
        int espacio = altura-1;        
        for (int i = 1; i <= altura; i++) {    
               
            for (int j = espacio; j > 0; j-=1) {
            
                System.out.print(" ");
            }            
            for (int j = 1; j <= ancho; j++) {
            
                System.out.print(caracter);
            }
            
            ancho = ancho + 2;
            espacio = espacio - 1;
            System.out.println();
        }
    }
}
    