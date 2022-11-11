package Programacion.tareaPractica1;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        /*
         * Utilizando el texto siguiente realiza lo siguiente:

                Muchos años después,
                frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de
                recordar aquella tarde remota en que su padre lo llevó a conocer el
                hielo. (Cien años de soledad. G. García Márquez).
           
           Mostrar la información del libro sabiendo que aparece despues del simbolo '(' : "Libro: Cien años de soledad. G. García Márquez"
           
           
           Busca un número random entre 0 y el número total de caracters  y muestralo por pantalla. El caracter en la posicion X es:
           
           Trocea
           el texto en palabras y devuelve la palabra que esté en la posición que
           indique un número aleatorio entre 0 y el número de palabras. La palabra
           en la posición x es: XXXX
           
           Preguntar
           ¿Como se llamaba el coronel? y si responde su nombre o su apellido o
           ambos, sin tener en cuenta las mayúsculas/minúsculas) indicar que se ha
           acertado la pregunta.
         */

         String cadena = "Muchos años después, frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de recordar aquella tarde remota en que su padre lo llevó a conocer el hielo. (Cien años de soledad. G. García Márquez).";

        int longitudTotal = cadena.length();
        System.out.println(longitudTotal);

        System.out.println("--------------------------------------------------------------");
        
        String[] partes = cadena.split("\\(");
        int longitud1 = partes[1].length();
        int longitud2 = longitud1 - 2;
        System.out.println(partes[1].substring(0, longitud2)); 
        
        System.out.println("--------------------------------------------------------------");

        double random1 = Math.random()*longitudTotal;
        int random2 = (int) Math.round(random1);
        System.out.println("Palabra al azar: "+cadena.charAt(random2));

        System.out.println("--------------------------------------------------------------");
        

        String[] trocear = cadena.split(" ");
        double palabrasTotales = trocear.length;
        double palabraRandom = palabrasTotales * Math.random();
        int palabraRandom2 = (int) Math.round(palabraRandom);
        System.out.println("La palabra en la posición " +palabraRandom2+ " es: "+trocear[palabraRandom2]);
        

        System.out.println("--------------------------------------------------------------");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Como se llamaba el coronel?");
        String nombre = sc.nextLine();
        sc.close(); 
        boolean verdadONo1 = nombre.equalsIgnoreCase("Aureliano Buendia");
        boolean verdadONo2 = nombre.equalsIgnoreCase("Aureliano");
        boolean verdadONo3 = nombre.equalsIgnoreCase("Buendia");
        System.out.println( ((verdadONo1 || verdadONo2 || verdadONo3)==true));
    }
}
