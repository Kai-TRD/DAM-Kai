package tareaPractica1;
import java.util.Scanner;



public class tarea2 {
    public static void main(String[] args) {
        
/*
    Vamos a simular un 1 contra 1 en baloncesto para ello necesitamos saber:
        Nombre del jugador atacante y del jugador defensor
    
        El % de acierto de 2  y de 3 del jugador atacante.
        
        El numero de veces que el jugador defensor logra hacer que su atacante falle (número de 0 a 10)
    
        Y si el jugador atacante decide tirar de 2 o de 3.


    Para saber si mete canasta utilizaremos esta fórmula:

    (numeroAlAzar * %AciertoTipoSeleccionado) > (numeroAlAzar * EficaciaDefensa * 10)
    Debes mostrar al finalizar el siguiente mensaje:


    El jugador "XXXXXXX" ha encestado de 2 (xxx > yyyy)

    El jugardor "XXXXXX" NO ha encestado  (xxxx< yyyyy)
 */

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indica el nombre del atacante:");
        String nombreAtacante = sc.nextLine();

        System.out.println("Indica el nombre del defensor:");
        String nombreDefensor = sc.nextLine();

        System.out.println("-------------------------ATACANTE: "+nombreAtacante+"-------------------------");
       
        System.out.println("Indica el % de acierto de 2");
        int acirto2 = sc.nextInt();
        System.out.println("Indica el % de acierto de 3");
        int acierto3 = sc.nextInt();
       
        System.out.println("-------------------------DEFENSOR: "+nombreDefensor+"-------------------------");
       
        System.out.println("Indica el nº de veces que hace que falle el atacante");
        int fallo = sc.nextInt();

        System.out.println("-------------------------ATACANTE: "+nombreAtacante+"-------------------------");
       
        System.out.println("¿Como decide tirar el atacante? (2 o 3)");
        int modo = sc.nextInt();

        System.out.println("------------------RESULTADOS-DEL-PARTIDO------------------");
        
        double numeroRandom1 = Math.random();
        double numeroRandom2 = Math.random();

        int tipo = (modo == 2)? acirto2 : acierto3;
        
        boolean resultados = ((numeroRandom1 * tipo) > (numeroRandom2 * fallo * 10 ));

        System.out.println(resultados);

        System.out.println((resultados == false)? "El jugador "+nombreAtacante+" NO ha encestado" : "El jugador "+nombreAtacante+" ha encestado de 2");
        
        sc.close();
    }
}
