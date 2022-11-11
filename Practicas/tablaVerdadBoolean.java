package Programacion.Practicas;
public class tablaVerdadBoolean {
    public static void main(String[] args) {
        boolean varVerdadera = true;
        boolean varFalsa = false;
        
        
        System.out.println("Tabla de AND");
        System.out.println("============");

        System.out.println(varVerdadera + " AND " + varVerdadera + " = " + (varVerdadera && varVerdadera));
       
        System.out.println(varVerdadera + " AND " + varFalsa + " = " + (varVerdadera && varFalsa));
       
        System.out.println(varFalsa + " AND " + varVerdadera + " = " + (varFalsa && varVerdadera));
       
        System.out.println(varFalsa + " AND " + varFalsa + " = " + (varFalsa && varFalsa));

        
        
        System.out.println();

        System.out.println("Tabla de OR");
        System.out.println("============");

        System.out.println(varVerdadera + " OR " + varVerdadera + " = " + (varVerdadera || varVerdadera));
       
        System.out.println(varVerdadera + " OR " + varFalsa + " = " + (varVerdadera || varFalsa));
       
        System.out.println(varFalsa + " OR " + varVerdadera + " = " + (varFalsa || varVerdadera));
       
        System.out.println(varFalsa + " OR " + varFalsa + " = " + (varFalsa || varFalsa));


    }
}
