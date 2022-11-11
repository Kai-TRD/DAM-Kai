package Programacion.Seleccion;
import java.util.Scanner;

public class Ejemplo6Seleccion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numnero del 1 al 7:");

        int diaSemana = sc.nextInt();

        sc.close();
        switch (diaSemana)
        {
        case 1:
            System.out.println("LUNES");
            break; 
        case 2:
            System.out.println("MARTES");
            break;
        case 3:
            System.out.println("MIERCOLES");
            break;
        case 4:
            System.out.println("JUEVES");
            break;
        case 5:
            System.out.println("VIERNES");
            break;
        case 6:
        case 7:
            System.out.println("DOMINGO");
            System.out.println("FIN DE SEMANA");
            break;
        default:
            System.out.println("ERROR");
        }


    }
}
