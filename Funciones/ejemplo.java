import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int cantidad = sc.nextInt();



        int numeroTemporal = numero;

        int cuentaNumero = 0;

        while(numeroTemporal > 0){
            numeroTemporal = numeroTemporal/10;
            cuentaNumero++;
        }
        int cadena = 0;
        for (int i = 0; i < cuentaNumero; i++) {
            cantidad = cantidad * 10;
        }
        // cadena = cantidad*(cuentaNumero*10);
        numero = numero + cantidad;
        
        
        
        System.out.println(numero);
    }
}
