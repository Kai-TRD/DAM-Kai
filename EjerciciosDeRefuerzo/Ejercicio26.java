package EjerciciosDeRefuerzo;
import java.util.Scanner;

public class Ejercicio26 {
    

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Venta de entradas CineCampa");
    System.out.print("Número de entradas: ");
    int numeroEntradas = sc.nextInt();
    
    System.out.print("Día de la semana:");
    sc.nextLine();
    String diaSemana = sc.nextLine();
    
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    String tarjeta = sc.nextLine();



    final int PRECIOPAREJA = 11;
    final int PRECIOBASE = 8;
    final int PRECIOBASEMIERCOLES = 5;
    int parejas = 0;
    int descuento = 10;
    int entradaSuelta = 0;
    int totalPrecioPareja = 0;
    int precioSuelto = 0;
    int precioTotal = 0;
    int precioTotalDescuento = 0;
    switch (diaSemana.toLowerCase()) {
        case "miercoles":
            precioTotal = PRECIOBASEMIERCOLES * numeroEntradas;
            break;
        case "jueves":
            parejas = numeroEntradas/2; 
            entradaSuelta = numeroEntradas % 2;
            totalPrecioPareja = parejas * PRECIOPAREJA;
            precioSuelto = entradaSuelta * PRECIOBASE; 

            precioTotal = totalPrecioPareja + precioSuelto;
            break;
        default:
            precioTotal = numeroEntradas * PRECIOBASE;
            break;
    }
    switch (tarjeta) {
        case "s": 
         precioTotalDescuento = precioTotal - (precioTotal*10/100);
        break;
        case "n":
            precioTotalDescuento = precioTotal;
        break;
    }
    System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
    System.out.println("Entradas individuales "+precioTotal);
    System.out.println(descuento);
    System.out.println(precioTotalDescuento);
    sc.close();
    }
}
