package masEjerciciosDeBucles;

import java.util.Scanner;

public class cifrado {
    public static void main(String[] args) {
        /*
            Vamos a realizar un cifrado de texto que consistirá en sustituir cada letra del
            texto por un carácter que estará x posiciones más adelantado
            Por ejemplo si tenemos la A y el factor de cifrado = 2 entonces el nuevo
            carácter será C. Ademas como primer elemento del resultado aparecerá este factor
            de cifrado. -> Si cifro A con factor 3 entonces de resultado me da "3D"
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Escrieme un texto para cifrar:");
        String texto = sc.nextLine();
        System.out.println("Dime el factor para cifrar(int):");
        int factor = sc.nextInt();
        int caracteresTexto = texto.length();
        int contador = 0;
        System.out.println("================================");

        char[] caracteres =texto.toCharArray();


        while(contador < caracteresTexto){
            
            int cifrado = (int)(caracteres[contador])+factor;
            char cifradoCaracter = (char)cifrado;
            System.out.println("Caracter: "+ caracteres[contador] + " --- " + cifradoCaracter + "("+ (int)cifradoCaracter +")");
            contador++;
        }
        System.out.println("================================");
        contador = 0;
        System.out.print("\t"+factor);
        while(contador < caracteresTexto){
            
            int cifrado = (int)(caracteres[contador])+factor;
            char cifradoCaracter = (char)cifrado;

            System.out.print(cifradoCaracter);


            contador++;
        }
        System.out.println();
        System.out.println("================================");
        sc.close();
    }
}
