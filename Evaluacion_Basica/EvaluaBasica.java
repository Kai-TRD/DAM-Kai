package Evaluacion_Basica;
import java.util.Scanner;

public class EvaluaBasica {
    public static void main(String[] args) {
        //Declaracion de constantes
        final float SUELDO_BASE = 950F;
        final float INCREMENTO_ANO_ANTIGUEDAD = 150F;
        final float INCREMENTO_HIJO = 10f;
        final float INCREMENTO_FAMILIA_NUMEROSA = 100f;
        final float HORA_EXTRA_NORMAL = 24.4f;
        final float HORA_EXTRA_EXTRA = 30f;
        final float DESCUENTO_FORMACION = 0.05f;

        //Lectura de informacion

        Scanner sc = new Scanner(System.in);
        System.out.println("Años de antiguedad?");
        int antiguedad = sc.nextInt();

        System.out.println("Numero de hijos?");
        int numHijos = sc.nextInt();

        System.out.println("Numero de horas extra?");
        int horasExtra = sc.nextInt();

        sc.close();

        //Realiza los calculos
        float nominaTotal = SUELDO_BASE;
        //Incremento por antiguedad
        float incrementoAntiguedad = antiguedad*INCREMENTO_ANO_ANTIGUEDAD;
        
        nominaTotal = nominaTotal+incrementoAntiguedad;

        //Incremento por hijo
        float incremendoPorHijo = numHijos*INCREMENTO_HIJO;
        float incrementoFamiliaNumerosa = (numHijos >= 3) ? INCREMENTO_FAMILIA_NUMEROSA : 0;

        nominaTotal= nominaTotal+incremendoPorHijo+incrementoFamiliaNumerosa;

        //Calculo precio Horas Extra
        float horasExtraNormales = (horasExtra > 20) ?
                    (20 * HORA_EXTRA_NORMAL) + (horasExtra -20) * HORA_EXTRA_EXTRA : (horasExtra * HORA_EXTRA_NORMAL);
        nominaTotal = nominaTotal + horasExtraNormales;

        //Parte de Formacion
        float formacion = nominaTotal * DESCUENTO_FORMACION;

        nominaTotal = nominaTotal - formacion;

        //Salida por pantalla

    }
}
