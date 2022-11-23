package EjerciciosDeRefuerzo;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
    

    //Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
    //una altura h. Aplica la fórmula
    //t = √2h/g siendo g = 9.81m/s^2

    Scanner sc = new Scanner(System.in);
    System.out.println("Dime la altura(h) para aplicar la siguiente formula");
    System.out.println("        t = √2h/g");
    System.out.println("g = 9.81m/s^2");
    System.out.print("h = ");
    float h = sc.nextFloat();

    sc.close();
    
    final float G = 9.81f;
 
    Double t =Math.sqrt(((2*h)/G));
    
    System.out.println("Tardara en caer: "+t+" s");
    
}
}