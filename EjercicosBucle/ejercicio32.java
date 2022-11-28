import java.util.Scanner;

public class ejercicio32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numero = sc.nextInt();
        
        
        int suma = 0;
        String digitoPares = "";
        System.out.print("Digitos pares: ");

        while(numero > 0){
            int digitoUnico = numero % 10;

            if(digitoUnico % 2 == 0)
            {
                digitoPares = digitoUnico + " " + digitoPares;
                suma += digitoUnico;
                System.out.print(digitoPares);
            }
        }

        System.out.println("Suma de los dígitos pares: "+suma);
        sc.close();
    }    
}
