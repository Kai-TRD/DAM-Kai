package Programacion.Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

//package Ejercicio conceptos básicos;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un numero:");
    int numero1 = sc.nextInt();
    
    int restoDivision =numero1 % 2;

    boolean esPar = restoDivision == 0;
    
    System.out.println("El numero es par? "+ esPar);

    sc.close();

  }  
}
