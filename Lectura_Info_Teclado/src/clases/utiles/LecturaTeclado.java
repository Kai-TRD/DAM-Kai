package clases.utiles;

import java.util.Scanner;

public class LecturaTeclado {

    private static Scanner sc = new Scanner(System.in);

    public static String LeerCadena() {
        System.out.println("Escribe una cadena: ");
        return sc.nextLine();
    }

    public static Integer LeerInteger() {
        int cadena = 0;
        boolean salir = false;
        while (salir == false) {
            try {
                System.out.println("Escribe un integer: ");
                cadena = Integer.parseInt(sc.nextLine());
                salir = true;
            } catch (NumberFormatException exception) {
                System.out.println("ERROR! Valor no Integer, intentalo de nuevo");
            }
        }

        return cadena;
    }

    public static float LeerFloat() {

        sc.nextFloat();
        float cadena = 0;
        boolean salir = false;
        while (salir == false) {
            try {
                System.out.println("Escribe un Float: ");
                cadena = Float.parseFloat(sc.nextLine());
                salir = true;
            } catch (NumberFormatException exception) {
                System.out.println("ERROR! Valor no Float, intentalo de nuevo");
            }
        }

        return cadena;
    }

    public static double LeerDouble() {
        double cadena = 0;
        boolean salir = false;
        while (salir == false) {
            try {
                System.out.println("Escribe un Doublee: ");
                cadena = Double.parseDouble(sc.nextLine());
                salir = true;
            } catch (NumberFormatException exception) {
                System.out.println("ERROR! Valor no Double, intentalo de nuevo");
            }
        }

        return cadena;
    }

    public static void FinalizarLectura() {
        System.out.println("Finaliza lectura");
        sc.close();
    }

}
