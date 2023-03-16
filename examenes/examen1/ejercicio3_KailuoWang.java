package examenes.examen1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ejercicio3_KailuoWang {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        String cadena = "";
    
            do 
            {
                System.out.println("--MENU--");
                System.out.println("------------------------------------------");
                System.out.println("A) Añadir cadena de caracteres");
                System.out.println("B) Mostrar la cadena de caracteres");
                System.out.println("C) ");
                System.out.println("D) ");
                System.out.println("E) ");
                System.out.println("F) ");
                System.out.println("------------------------------------------");
    
                System.out.println("Indica una opción:....");
                String opcion = sc.nextLine();
    
                switch (opcion)
                {
                    case "A":
                        System.out.println("Dime la cadena: ");
                        
                        cadena = sc.nextLine();
                        
                    break;
                    case "B":
                        if (cadena.equals("")){
                            System.out.println("No has escrito nada todavia, escribe algo");
                        }
                        else
                        {
                            System.out.println("La cadena es: \"" + cadena + "\"");
                        }
                    break;
                    
                    case "C":
                        System.out.println("¿Que cadena quieres buscar?");
                        String cadenaBuscado = sc.nextLine();
                        
                        String cadenaBuscadoMinus = cadenaBuscado.toLowerCase();
                        String cadenaMinus = cadena.toLowerCase();

                        String[] cadenaCortada = cadenaMinus.split(" ");

                        int cantidadPalabras = Array.getLength(cadenaCortada);
                        int cantidadRepetido = 0;
                        
                        // while (cantidadPalabras <= 0){
                        //     if(cadenaBuscadoMinus == cadenaCortada[cantidadPalabras]){
                        //         cantidadRepetido++;
                        //     }
                        //     cantidadPalabras--;
                        // }

                        System.out.println("La cadena aparece: "+ cantidadRepetido +" veces");
                        for (int i = 0; i < cantidadPalabras; i++) {
                            if (cadenaBuscadoMinus == cadenaCortada[cantidadPalabras]){
                                System.out.println("Aparece en la posicion: " + cantidadPalabras);
                            }

                        }
                    break;

                    case "D":
                    
                    String[] palabras = cadena.split(" ");

                    int cantidadPalabras2 = Array.getLength(palabras);
                    int contador = cantidadPalabras2;
                    for (int i = 0; i < cantidadPalabras2; i++) {
                        System.out.println(contador + "-" + palabras[cantidadPalabras2] + "(" + palabras[cantidadPalabras2].length() + "letras)");
                        contador--;
                    }



                    break;
                    
                    case "E":
                    break;

                    case "F":
                        salir = true;              
                    break;
                }
    
            }  while (salir == false);
            sc.close();
    }
}
