package Practicas;

public class ejemploBooleano {
    public static void main(String[] args) {
        
        boolean operador1 = true;
        
        boolean operador2 = true;

        boolean resultado = operador1 && operador2;

        //operador1 && operador2

        System.out.println("El resulltado de " + operador1 + " AND " + operador2 + "= " + resultado);

        //operador1 || (operador1 && operador2)

        resultado = operador1 || (operador1 && operador2);

        System.out.println("El resulltado de operador1 || operador1 && operador2 = " + resultado );
    }
}
