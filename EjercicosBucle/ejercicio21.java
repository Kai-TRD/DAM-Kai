import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cadena de caracteres: ");
        int numero = 0;
        int suma = 0;
        int sumaPares = 0;
        int sumaInpares = 0;
        int cantidad = 0;


        while (numero >= 0)
        {
            numero = sc.nextInt();
            if(numero < 0){
            suma = suma + numero;
            if (numero/2 == 0)
            {
                sumaInpares = sumaInpares + numero;
            }
            else
            if (numero/2 > 0)
            {
                sumaPares = sumaPares + numero;
            }
            }
        cantidad++;

        }
        System.out.println("=========================");
        System.out.println(suma/cantidad-1);
        System.out.println(sumaPares);
        System.out.println(sumaInpares);
        sc.close();
    }
}
