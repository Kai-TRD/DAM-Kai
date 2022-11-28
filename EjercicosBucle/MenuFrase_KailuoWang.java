import java.util.Scanner;
public class MenuFrase_KailuoWang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcion = "";
        boolean salir = false;
        String frase = "";
        String enter = "";
        String posicion = "";
        int cantidadCaracter = 0;
        do{
            System.out.println("Opcion a - Añadir a la frase (añadiendo a la frase ya existente)");
            System.out.println("Opcion b - Indicar la ultima frase introducida");
            System.out.println("Opcion c - Indicar el número de palabras que tiene la frase");
            System.out.println("Opcion d - Indicar cuantas veces a aparece un carácter en la frase");
            System.out.println("Opcion e - Limpiar frase");
            System.out.println("Opcion s - Salir");
            System.out.print("Indique la opción que quiere realizar: ");
            opcion = sc.nextLine();
            switch (opcion)
            {
                case "a":
                    System.out.println("Introducir a la frase:");
                    String introducirFrase = sc.nextLine();
                    frase = frase + " " + introducirFrase;

                    break;

                case "b":
                    System.out.println("La frase actualmente es: \""+frase+"\"");

                    break;

                case "c":
                    System.out.println("La frase actual contiene: " + ((frase.split(" ").length)-1)+ " palabra/s"); 

                    break;

                case "d":
                        System.out.print("¿que caracter deseas contar? ");
                        String caracter = sc.nextLine();

                            String caracterMinus = caracter.toLowerCase();
                            String fraseMinus = frase.toLowerCase(); 

                        for (int i = 0; i < fraseMinus.length() ; i++)
                        {   
                            if(fraseMinus.charAt(i) == caracterMinus.charAt(0) )
                            {
                                cantidadCaracter ++;
                                posicion = posicion + i + ",";
                            }
                        }
                System.out.println("Se repiten "+cantidadCaracter+ " veces");
                    System.out.println("Estando en las posiciones: "+posicion);
                
                    cantidadCaracter = 0;
                    posicion = "";

                    break;

                case "e":
                    frase = "";
                    System.out.println("Se ha limpiado la frase");

                    break;

                case "s": 
                    salir = true;
                    System.out.println("Hasta la proxima");
                    break;
                }
                System.out.print("Pulse la tecla ENTER para continuar....");
                enter = sc.nextLine(); enter = "";

        } while (salir == false);
        sc.close();
        System.out.println(enter);

    }
}
