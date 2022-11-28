package masEjerciciosDeBucles;

import java.util.Scanner;

public class piramideDeLetras {
    public static void main(String[] args) {
        /*
         *  Crea un programa que pida una altura para una pirámide y cree una pirámide de letras de esta forma:
            Altura 4

            A
            AB
            ABC
            ABCD

            Ten en cuenta que el máximo de altura que puedes introducir es 25
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura de la piramide: ");
        int altura = sc.nextInt();
        sc.close();
        
        //String abecedario = "A B C D E F G H I J K L M N Ñ O P Q R S T U V W X Y Z";
        //String cortarLetras[] = abecedario.split(" ");



        for (int i = 1; i <= altura; i++) {
            char cortarLetras = 65;    
                for (int k = 0; k < i; k++) {
                    System.out.print(cortarLetras/*[k]*/);
                    cortarLetras++;
                    if (cortarLetras>90){cortarLetras=65;}
                }
            System.out.println();
        }
    }
}
