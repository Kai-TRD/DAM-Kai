package EjerciciosDeRefuerzo;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
    //Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
    
    //Ejemplo 1:
    
    //Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
    //Por favor, introduzca el valor de a: 2
    //Ahora introduzca el valor de b: 1
    //x = -0.5
    
    //Ejemplo 2:
    
    //Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
    //Por favor, introduzca el valor de a: 0
    //Ahora introduzca el valor de b: 7
    //Esa ecuación no tiene solución real.

        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        float a = sc.nextFloat();
        System.out.print("Ahora introduzca el valor de b: ");
        float b = sc.nextFloat();

        sc.close();

      if (a == 0) {
      System.out.println("Esa ecuación no tiene solución real");
    } else {
      System.out.println("x = " + (-b/a));
    }

    }
}
