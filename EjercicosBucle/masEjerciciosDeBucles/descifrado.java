package masEjerciciosDeBucles;

import java.util.Scanner;

public class descifrado {
    public static void main(String[] args) {
        /*
            Vamos a realizar un cifrado de texto que consistirá en sustituir cada letra del
            texto por un carácter que estará x posiciones más adelantado
            Por ejemplo si tenemos la A y el factor de cifrado = 2 entonces el nuevo
            carácter será C. Ademas como primer elemento del resultado aparecerá este factor
            de cifrado. -> Si cifro A con factor 3 entonces de resultado me da "3D"

            2Jqnc"og"nncoq"Mck
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Escrieme un texto para descifrar:");
        String texto = sc.nextLine();
        System.out.print("El factor de descifrado es: ");
        

        char[] caracteres =texto.toCharArray();
        int factor =  Character.getNumericValue(caracteres[0]);  
        System.out.println(factor);
        int caracteresTexto = texto.length();
        int contador = 0;



        System.out.println("================================");
        while(contador < caracteresTexto-1){
            
            int cifrado = (int)(caracteres[contador+1])-factor;
            char cifradoCaracter = (char)cifrado;
            System.out.println("Caracter: "+ caracteres[contador+1] + " --- " + cifradoCaracter + "("+ (int)cifradoCaracter +")");
            contador++;
        }



        System.out.println("================================");
        
        
        
        contador = 0;
        System.out.print("\t");
        while(contador < caracteresTexto-1){
            
            int cifrado = (int)(caracteres[contador+1])-factor;
            char cifradoCaracter = (char)cifrado;

            System.out.print(cifradoCaracter);


            contador++;
        }
        System.out.println();
        System.out.println("================================");
        sc.close();
    }
}
