package EjerciciosDeRefuerzo;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        
        /*
         *  Calcula la nota de un trimestre de la asignatura Programación. El programa
            pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
            Si la media de los dos controles da un número mayor o igual a 5, el alumno
            está aprobado y se mostrará la media. En caso de que la media sea un número
            menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
            se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
            ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
            de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
            la nota media anterior.
            
            Ejemplo 1:
            
            Nota del primer control: 7
            Nota del segundo control: 10
            Tu nota de Programación es 8.5
            
            Ejemplo 2:
            
            Nota del primer control: 6
            Nota del segundo control: 3
            ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
            Tu nota de Programación es 5
            
            Ejemplo 3:
            
            Nota del primer control: 6
            Nota del segundo control: 3
            ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
            Tu nota de Programación es 4.5

        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Nota del primer control: ");
        float nota1 = sc.nextFloat();
        System.out.print("Nota del segundo control: ");
        float nota2 = sc.nextFloat();

        float notaMedia = (nota1 + nota2) / 2;

        
        if (notaMedia >= 5) {
            System.out.println("Tu nota de Programacion es: " + notaMedia);
        } else {
            sc.nextLine();
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            
            String aptoONo = sc.nextLine();

            if (aptoONo.equals("apto")) {
                System.out.println("Tu nota de Programacion es: 5");
            } else {
                System.out.println("Tu nota de Programacion es:" + notaMedia);
            }
        }
        sc.close();
    }
}
