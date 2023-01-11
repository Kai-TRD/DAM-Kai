package Arrays;

import java.lang.StackWalker.Option;
import java.lang.Thread.State;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import javax.sound.sampled.SourceDataLine;

public class ejercicioArray15 {
    public static void main(String[] args) {
        
// ┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
// │Mesa no  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │ 10  │
// ├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
// │Ocupación│  3  │  2  │  0  │  2  │  4  │  1  │  0  │  2  │  1  │  1  │
// └─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
        int[] ocupacion = new int[10];

        for (int i = 0; i < ocupacion.length; i++) {
            ocupacion[i] = (int)(Math.random()*5);
        }

        int option = 0;

        do {
            
        

            System.out.println("┌─────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
            System.out.println("│Mesa no  │  1  │  2  │  3  │  4  │  5  │  6  │  7  │  8  │  9  │ 10  │");
            System.out.println("├─────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");

            System.out.print("│Ocupación│");
            for (int i = 0; i < ocupacion.length; i++) {
                System.out.print("  " + ocupacion[i] + "  │");
            }
            System.out.println();

            System.out.println("└─────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

            Scanner sc = new Scanner(System.in);
            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa):");
            option = sc.nextInt();

            filtro(ocupacion, option);


        } while (option != -1);
        System.out.println("Gracias. Hasta pronto.");
    }



    /**
     * Busca la ocupacion
     * @param ocupacion
     * @param option
     */
    static void filtro(int[] ocupacion, int option){

        if(option>4){
            System.out.println("Lo siento, no admitimos grupos de "+option+", haga grupos de 4 personas como máximo e intente de nuevo.");
        } 
        



        if(option == 4){
            boolean libre = false;
            int suma = 0;
            do {
                if(suma == 10){
                    System.out.println("Lo siento, en estos momentos no queda sitio.");
                    libre = true;
                }
                if(ocupacion[suma]==0){
                    ocupacion[suma] = ocupacion[suma] + option;
                    System.out.println("Por favor, siéntense en la mesa número "+(suma+1)+".");
                    libre = true;    
                }
                suma++;
            } while (libre != true);
        }




        if(option<4)
        {
            boolean libre = false;
            int suma = 0;
            do {
                if(ocupacion[suma]+option <= 4){
                    ocupacion[suma] = ocupacion[suma]+option;
                    System.out.println("Por favor, siéntense en la mesa número "+(suma+1)+".");
                    libre = true;    
                }
                if(ocupacion[suma] == 10){
                    System.out.println("Lo siento, en estos momentos no queda sitio.");
                    libre = true;
                }
                suma++;
            } while (libre != true);
        }
        
    }

}

