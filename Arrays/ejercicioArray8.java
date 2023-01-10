package Arrays;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ejercicioArray8 {
    public static void main(String[] args) {
        
        //enero
        //febrero
        //marzo
        //abril
        //mayo
        //junio
        //julio
        //agosto
        //septiembre
        //octubre
        //noviembre
        //diciembre

        String[] mes = { "Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};

        int[] temperatura = new int[12];
        

        int año = (int)(Math.random()*100);
        System.out.println("Dime la temperatura que hace en cada mes del año 20 " + año +":");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mes.length; i++) {
            System.out.println("Dime la temperatura media de "+ mes[i] + ":");
            // int temp = sc.nextInt();

            int temp = (int)(Math.random()*31);

            temperatura[i] = temp;
        }

        System.out.println("Grafica");
        for (int i = 0; i < 107; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < mes.length; i++) {

            System.out.print(mes[i] + " | ");
            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print("█");
            }
            
            System.out.println(temperatura[i] + "ºC");
        }


    }
}
