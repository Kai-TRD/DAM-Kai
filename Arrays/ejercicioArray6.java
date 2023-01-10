package Arrays;
import java.net.ContentHandlerFactory;

public class ejercicioArray6 {
    public static void main(String[] args) {
        int[] numero = new int[15];

        int[] numeroRotado = new int[15];

        asignar(numero);
        imprimir(numero);
        rotar(numero);
    }

    static void asignar(int[] numero){
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int)(Math.random()*10);
        }
    }

    static void imprimir(int[] numero){
        for (int i = 0; i < numero.length; i++) {
            System.out.print("["+numero[i]+"]");
     
        }
        System.out.println();
    }

    static void rotar(int[] numero){
        for (int i = 0; i < numero.length; i++) {
            if (i < numero.length-1){
                numero[i+1] = copia[i]
            }
        }
    }
}
