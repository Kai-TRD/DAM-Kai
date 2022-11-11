package Programacion.Ejercicio_conceptos_básicos.Ejercicio_Manejo_de_cadenas;
import java.util.Scanner;
public class Ejercicio6Cadena {
    public static void main(String[] args) {
        /*

            Dado el texto “En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite”
            Debes de crear un programa que pregunte ¿Quién estaba en casa de Juan? y según la respuesta del usuario indique si esa persona estaba o no. 
            Cuidado: el usuario al introducir el nombre de la persona puede hacerlo con minúsculas o mayúsculas pero el resultado no debe alterarse.

        
        */

        Scanner sc = new Scanner(System.in);
        
        System.out.println("En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite");
        String cadena = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";
        System.out.println("¿Quien estaba en la casa de juan?");
        String nombresBuscado = sc.nextLine();

        String cadenaMinuscula = cadena.toLowerCase();
        String nombreBuscadoMinusculas = nombresBuscado.toLowerCase();
        
        int posicionEncontrada = cadenaMinuscula.indexOf(nombreBuscadoMinusculas);

        

        System.out.println((posicionEncontrada >= 0) ? "Se encuentra en la casa: " + nombresBuscado : nombresBuscado + " no estaba en la casa");


        sc.close();
    }
}
