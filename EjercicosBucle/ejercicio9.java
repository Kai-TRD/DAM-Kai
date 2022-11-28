import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDiguito = 0;
        System.out.println("Dime un numero para decirte sus diguitos:");
        int numero = sc.nextInt();
        sc.close();
        while(numero != 0){
            numero  = numero /10;
            numeroDiguito++; 
        }

        System.out.println("El numero dado tiene "+numeroDiguito+" de diguitos");

    }    
}
