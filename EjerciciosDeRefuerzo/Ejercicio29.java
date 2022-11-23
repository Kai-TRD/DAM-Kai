package EjerciciosDeRefuerzo;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        //precio de la comida
        double precioComida = 0;
        double precioBebida = 0;
        String tipo = "";
        final double precioPalmera = 1.40;
        final double precioDonut = 1.00;
        final double precioPitufoConAceite = 1.20;
        final double precioPitufoConTortilla = 1.60;


        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        String comida = sc.nextLine();

        //calcula precio comida
        switch (comida) {
            case "palmera": precioComida = precioPalmera; break;
            case "donut": precioComida = precioDonut;
        }

        if (comida.equals("pitufo")){
            System.out.print("Que tipo(aceite o tortilla):");
            String tipoPitufo = sc.nextLine();
            if(tipoPitufo.equals("aceite")){
                precioComida = precioPitufoConAceite;
                tipo = "aceite";
            }else
            if(tipoPitufo.equals("tortilla")){
                precioComida = precioPitufoConTortilla;
                tipo = "tortilla";
            }
        }

        sc.close();

        System.out.println("¿Qué ha tomado de beber? (zumo o cafe): ");
        String bebida = sc.nextLine();
   
        //precio bebida
        final double precioZumo = 1.50;
        final double precioCafe = 1.20;

        if (bebida.equals("zumo")){
            precioBebida = precioZumo;
        } else
        if (bebida.equals("cafe")){
            precioBebida = precioCafe;
        }
   
        System.out.println("==================================");

        System.out.println(comida+" de "+tipo+": "+precioComida+"€");
        System.out.println(bebida+": "+precioBebida+"€");
        double total = precioComida+precioBebida;
        System.out.println("Total desayuno: "+total+"€");

    }
}
