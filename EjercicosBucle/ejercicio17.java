import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sumaremos los 100 primeros numero a partir de: ");
        int numero = sc.nextInt();
        sc.close();

        int suma = 0;
        int numerosumado = numero;
        int sumafinal = 0;
        if(numero>0){
            for (int i = 1; i <= 100; i++) {
                sumafinal = sumafinal + numerosumado;
                suma = suma+1;
                numerosumado = suma+numero;
            }
            System.out.println("=======================");
            System.out.println(sumafinal-50*(numero-1));
        } else {
            System.out.println("ERROR: el numero es negativo");
        }
    }
}
