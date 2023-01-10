package Arrays;

import java.util.Scanner;

public class ejercicioArray7 {
    public static void main(String[] args) {
        
        int[] valores = new int[100];
        boolean[] cambiado = new boolean[100];

        // for (int i = 0; i < cambiado.length; i++) {
        //     cambiado[i] = false;
        // }

        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random()*21);
        }

        int nValue = 30;

        imprimir(cambiado, valores, nValue);

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un valor nuevo:");
        nValue = sc.nextInt();
        System.out.print("Dime un valor al cual sustituir:");
        int oValue = sc.nextInt();
        sc.close();

        for (int i = 0; i < valores.length; i++) {
            if(valores[i] == oValue){
                valores[i] = nValue;
                cambiado[i] = true;
            }
        }

        imprimir(cambiado, valores, nValue);

        for (int i = 0; i < cambiado.length; i++) {
            System.out.print(cambiado[i]+" ");
            
        }

    }

    static void imprimir(boolean[] cambiado, int[] valores,int nValue){
        for (int i = 0; i < valores.length; i++) {
            
            if(cambiado[i] == true)
            {
                System.out.print("\""+valores[i] + "\"" + " ");
            }
            else
            {
                System.out.print(valores[i] + " ");
            }
        }

        System.out.println();
    }
}