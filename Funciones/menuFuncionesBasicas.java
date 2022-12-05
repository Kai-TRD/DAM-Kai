import java.util.Scanner;

public class menuFuncionesBasicas {

    /**
     * 
     * 
     */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       long numero = 0;
       long cantidad = 0;
        String enter = "";

        boolean salir = false;
        do
        {
            System.out.println("=================================");
            System.out.println("\t  --FUNCIONES--");
            System.out.println("---------------------------------");
            System.out.println("1-Es Capicua");
            System.out.println("2-");
            System.out.println("3-");
            System.out.println("4-");
            System.out.println("5-Cuenta Digitos");
            System.out.println("6-");
            System.out.println("7-");
            System.out.println("8-");
            System.out.println("9-Quitar por detras");
            System.out.println("10-Quitar por delante");
            System.out.println("11-Pegar un numero por atras");
            System.out.println("12-Pegar un numero por delante");
            System.out.println("13-");
            System.out.println("14-Juntar dos numeros");
            System.out.println("16-Muestra los números capicua que hay entre 1 y 99999");
            System.out.println("17-Decimal a binario");
            System.out.println("=================================");
        

            int opcion = sc.nextInt();
            System.out.print("\033[H\033[2J");
            
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
                   long numeroDigitos = MathKai.numeroDigitos(numero);
                    
                    System.out.println("EL numero tiene " + numeroDigitos + " digitos");
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
                    System.out.print("Dime los digitos que quitar atras: ");
                    cantidad = sc.nextInt();
                   long quitaPorDetras = MathKai.quitaPorDetras(numero, cantidad);
                    
                    System.out.println("EL numero es: " + quitaPorDetras);
                break;
                
                case 10:
                    System.out.print("Dime un numero: ");
                    numero = sc.nextInt();
                    System.out.print("Dime los digitos que quitar delante: ");
                    cantidad = sc.nextInt();
                   long quitarPorDelante = MathKai.quitarPorDelante(numero, cantidad);
                    
                    System.out.println("EL numero es: " + quitarPorDelante);
                break;

                case 11:
                    System.out.print("Dime un numero: ");
                    numero = sc.nextInt();
                    System.out.print("Dime los digitos que pegar detras: ");
                    cantidad = sc.nextInt();
                   long pegarPorDetras = MathKai.pegarPorDetras(numero, cantidad);
                    
                    System.out.println("EL numero es: " + pegarPorDetras);
                break;

                case 12:
                    System.out.print("Dime un numero: ");
                    numero = sc.nextInt();
                    System.out.print("Dime los digitos que pegar delante: ");
                    cantidad = sc.nextInt();
                   long pegarPorDelante = MathKai.pegarPorDelante(numero, cantidad);
                    
                    System.out.println("EL numero es: " + pegarPorDelante);

                break;

                case 13:

                break;

                case 14:
                    System.out.print("Dime un numero: ");
                    numero = sc.nextInt();
                    System.out.print("Dime numero para juntar: ");
                    cantidad = sc.nextInt();
                   long juntaDosNumeros = MathKai.juntaDosNumeros(numero, cantidad);
                    
                    System.out.println("EL numero es: " + juntaDosNumeros);
                break;

                case 15:
                break;

                case 16:
                    System.out.println("Los numeros capicua que hay entre en 1 y el 99999 son: ");
                    numero = 1;
                    
                    while(numero < 100000){
                        esCapicua = MathKai.esCapicua(numero);
                        if(esCapicua){
                            System.out.println(numero);
                        }
                        numero++;
                    }
                break;

                case 17:
                    System.out.print("Dime un numero: ");
                    numero = sc.nextInt();
                    System.out.println("EL numero es: ");

                    long numeroBinario = MathKai.decimalBinario(numero);
                    
                    numero = numeroBinario;
                    
                    long invertirdoNumero = MathKai.invertirNumero (numero);
                    
                    System.out.println(invertirdoNumero);
                break;

                default:
                    System.out.println("Opcionlongroducido Invalido");
                break;
            }
            System.out.println("introduce Enter...");
            sc.nextLine();
            enter = sc.nextLine();
            System.out.print("\033[H\033[2J");
        }while(salir != true);
        enter = "";
        System.out.println(enter);
        sc.close();
    }    
}
