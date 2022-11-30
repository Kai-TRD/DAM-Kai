import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int cantidad = sc.nextInt();




        int numeroTemporal = numero;
			

        while(numeroTemporal > 0){
            numeroTemporal = numeroTemporal/10;
        }
        

        for (int i = cantidad; i > 0; i--) {
            numero = numero / 10;
        }
        System.out.println(numero);
    }
}
