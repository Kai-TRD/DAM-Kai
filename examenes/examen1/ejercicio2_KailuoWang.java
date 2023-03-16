package examenes.examen1;

import java.util.Scanner;

public class ejercicio2_KailuoWang {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Pedimos los valores
        System.out.print("Dime la altura: ");
        int altura = sc.nextInt();
        System.out.print("Dime la cadena de caracteres: ");
        sc.nextLine();
        String cadena = sc.nextLine();
        
        int AoH = 1;

        //parte de arriba
        AoH = 1;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < 4+cadena.length(); j++) {
                //comprobamos si es par o inpar para saber si imprimir "A" o "H"
                if(AoH % 2 != 0){
                    System.out.print("A");
                } else
                if(AoH % 2 == 0){
                    System.out.print("H");
                }
            }
            AoH++;
            System.out.println();
        }

        //parte del medio
        System.out.println("XX"+ cadena + "XX");
        

        //parte de abajo
        AoH = 1;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < 4+cadena.length(); j++) {
                //comprobamos si es par o inpar para saber si imprimir "A" o "H"
                if(AoH % 2 != 0){
                    System.out.print("A");
                } else
                if(AoH % 2 == 0){
                    System.out.print("H");
                }
            }
            AoH++;
            System.out.println();
        }
        sc.close();
    }
}
