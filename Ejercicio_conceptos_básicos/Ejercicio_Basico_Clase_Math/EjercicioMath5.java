package Programacion.Ejercicio_conceptos_básicos.Ejercicio_Basico_Clase_Math;
import java.util.Scanner;
public class EjercicioMath5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime los segundos:");
        float segundos = sc.nextFloat();

//        double minutos = Math.floor(segundos/60) ;

//        System.out.println(minutos);

        double division = segundos/60;
        System.out.println(division);
        System.out.println(Math.ceil(division));

sc.close();
    }
}
