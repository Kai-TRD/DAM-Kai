import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una base: ");
        int base = sc.nextInt();
        System.out.print("Dime un exponente: ");
        int exponente = sc.nextInt();
        sc.close();
        int resultado = exponente;

        for (int i = 1; i < exponente; i++) {
            resultado = resultado*base;    
        }
        System.out.println("El resultado es: "+resultado);
    }
}
