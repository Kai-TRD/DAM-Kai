package Programacion.Seleccion;

public class Ejemplo2Seleccion {
    public static void main(String[] args) {
        
        int numero = 13;
        int aleatorio = 0;
        
        if (numero > 6 && numero%2 == 0 )
        {
            System.out.println("HOLA - estoy dentro del IF");
            aleatorio = (int) (Math.random()*100);
            numero = numero+aleatorio;
        }
        else
        {
            System.out.println("HOLA - estoy en el ELSE");
            numero = numero-1;
        }

        System.out.println("Numero= "+ numero + " (" + aleatorio + ")" );

    }
}
