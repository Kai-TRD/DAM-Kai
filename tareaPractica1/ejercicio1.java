package tareaPractica1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        LocalDate fechaActual = LocalDate.now();



        System.out.println("Indica tu dia de nacimiento");
        int dia = sc.nextInt();
        
        System.out.println("Indica tu mes de nacimiento");
        int mes = sc.nextInt();
        
        System.out.println("Indica tu año de nacimiento");
        int ano = sc.nextInt();

        LocalDate cumpleanos = LocalDate.of(ano, mes, dia);


        sc.close();

        System.out.println(cumpleanos);

        System.out.println("---------------------------------------------------------------");

        System.out.println("Formato:");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yy");
        System.out.println(cumpleanos.format(formato));

        System.out.println("La edad que tienes:");
        //int anoTuyo = cumpleanos.getYear();
        //int anoActual = fechaActual.getYear();
        System.out.println(ChronoUnit.YEARS.between(cumpleanos, fechaActual));
        
        System.out.println("Los dias que quedan para cumprir otro año:");
        //LocalDate finDeAno = LocalDate.of(fechaActual.getYear(),12,30);
        //Period cumplirAnos = cumpleanos.until(finDeAno);
        //System.out.println(cumplirAnos.getDays());

        LocalDate fechaProximoCumpleanos = LocalDate.of(LocalDate.now().getYear(), mes, dia);

        //fechaProximoCumpleanos = (fechaProximoCumpleanos.isAfter(LocalDate.now())) ? fechaProximoCumpleanos : fechaProximoCumpleanos    
        System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), cumpleanos));





    }
}
