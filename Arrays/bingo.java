package Arrays;

import java.lang.reflect.Array;

import javax.xml.catalog.Catalog;

import masEjerciciosDeBucles.cifrado;

import java.util.Arrays
;

public class bingo {
    public static void main(String[] args) {
        
        //Creo las columnas
        String[] colum1= new String[3];
        String[] colum2= new String[3];
        String[] colum3= new String[3];
        String[] colum4= new String[3];
        String[] colum5= new String[3];
        String[] colum6= new String[3];
        String[] colum7= new String[3];
        String[] colum8= new String[3];
        String[] colum9= new String[3];

        randomColumna(colum1, colum2, colum3, colum4, colum5, colum6, colum7, colum8, colum9);
        // imprimir(colum1, colum2, colum3, colum4, colum5, colum6, colum7, colum8, colum9);
        carton(colum1, colum2, colum3, colum4, colum5, colum6, colum7, colum8, colum9);

    }




    static void randomColumna(String[] colum1, String[] colum2, String[] colum3, String[] colum4, String[] colum5, String[] colum6, String[] colum7, String[] colum8, String[] colum9){
        
        int contador = 1;
        int suma = 0;
        for (int i = 0; i < 9; i++) {
            String[] columnaActual = colum1;
            switch (contador) {
                case 1:
                    columnaActual = colum1;
                    suma = 0;
                    break;
                case 2:
                    columnaActual = colum2;
                    suma = 10;
                    break;
                case 3:
                    columnaActual = colum3;
                    suma = 20;
                    break;
                case 4:
                    columnaActual = colum4;
                    suma = 30;
                    break;
                case 5:
                    columnaActual = colum5;
                    suma = 40;
                    break;
                case 6:
                    columnaActual = colum6;
                    suma = 50;
                    break;
                case 7:
                    columnaActual = colum7;
                    suma = 60;
                    break;
                case 8:
                    columnaActual = colum8;
                    suma = 70;
                    break;
                case 9:
                    columnaActual = colum9;
                    suma = 80;
                    break;
            }
        
            for (int j = 0; j < 3; j++) {
                int valorRandom = (int)((Math.random()*10)+suma);
                 
                columnaActual[j] = String.valueOf(valorRandom);
            }
            contador++;
        }
    }

    // static void imprimir(String[] colum1, String[] colum2, String[] colum3, String[] colum4, String[] colum5, String[] colum6, String[] colum7, String[] colum8, String[] colum9){
        
    //     String[] columnaActual = colum1;
    //     int contador = 1;

    //     for (int i = 0; i < 9; i++) {
    //         switch (contador) {
    //             case 1:
    //                 columnaActual = colum1;
    //                 break;
    //             case 2:
    //                 columnaActual = colum2;
    //                 break;
    //             case 3:
    //                 columnaActual = colum3;
    //                 break;
    //             case 4:
    //                 columnaActual = colum4;
    //                 break;
    //             case 5:
    //                 columnaActual = colum5;
    //                 break;
    //             case 6:
    //                 columnaActual = colum6;
    //                 break;
    //             case 7:
    //                 columnaActual = colum7;
    //                 break;
    //             case 8:
    //                 columnaActual = colum8;
    //                 break;
    //             case 9:
    //                 columnaActual = colum9;
    //                 break;
    //         }
    //         for (int j = 0; j < 3; j++) {
    //             System.out.print(columnaActual[j]+" - ");    
    //         }
    //         System.out.println();
    //         contador++;
    //     }
    // }

    static void carton(String[] colum1, String[] colum2, String[] colum3, String[] colum4, String[] colum5, String[] colum6, String[] colum7, String[] colum8, String[] colum9){

        Arrays.sort(colum1);
        Arrays.sort(colum2);
        Arrays.sort(colum3);
        Arrays.sort(colum4);
        Arrays.sort(colum5);
        Arrays.sort(colum6);
        Arrays.sort(colum7);
        Arrays.sort(colum8);
        Arrays.sort(colum9);

        int contador = 1;
        int suma = 0;
        for (int e = 0; e < 9; e++) {
            String[] columnaActual = colum1;
            switch (contador) {
                case 1:
                    columnaActual = colum1;
                    suma = 0;
                    break;
                case 2:
                    columnaActual = colum2;
                    suma = 10;
                    break;
                case 3:
                    columnaActual = colum3;
                    suma = 20;
                    break;
                case 4:
                    columnaActual = colum4;
                    suma = 30;
                    break;
                case 5:
                    columnaActual = colum5;
                    suma = 40;
                    break;
                case 6:
                    columnaActual = colum6;
                    suma = 50;
                    break;
                case 7:
                    columnaActual = colum7;
                    suma = 60;
                    break;
                case 8:
                    columnaActual = colum8;
                    suma = 70;
                    break;
                case 9:
                    columnaActual = colum9;
                    suma = 80;
                    break;
            }
            for (int i = 0; i < 2; i++) {
                int valorRandom = (int)(Math.random()*3);
                 
                columnaActual[valorRandom] = "-1";
            }
            
            contador++;

        }

        String[] fila1 = {colum1[0], colum2[0], colum3[0], colum4[0], colum5[0], colum6[0], colum7[0], colum8[0], colum9[0]};
        String[] fila2 = {colum1[1], colum2[1], colum3[1], colum4[1], colum5[1], colum6[1], colum7[1], colum8[1], colum9[1]};
        String[] fila3 = {colum1[2], colum2[2], colum3[2], colum4[2], colum5[2], colum6[2], colum7[2], colum8[2], colum9[2]};       

        for (int i = 0; i < fila1.length; i++) {
            System.out.print(fila1[i]+"\t");
        }
        System.out.println();
        
        for (int i = 0; i < fila2.length; i++) {
            System.out.print(fila2[i]+"\t");
        }
        System.out.println();
        
        for (int i = 0; i < fila3.length; i++) {
            System.out.print(fila3[i]+"\t");
        }
        System.out.println();

    }
}
