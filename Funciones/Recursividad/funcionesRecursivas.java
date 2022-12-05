package Recursividad;

public class funcionesRecursivas {
        
        
    /**
     * suma
     * @param numero
     * @return
     */
        static int suma(int numero){
            int resultado = numero;

            if (numero == 1){
                return resultado;
            } else 
            {
                return numero + (suma(numero-1));
            }
        }



    /**
     * factorial
     * @param numero
     * @return
     */
        static int factorial(int numero){
            int resultado = numero;

            if (numero == 1){
                return resultado;
            } else 
            {
                return numero * (factorial(numero-1));
            }
        }



    /**
     * piramide
     * @param numero
     * @return
     */
        static int piramide(int numero){
            int resultado = numero;

            if (numero == 1){
                System.out.println("*");
                return resultado;
            } else 
            {

                for (int i = 0; i < numero; i++) {
                    System.out.print("*");
                }
                System.out.println();
                return numero + (piramide(numero-1));
            }
        }



}
