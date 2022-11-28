import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        int cantidad = 0;
        do {
            numero = sc.nextInt();
            suma = suma + numero;
            cantidad++;
        }while(numero < 1000);
        System.out.println("EL totalñ acumulado es: "+suma);
        System.out.println("La cantidad de numeros introducidos es: "+ cantidad);
        System.out.println("La media es: "+suma/cantidad);
        sc.close();
    }
}
