import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 4;
        do {
            System.out.println("Escribe los 4 diguitos de la contraseña");
            int contrasena = sc.nextInt();
                if(contrasena == 1234)
                {
                    System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                    intentos = 0;
                } else 
                {
                    System.out.println("Lo siento, esta no es la combinacion");
                }
            intentos--;
        } while (intentos >= 1);
        if(intentos == 0){System.out.println("Llamaremos a la policia");}        
    sc.close();
    }
}
