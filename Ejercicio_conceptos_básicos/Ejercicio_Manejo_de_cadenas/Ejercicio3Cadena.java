package Ejercicio_conceptos_básicos.Ejercicio_Manejo_de_cadenas;
import java.util.Scanner;



public class Ejercicio3Cadena {
    public static void main(String[] args) {
        //Partir un texto introducido por el usuario por la posición que tambien introduzca el usuario.
        //Mostrar las 2 partes de la cadena: “Parte izquierda xxxxx y parte derecha xxxxx”
        Scanner sc = new Scanner(System.in);

        //Pido una cadena de texto
        System.out.println("Escribe una cadena de texto:");
        String texto = sc.nextLine();

        //Pido en numero de la posición
        System.out.println("Dime el numero de la posición:");
        int posicion = sc.nextInt();

        boolean noSobrepasa = (posicion <= texto.length())? true : false;

        String parteIzquierda = (noSobrepasa) ? texto.substring(0, posicion):"";
        String parteDerecha = (noSobrepasa) ? texto.substring(posicion, texto.length()): "";

        System.out.println("Parte Izquierda= " + parteIzquierda);
        System.out.println("Parte Derecha= " + parteDerecha);

        sc.close();

    }
}
