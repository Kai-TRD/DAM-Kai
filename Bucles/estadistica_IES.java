package Bucles;

import java.util.Scanner;

public class estadistica_IES {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime las edades de los alumnos:");
        double edades = sc.nextDouble();

        double minimo = 0;
        double maximo = 0;
        double numeroAlumno = 0;
        double suma = 0;
        double totalAlumnosMayoresDeEdad = 0;
        suma = edades+suma;
        while (edades != -1){

            numeroAlumno = numeroAlumno+1;

            if(edades > maximo){
                maximo = edades;
            }
            if (edades < minimo){
                minimo = edades;
            }
            System.out.println("Edad del alumno "+(int)numeroAlumno+": "+edades);
            edades=sc.nextInt();

            //CALCULO LA SUMA
            suma = edades+suma;
            //CALCULO DE MAYOR DE EDAD
            if (edades > 17){
                totalAlumnosMayoresDeEdad = totalAlumnosMayoresDeEdad + 1;
            }
        }
        sc.close();

        System.out.println("maximo: "+(int)maximo);
        System.out.println("minimo; "+(int)minimo);
        System.out.println("La suma de las edades son: "+(int)(suma+1));
        System.out.println("La media de las edades son: "+(int)(suma / numeroAlumno+1));
        System.out.println("Total alumnos: "+(int)numeroAlumno);
        System.out.println("Total alumnos mayores de edad: "+(int)(totalAlumnosMayoresDeEdad+1));
    }
}
