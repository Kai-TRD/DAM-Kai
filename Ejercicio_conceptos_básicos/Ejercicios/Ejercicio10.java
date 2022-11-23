package Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SALARIONORMAL = 12;
        final int SALARIONOCTURNO = 25;


        System.out.println("¿Cuantas horas normales a la semana has trabajado?");
        int horaNormal = sc.nextInt();
    
        System.out.println("¿Cuantas horas nocturnas has trabajado?");
        int horaNocturna = sc.nextInt();
        System.out.println("Siendo pagado 12€/hora en horario normal y 25€/hora en horario nocturno");
        
        int salario = (horaNormal*SALARIONORMAL) + (horaNocturna*SALARIONOCTURNO);    
        
        System.out.println("Has ganado "+salario+"€" );



        sc.close();
    }
}
