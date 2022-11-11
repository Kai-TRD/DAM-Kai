package Programacion.tareaPractica1;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Tarea1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia de tu nacimiento");
        int dia = sc.nextInt();

        System.out.println("Introduce el mes de tu nacimiento");
        int mes = sc.nextInt();
        
        System.out.println("Introduce el año de tu nacimiento");
        int ano = sc.nextInt();
        
        sc.close();
                
        System.out.println("------------------------------------------------------------");
        LocalDate miCumpleanos = LocalDate.of(ano, mes, dia);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yy");
        System.out.println("Tu fecha de cumpleaños es: "+miCumpleanos.format(formato));
        System.out.println("------------------------------------------------------------");        
        Period edad = Period.between(miCumpleanos, LocalDate.now());
        int anoTranscurrido = edad.getYears();
        System.out.println("Tu edad actual es: " + anoTranscurrido);
        System.out.println("------------------------------------------------------------");


        int diasQueQuedan = edad.getDays();

        System.out.println("Quedan " + diasQueQuedan + " dias para cumprir otro año");


    }
}
