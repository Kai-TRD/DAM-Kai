package Programacion.EjerciciosDeRefuerzo;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
        //Sentencia condicional (if y switch)

        Scanner sc = new Scanner(System.in);
        System.out.println("Indicame tu dia y mes de nacimiento");
        System.out.print("Dia: ");
        int dia = sc.nextInt();
        
        System.out.print("Mes: ");
        String mes = sc.nextLine();
        sc.close();

        //1
        if ((dia >=20 || dia <=21) && (mes == "marzo" || mes == "abril")) {
            System.out.println("Eres aries");
        } else;
        //2
        if ((dia >=21 || dia <=21) && (mes == "mayo" || mes == "abril")) {
            System.out.println("Eres tauro");
        } else;
        //3
        if ((dia >= 21 || dia <=22) && (mes == "mayo" || mes == "junio")) {
            System.out.println("Eres geminis");
        } else;
        //4
        if ((dia >=22 || dia <=22) && (mes == "junio" || mes == "julio")) {
            System.out.println("Eres cancer");
        } else;
        //5
        if ((dia >=22 || dia <=23) && (mes == "julio" || mes == "agosto")) {
            System.out.println("Eres leo");
        } else;
        //6
        if ((dia >=22 || dia <=23) && (mes == "agosto" || mes == "septiembre")) {
            System.out.println("Eres virgo");
        } else;
        //7
        if ((dia >=22 || dia <=23) && (mes == "septiembre" || mes == "octubre")) {
            System.out.println("Eres libra");
        } else;
        //8
        if ((dia >=22 || dia <=23) && (mes == "octubre" || mes == "noviembre")) {
            System.out.println("Eres escorpio");
        } else;
        //9
        if ((dia >=21 || dia <=23) && (mes == "noviembre" || mes == "diciembre")) {
            System.out.println("Eres sagitario");
        } else;
        //10
        if ((dia >=20 || dia <=22) && (mes == "diciembre" || mes == "enero")) {
            System.out.println("Eres capricornio");
        } else;
        //11
        if ((dia >=19 || dia <=21) && (mes == "enero" || mes == "febrero")) {
            System.out.println("Eres acuario");
        } else;
        //12
        if ((dia >=20 || dia <=20) && (mes == "febrero" || mes == "marzo")) {
            System.out.println("Eres piscis");
        } else;






        //1.enero, 2.febrero, 3.marzo 4.abril 5.mayo 6.junio 7.julio 8.agosto 9.septiembre 10.octubre 11.noviembre 12.diciembre



    }
}
