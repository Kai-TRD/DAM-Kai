package Programacion.Bucles;

import java.util.Scanner;


public class numeroSecreto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double random =(Math.random()*100)+1;
        System.out.println("Adivina el numero secreto(-1 para rendirse):");
        int numeroIntroducido = sc.nextInt();

        String pista = "";
        int intentos = 0;
        boolean repetir = true;


        while (repetir==true){




            while (numeroIntroducido != (int)random )
            {
                if(numeroIntroducido > random){ pista = "MENOR";}
                if(numeroIntroducido < random){ pista = "MAYOR";}
                intentos = intentos + 1;
                System.out.println("Incorrecto el numero es "+pista+", vuelve a probar");
                numeroIntroducido = sc.nextInt();
                if(numeroIntroducido == -1){
                    numeroIntroducido = (int)random;
                }
            }



            System.out.println("Has tenido "+intentos+" intentos");


            System.out.println("¿Quieres volver a jugar?(s/n)");
            sc.nextLine();
            String repetir2 = sc.nextLine();
            if (repetir2.equals("s")){repetir = true;}
            if (repetir2.equals("n")){repetir = false;}
        }
        sc.close();
    }
        

}
