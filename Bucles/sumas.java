package Bucles;

import java.util.Scanner;

public class sumas {
    public static void main(String[] args) {
        

        String repetir = "s";

        Scanner sc = new Scanner(System.in);

        do {
            double random1 = (Math.random()*100)+1;
            double random2 = (Math.random()*100)+1;
            System.out.println("Dime la suma de estos dos numeros");
            System.out.println(" "+(int)random1);
            System.out.println("+"+(int)random2);
            System.out.println("-----");
            int respuesta = sc.nextInt();
            if(respuesta == ((int)random1+(int)random2)){
                System.out.println("Felicidades, has acertado");
            } else {
                System.out.println("ERROR: has fallado, la repuesta es "+((int)random1+(int)random2));
            }
            
            System.out.println("Quieres repetir??(s/n)");
            sc.nextLine();
            repetir = sc.nextLine();
        } while (repetir.equals("s"));
        sc.close();
    }
}
