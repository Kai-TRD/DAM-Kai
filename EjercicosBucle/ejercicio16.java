import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Te dire si el numero es primo o no: ");
        double numero = sc.nextDouble();
        sc.close();
        if (numero == 2){
            System.out.println("El numero: 2, es primo");
        }
            else
        if(numero / 2 != (int)(numero/2)){
            System.out.println("El numero: "+(int)numero+", es primo");
        }
            else{
            System.out.println("El numero: "+(int)numero+", NO es primo");
        }
    }
}
