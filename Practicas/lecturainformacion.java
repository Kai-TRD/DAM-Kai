package Programacion.Practicas;
import java.util.Scanner;

public class lecturainformacion {
    public static void main(String[] args) {
        
        Scanner puertaLectura = new Scanner(System.in);

        // System.out.println("Introduzca su nombre y pulse enter");

        // String nombreUsuario = puertaLectura.nextLine();
        
        // System.out.println("Nombre introducido es: " + nombreUsuario);
        
        // int edad = puertaLectura.nextInt();

        // float altura = puertaLectura.nextFloat();


        //"Tu nombre es Alfonso, tu estatura es 1.70 y tu edad es 89"


        
        //Nombre del Usuario
        System.out.println("Introduzca tu nombre:");

        String nombreUsuario = puertaLectura.nextLine();


        //Altura del Usuario
        System.out.println("Introduzca tu altura:");

        float altura = puertaLectura.nextFloat();


        //Edad del Usuario
        System.out.println("Introduzca tu Edad:");

        int edad = puertaLectura.nextInt();

        //Resultado
        System.out.println("Tu nombre es " + nombreUsuario + ", tu estatura es " + altura + " y tu edad es " + edad);

 
    puertaLectura.close();


    }
}