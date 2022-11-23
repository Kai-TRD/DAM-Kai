package Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Dime un numero para multiplicarlo al cubo");
    float numero1 = sc.nextFloat();

    System.out.println("El resultado es "+(numero1*numero1*numero1));

    sc.close();
    
}    
}
