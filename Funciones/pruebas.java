import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean resultado = false;
        int numero = sc.nextInt();
        int numeroComparar = numero;
        int resto = 0;
        int invertido = 0;

        while( numero > 0 ) {
           resto = numero % 10;
           invertido = invertido * 10 + resto;
           numero /= 10;
        }

        if(numeroComparar == invertido){
            resultado = true;
        }

        System.out.println(invertido);
        System.out.println(resultado);

    }
}
