package Programacion.EjerciciosDeRefuerzo;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
    //Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
    //las horas extras. Escribe un programa que calcule el salario semanal de un
    //trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
    //trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
    //la hora.
    
    //Ejemplo 1:
    
        //Por favor, introduzca el número de horas trabajadas durante la semana: 36
        //El sueldo semanal que le corresponde es de 432 euros
    
    //Ejemplo 2:
    
        //Por favor, introduzca el número de horas trabajadas durante la semana: 40
        //El sueldo semanal que le corresponde es de 480 euros
    
    //Ejemplo 3:
    
        //Por favor, introduzca el número de horas trabajadas durante la semana: 55
        //El sueldo semanal que le corresponde es de 720 euros

    
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horas = sc.nextInt();
        sc.close();

        if (horas > 40) {
            int horas12 = 40*12;
            int horas16 = (horas - 40)*16;
            int horasTotales = horas12+horas16;
            System.out.println("El sueldo semanal que le corresponde es de "+(horasTotales));
        } 
        else {
            int horasNormal = horas*12;
            System.out.println("El sueldo semanal que le corresponde es de "+(horasNormal));
        }
    }
}
