package Programacion.Bucles;
import java.util.Scanner;

public class calculadoraSimple {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        do {

            System.out.println("CALCULADORA");
            System.out.println("------------------");
            System.out.println("1-suma");
            System.out.println("2-resta");
            System.out.println("3-multi");
            System.out.println("4-div");
            System.out.println("0-exit");
            System.out.print("Eligue una opcion:");
            int operacion = sc.nextInt();

            int dato1 = 0;
            int dato2 = 0;

            if (operacion != 0) 
            {
            System.out.println("Dime el perimer dato:");
            dato1 = sc.nextInt();
            System.out.println("Dime el segundo dato");
            dato2 = sc.nextInt();
            }

            switch (operacion){
                case 1:
                    System.out.println("El resultado es: "+(dato1+dato2));
                break;
                case 2:

                    System.out.println("El resultado es: "+(dato1-dato2));
                break;
                case 3:

                    System.out.println("El resultado es: "+(dato1*dato2));
                break;
                case 4:

                    if (dato2 != 0){
                    System.out.println("El resultado es: "+(dato1/dato2));
                    } else {System.out.println("ERROR: dividiendo por 0");}
                break;    
                case 0: 
                    salir = true;

                break;
                default: System.out.println("Operacion introducida no valida, vuelva a probar");
   
            }
        } while (salir != true);

        System.out.println("Hasta la proxima!");
        sc.close();

    }
}
