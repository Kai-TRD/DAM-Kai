import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long numero = sc.nextInt();
        String algo = "";

        long binario = 0;
        while (numero>=1){
            binario = (numero % 2);
            numero = numero/2;
            System.out.print(binario);
            algo = algo+binario;
        }
        System.out.println();

        
        // numero = (long)algo;
        long resto = 0;
        long invertido = 0;

        while( numero > 0 ) {
        resto = numero % 10;
        invertido = invertido * 10 + resto;
        numero /= 10;
        }

        System.out.println(numero);
        System.out.println(algo);
    }
}
