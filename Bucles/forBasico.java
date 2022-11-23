package Bucles;

public class forBasico {
    public static void main(String[] args) {
        
        /*
         * FOR(int aux=1; aux<10; aux++)
         *         |        |      |
         *         |        |       Actualizacion contador
         *         |        Mientras
         *          Inicialización contador
         * 
         * 
         */

        for(int contador = 1; contador<=5 ; contador += 2)
        {
            System.out.println("HOLA - "+contador);
        }

        System.out.println("------------------------------------------------------------");

        for(int contador = 10; contador>=0 ; contador--)
        {
            System.out.println("HOLA - "+contador);
        }

    }
    
}
