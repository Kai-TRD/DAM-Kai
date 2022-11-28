import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero entero");
        int numero = sc.nextInt();

        System.out.println("Dime un numero del 0 al 9 para buscar en el numero anterior");
        int digitoBuscado = sc.nextInt();
        int alReves = 0;

        while (numero > 0)
        {
            alReves =(alReves * 10) + (numero % 10);
            numero /= 10;
        }

        String apariciones = "";
        int posicionActual = 0;

        while(numero>0)
        {
            if(alReves % 10 == digitoBuscado)
            {
                apariciones += posicionActual + ", ";
            }
            alReves /=10;
            posicionActual++;
        }
        System.out.println("El digito" + digitoBuscado + " esta en el numero: "+ numero + " en las posiciones " + posicionActual);
        System.out.println(apariciones);
        sc.close();
    }
}
