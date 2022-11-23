package Practicas;
import java.util.Scanner;

public class EjemploNuevi {
    public static void main(String[] args) {
    /*
     * Leemos del teclado un caracter
     * Segun ese cartacter se realizará una operación u otra
     * 
     * Si el caracter es "s" entonces suma 2 elementos que debe de pedir al usuario
     * 
     * Si es otro entonces saca el caracter ascii de los dos numeros introducidos
     * 
     * 
     */


        Scanner sc = new Scanner(System.in);
        
        //Leo la cadena y cojo el primer elemento

        char opcion = sc.next().charAt(0);


        System.out.println("Escribe un numero entre el 32 y el 127");
        int numero1 =sc.nextInt();

        System.out.println("Escribe otro numero entre el 32 y el 127");
        int numero2 =sc.nextInt();


        System.out.println((opcion == 's') ? numero1 + numero2 : (char)numero1 + "- "+(char)numero2);

        sc.close();
     }
}
