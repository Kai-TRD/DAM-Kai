import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero entero");
        int numero = sc.nextInt();
        // System.out.print("Indroduce el numero a buscar: ");
        // int numeroBuscar = sc.nextInt();
        int contador = 1;
        while (numero > 0){
            numero = numero / (contador + 10);
            System.out.println(numero);
            contador++;
        }
        sc.close();

    }
}
