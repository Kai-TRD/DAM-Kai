package Programacion.Ejercicio_conceptos_básicos.Ejercicio_Manejo_de_cadenas;
import java.util.Scanner;


public class Ejercicio11cadena {
    public static void main(String[] args) {
        
/*  
    Realiza un programa que lea un dígito del 0 al 9 y muestre por pantalla el carácter
    que ocupa dicha posición en una cadena interna.

    Debes comprobar que se ha introducido un dígito, que no estamos buscando en una
    posición más grande que la longitud de la cadena y si estoy mostrando un espaci
    entonces mostrar la cadena “ESPACIO”
 */
    final String frase = "Hoy es feria en Fuenjirola";
    Scanner sc = new Scanner(System.in);

    System.out.println("Escribe un diguito entre 0-9");
    int posicionChar = sc.nextLine().charAt(0);

    boolean esDigito = Character.isDigit(posicionChar);

    //int posicionInt = (int)posicionChar; //ERROR, devuelve el codigo ASCII del nº leido
  
    //int posicionInt = Integer.valueOf(posicionChar+"");
    int posicionInt = Character.getNumericValue(posicionChar); 
  
    System.out.println((esDigito) ? "Posicion leida " + posicionInt : "ERROR" );
    
    boolean dentroLimites = (posicionInt>= 0 && posicionInt < frase.length());

    char caracterEnPosicion = (esDigito && dentroLimites ) ? frase.charAt(posicionInt) : '-';

    boolean esEspacio = (esDigito && dentroLimites) ? Character.isSpaceChar(caracterEnPosicion): false;
    
    String mensajeResultado = (esEspacio) ? "-ESPACIO-":caracterEnPosicion+"";

    String mensajeTotal = (esDigito&&dentroLimites) ? "El Diguito en la posicion " : "" ;
    

    System.out.println(mensajeResultado);
    System.out.println(mensajeTotal);


    sc.close();

    }
}
