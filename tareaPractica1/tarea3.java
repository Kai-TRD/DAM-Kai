package tareaPractica1;

public class tarea3 {
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

        
        String texto = "Muchos años después, frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de recordar aquella tarde remota en que su padre lo llevó a conocer el hielo. (Cien años de soledad. G. García Márquez).";
        
        System.out.println("Dado el sigiente texto;");
        System.out.println("Muchos años después,");
        System.out.println(" frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de");
        System.out.println("recordar aquella tarde remota en que su padre lo llevó a conocer el");
        System.out.println(" hielo. (Cien años de soledad. G. García Márquez).");
 
        System.out.println("----------------------------Informacion-del-libro-------------------------------");
        String[] trozos = texto.split("\\(");
        int longitud1 = trozos[1].length();
        System.out.println(trozos[1].substring(0, longitud1-2));
        System.out.println("----------------------------Una-Letra-en-el-texto-------------------------------");
        int longitudTexto = texto.length();
        double random2 = Math.round(Math.random() * longitudTexto);
        System.out.println(random2);
 
 
 
 
 
 
    }
}
