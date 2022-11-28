import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Que nº tabla deberia de mostrar?");
        int valor = sc.nextInt();
        sc.close();
        System.out.println("----------------------------------");
        
        for(int numero = 1; numero <= 10; numero++)
        {
            System.out.println(numero+"*"+valor+"="+valor*numero);
        }

    }
}
