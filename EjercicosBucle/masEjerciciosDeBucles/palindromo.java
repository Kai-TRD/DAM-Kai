package masEjerciciosDeBucles;

import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
    /*
       Crea un programa que lea frases y nos indique si dicha frase es un palindromo (se lee igual de izquierda a derecha que de derecha a izquierda) .
       Ten en cuenta que los espacios no se tienen en cuenta.
       El programa debe de pedir frases hasta que el usuario escriba "SALIR"
    */
        Scanner sc = new Scanner(System.in);    
        System.out.println("Escribeme una de las opciones");
        System.out.println("-----------------------------");
        System.out.println("    Introducir una frase");
        System.out.println("    para salir pones SALIR");
        System.out.println("-----------------------------");
        String frase = sc.nextLine();
            
        do {
            frase = frase.replace(" ", "");
            frase = frase.toUpperCase();
            String fraseInvertida = "";
            for (int apuntador = frase.length()-1; apuntador >= 0; apuntador--) {
                char caracterApuntado = frase.charAt(apuntador);
                fraseInvertida = fraseInvertida + caracterApuntado;
            }

            boolean esPalindromo = frase.equals(fraseInvertida);
            if(esPalindromo==true){
                System.out.println("Son palindromas");
            }
            else {
                System.out.println("No lo son");
            }
            frase = "SALIR";
        } while (!frase.toUpperCase().equals("SALIR"));
        sc.close();
    }
}
