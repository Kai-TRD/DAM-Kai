import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        int suma = 0;
        int contar = 0;
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indicame numeros para hacer una media con ellos");
        System.out.println("Al introducir un numero negativo, se hara la media");
        do 
        {
            contar++;
            numero = sc.nextInt();
            if (numero > 0){suma = suma + numero;}
        }while(numero > 0);
        sc.close();
        contar = contar - 1;
        System.out.println("La media de los numeros introducidos es: "+suma/contar);
    }
}
