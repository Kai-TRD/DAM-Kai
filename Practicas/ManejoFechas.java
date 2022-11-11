package Programacion.Practicas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ManejoFechas {
    public static void main(String[] args) {
        
        //Fecha y hora actual
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now()); 


        System.out.println(LocalDateTime.now());


        //Formatea una fecha
        DateTimeFormatter miFormatoDeFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm");

        LocalDateTime fechaActual = LocalDateTime.now();

        System.out.println(fechaActual.format(miFormatoDeFecha));



        //crear fechas y horas
        LocalTime miHora = LocalTime.of(15, 45);
        System.out.println(miHora);

        LocalDate miFecha = LocalDate.of(2024, 2, 29);
        System.out.println(miFecha);
    
        LocalDateTime miFechaHora = LocalDateTime.of(miFecha, miHora); 
        System.out.println(miFechaHora);

        //Modificar una fecha

        miHora = miHora.withHour(23);
        miHora = miHora.withMinute(21);
        System.out.println(miHora);
        
        miFecha = miFecha.withMonth(5);
        miFecha = miFecha.withYear(2023);
        miFecha = miFecha.withDayOfMonth(10);

        System.out.println(miFecha);

        //sumar o restar un dia/mes/año

        LocalDate diaSiguiente = miFecha.plusDays(1);
        System.out.println(diaSiguiente);
       
        LocalDate diaAnterior = miFecha.minusDays(1);
        System.out.println(diaAnterior);



        //Tiempo transcurrido
        LocalDate finDeAno = LocalDate.of(2020, 12, 31);
        Period deHoyAFinDeAno = Period.between(LocalDate.now(), finDeAno);

        int numeroDias = deHoyAFinDeAno.getDays();

        System.out.println("Quedan para fin de año " + numeroDias + "días");




        //Pide al usuario que introduzca su fecha de nacimiento
        //muestrala en formato dd-MM-YY
        //Muetra la edad que tienes
        //Indica cuantos dias quedan para cumprir otro año

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el dia de tu nacimiento");
        int dia = sc.nextInt();

        System.out.println("Dime el mes de tu nacimiento");
        int mes = sc.nextInt();

        System.out.println("Dime el año de tu nacimiento");
        int ano = sc.nextInt();

        
        LocalDate miCumpleanos = LocalDate.of(2024, 2, 29);
        System.out.println(miFecha);
    
        LocalDateTime miFormatoCumplenos = LocalDateTime.of(miFecha, miHora); 
        System.out.println(miFormatoCumplenos);
        
    }
}
