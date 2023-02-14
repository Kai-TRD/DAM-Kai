package Practicas;
import java.util.Scanner;

public class factura {
    public static void main(String[] args) {

            final int IVA = 21;
    
            System.out.println("Introduzca importe");
            
            Scanner sc = new Scanner(System.in);
    
            float importe =sc.nextFloat(); 


            //Calculo total del IVA
            float resultado = (importe * (IVA + 100) / 100);
    
            System.out.println("El importe mas IVA es " + resultado + "€");
    
            sc.close();

            System.out.printf("El total de la factura es %.2f\n", resultado);
            String cadena = "EDAD";
            System.out.printf("%-10s - esto es una cadena", cadena);
              
            System.out.println(" 4 \\ 2 = 2");    
            System.out.println("Tu nombre es \"PEPE\" ");
    }
}
