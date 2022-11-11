package Programacion.Practicas;

import java.util.Scanner;

public class ClaseMath {
    public static void main(String[] args) {
        
        //ABS
        System.out.println(Math.abs(-3));


        
        //MIN y MAX
        double num1 = 12.35634;
        double num2 = 12.356234;
        double num3 = 12.6234;
    
        double minimo =Math.min(num1, num2);
        minimo = Math.min(minimo, num3);
        System.out.println("El minimo es "+ minimo);
    
        double maximo = Math.max(num1, num2);
        maximo = Math.max(maximo, num3);
        System.out.println("EL maximo es "+ maximo);
    

        //Potencia - pow
        System.out.println("2 elevado a 4 = "+ Math.pow(2, 4));
        System.out.println("2 elevado a 4 = "+ Math.pow(15, 5000));
 

 
        //Redondeo - round

            //redondeo hacia arriba
        System.out.println(num1 + " ---> " + Math.round(num1));
        System.out.println(num3 + " ---> " + Math.round(num3));
 
            //redondea hacia abajo
        System.out.println(num1 + " --floor--> " + Math.floor(num1));
        System.out.println(num3 + " --floor--> " + Math.floor(num3));
        
            //redondea siguiente valor
        System.out.println(num1 + " --ceil--> " + Math.ceil(num1));
        System.out.println(num3 + " --cail--> " + Math.ceil(num3));
        
        //Aleatorio - random entre 0 y 1
        System.out.println(Math.random());
 

            //entre 0 y 100
            System.out.println(Math.random()*100);

            //entre 50 y 100
            System.out.println(Math.random()*50+50);
 
        //escribir PI
        System.out.println(Math.PI);
 
 
 
 

        /*
         * Hacer programa que pida un numero de segundos y nos indique
         * en que minuto estamos.
         */
 
         Scanner sc = new Scanner(System.in);

         System.out.println("Dime los segundos:");
         int segundos = sc.nextInt();
         
         
         int minuto = segundos/60;
        
        System.out.println(minuto); 

 


        sc.close();
    }
}
