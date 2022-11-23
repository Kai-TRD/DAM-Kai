package tareaPractica1;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        /*
         *  Vamos a simular un 1 contra 1 en baloncesto para ello necesitamos saber:
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

        System.out.println("-------------NOMBRES-------------");
        System.out.println("Nombre del jugador atacante:");
        String nombreAtacante = sc.nextLine();
        System.out.println("Nombre de jugador defensor:");
        String nombreDefensor = sc.nextLine();


        System.out.println("------------ATACANTE: "+nombreAtacante+"-------------");
        System.out.println("% de aciertos de 2:");
        int porcentajeDeAcierto2 = sc.nextInt();
        System.out.println("% de aciertos de 3:");
        int porcentajeDeAcierto3 = sc.nextInt();


        System.out.println("¿Ataca 2 o 3?:");
        int formaDeAtaque = sc.nextInt();
        

        System.out.println("------------DEFENSOR: "+nombreDefensor+"-------------");
        System.out.println("El nº de veces que logra hacer que atacante falle (0-10):");
        int bloqueo = sc.nextInt();

        sc.close();

        System.out.println("-------------------------------------------------------------");
        double random1 = Math.random();
        double random2 = Math.random();

        int formaDeAtaqueReal = (formaDeAtaque==2) ? porcentajeDeAcierto2 : porcentajeDeAcierto3;

        
        //(numeroAlAzar * %AciertoTipoSeleccionado) > (numeroAlAzar * EficaciaDefensa * 10)
        String resultado = ((random1 * formaDeAtaqueReal)>(random2 * bloqueo * 10) ?  "gana" : "pierde" );

        double calculo1 = (random1 * formaDeAtaqueReal);
        double calculo2 = (random2 * bloqueo * 10);

        System.out.println((resultado == "gana") ? "El jugador "+nombreAtacante+" ha encestado de "+formaDeAtaque+" ("+calculo1+">"+calculo2+")" : "El jugardor "+nombreAtacante+" NO ha encestado "+"("+calculo1+"<"+calculo2+")"  );
      
        
        
        }
}
