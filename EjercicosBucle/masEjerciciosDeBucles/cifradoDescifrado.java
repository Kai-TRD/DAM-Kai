package masEjerciciosDeBucles;

import java.util.Scanner;

public class cifradoDescifrado {
    public static void main(String[] args) {
        /*
            Modifica el programa anterior para que aparezca un menú donde podremos elegir cifrar, descifrar y salir.
        */
        Scanner sc = new Scanner(System.in);
        int opciones = 0;
        String enter = "";
        do {
            
        
            System.out.println("===============================");
            System.out.println("  Eligue una de las opciones:");
            System.out.println("  ---------------------------");
            System.out.println("   1 - Cifrar");
            System.out.println("   2 - Descifrar");
            System.out.println("   3 - Salir");
            System.out.println("===============================");
            opciones = sc.nextInt();

            switch (opciones){
            
                case 1:
                    sc.nextLine();
                    System.out.println("Escrieme un texto para cifrar:");
                    String texto = sc.nextLine();
                    System.out.println("Dime el factor para cifrar(int):");
                    int factor = sc.nextInt();
                    int caracteresTexto = texto.length();
                    int contador = 0;
                    System.out.println("================================");

                    char[] caracteres =texto.toCharArray();

                    System.out.print("\t"+factor);
                    while(contador < caracteresTexto){
                        
                        int cifrado = (int)(caracteres[contador])+factor;
                        char cifradoCaracter = (char)cifrado;
                        System.out.print(cifradoCaracter);
                        contador++;
                    }
                    System.out.println();
                    System.out.println("================================");
                    enter = sc.nextLine();
                break;

                case 2:
                System.out.println("Escrieme un texto para descifrar:");
                sc.nextLine();
                texto = sc.nextLine();
                System.out.print("El factor de descifrado es: ");
            

                char[] caracteresdes =texto.toCharArray();
                factor =  Character.getNumericValue(caracteresdes[0]);  
                System.out.println(factor);
                caracteresTexto = texto.length();
                contador = 0;



                System.out.println("================================");
                while(contador < caracteresTexto-1){
                    
                    
                    int cifrado = (int)(caracteresdes[contador+1])-factor;
                    char cifradoCaracter = (char)cifrado;
                    System.out.println("Caracter: "+ caracteresdes[contador+1] + " --- " + cifradoCaracter + "("+ (int)cifradoCaracter +")");
                    contador++;
                }
                System.out.println("================================");
            
            
            
                contador = 0;
                System.out.print("\t");
                while(contador < caracteresTexto-1){
                    
                    int cifrado = (int)(caracteresdes[contador+1])-factor;
                    char cifradoCaracter = (char)cifrado;

                    System.out.print(cifradoCaracter);


                    contador++;
                }
                System.out.println();
                System.out.println("================================");
            }
            enter = sc.nextLine();
        }while (opciones != 3);
        enter = "";
        System.out.println(enter);
        sc.close();
    }
}

