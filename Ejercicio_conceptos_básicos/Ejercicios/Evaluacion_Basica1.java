package Ejercicio_conceptos_básicos.Ejercicios;
import java.util.Scanner;


/*
    Debes implementar un programa que indique el sueldo mensual total de un empleado que traba en la empresa PCFactory S.A.

    Para calcular el sueldo hay una serie de factores que se deben de tener en cuenta:

    La primera es el sueldo base que es 950€ para todo los empleados de la empresa, por cada año de antigüedad en la empresa percibe 150€ más.


    Además existe una bonificación del 10€ del sueldo base por hijo y 100€ más si el empleado tienes 3 o más hijos

    También hay que tener en cuenta las horas extras realizadas que se pagan a 21,4€/hora las primeras 20 horas y las restantes a 30€.

    Del sueldo total calculado hay que restar 5% que se queda la empresa para formación.


    La salida debe tener este formato:


    El empleado recibirá en su nómina mensual “xxxx.xx” €

    De los cuales:

        - xxx.xx € son del sueldo base + antigüedad+ bonificación por hijo + bonificación por tener 3 o mas hijos

        - xxx.xx € son de horas extras realizadas (“xxx” horas realizadas)

        -”-xxx.xx” € para formación

*/

public class Evaluacion_Basica1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    //Declaración de constantes
        final float PAGAHORASEXTRA = 21.4f;
        final float PAGAHORAEXTRA20H = 30;
        final int SALARIOBASE = 950;
        final int DINEROPORAÑOANTIGUEDAD = 150;
        final int DINEROPORHIJO = 10;
        final int DINERO3HIJOS = 100;
        final float FORMACION = 0.05f;

    //Obtención de datos de las variables
        System.out.println("---Programa de salario---PCFactory S.A---");
        System.out.println("-----------------------------------------");

        System.out.println("Indique los años de antiguedad:");
        int antiguedad = sc.nextInt();

        System.out.println("Indica la cantidad de hijos que posee:");
        int hijos = sc.nextInt();

        System.out.println("Indique las horas extra realizadas:");
        int horasExtra = sc.nextInt();  



    //Calculo de  las variables
        int sueldoPorAntiguedad = antiguedad*DINEROPORAÑOANTIGUEDAD;
        
        float sueldoPorHijos = (hijos < 3) ? hijos*DINEROPORHIJO : hijos*DINEROPORHIJO+DINERO3HIJOS;
        
        float sueldoHorasExtra = (horasExtra > 20) ? (horasExtra*PAGAHORASEXTRA)+(horasExtra-20*PAGAHORAEXTRA20H) : horasExtra*PAGAHORASEXTRA;
        
        float nominaMensualSinHorasExtra = SALARIOBASE + sueldoPorAntiguedad + sueldoPorHijos;
        
        float nominaMensualTotal = SALARIOBASE + sueldoPorAntiguedad + sueldoPorHijos + sueldoHorasExtra;
        
        float paraFormacion = nominaMensualTotal*FORMACION;


    //Salida de las operaciones
        System.out.println("-----------------------------------------");
        
        System.out.println("El empleado recibirá en su nómina mensual de "+(nominaMensualTotal-paraFormacion)+"€");
        
        System.out.println("");
        
        System.out.println("De los cuales:");
        
        System.out.println("");
        
        System.out.println(" -"+nominaMensualSinHorasExtra+"€ son del sueldo base + antigüedad+ bonificación por hijo + bonificación por tener 3 o mas hijos");
        
        System.out.println("");
        
        System.out.println(" -"+sueldoHorasExtra+"€ son de horas extras realizadas ("+horasExtra+" horas realizadas)");
        
        System.out.println("");
        
        System.out.println(" -\""+paraFormacion+"\"€ para formación");
        
        sc.close();    
    }
}
