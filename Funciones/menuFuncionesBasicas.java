import java.util.Scanner;

public class menuFuncionesBasicas {

    /**
     * 
     * 
     */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        do
        {
            System.out.println("--FUNCIONES--");
            System.out.println("a-Es Capicua");
            System.out.println("b-Es Primo");

            String opcion = sc.nextLine();

            switch(opcion)
            {
                case "a":
                    System.out.print("Dime un numero: ");
                    int numero = sc.nextInt();
                    boolean esCapicua = MathKai.esCapicua(numero);
                    if (esCapicua)
                    {
                        System.out.println("El numero SI es Capicual");
                    } else 
                    {
                        System.out.println("El numero NO es Capicua");
                    }

                    System.out.println("introduce Enter...");
                    sc.nextLine();
                    String enter = sc.nextLine();
                break;
                case "b":
                break;
                case "c":
                break;
            }
            
        }while(salir != true);


    }    
}
