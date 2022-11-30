import java.util.Scanner;

public class menuFuncionesBasicas {

    /**
     * 
     * 
     */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        String enter = "";

        boolean salir = false;
        do
        {
            System.out.println("--FUNCIONES--");
            System.out.println("1-Es Capicua");
            System.out.println("2-Es Primo");
            System.out.println("3-Siguiente Primo");
            System.out.println("4-");
            System.out.println("5-Cuenta Digitos");
            System.out.println("6-");

            int opcion = sc.nextInt();

            switch(opcion)
            {
                case 1:
                    System.out.print("Dime un numero: ");
                    numero = sc.nextInt();
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
                    enter = sc.nextLine();
                    System.out.print("\033[H\033[2J");
                break;
                
                case 2:
                break;

                case 3:
                break;
                
                case 4:
                break;
                
                case 5:
                    System.out.print("Dime un numero: ");
                    numero = sc.nextInt();
                    int numeroDigitos = MathKai.numeroDigitos(numero);
                    
                    System.out.println("EL numero tiene " + numeroDigitos);
                    System.out.println("introduce Enter...");
                    sc.nextLine();
                    enter = sc.nextLine();
                    System.out.print("\033[H\033[2J");
                break;
                
                case 6:
                break;
                
                case 7:
                break;
                
                case 8:
                break;
                
                case 9:
                    System.out.print("Dime un numero: ");
                    numero = sc.nextInt();
                    System.out.print("Dime los digitos que quitar: ");
                    int cantidad = sc.nextInt();
                    int quitaPorDetras = MathKai.quitaPorDetras(numero, cantidad);
                    
                    System.out.println("EL numero tiene " + quitaPorDetras);
                    System.out.println("introduce Enter...");
                    sc.nextLine();
                    enter = sc.nextLine();
                    System.out.print("\033[H\033[2J");
                break;
            }
            
        }while(salir != true);
        enter = "";
        System.out.println(enter);
        sc.close();
    }    
}
