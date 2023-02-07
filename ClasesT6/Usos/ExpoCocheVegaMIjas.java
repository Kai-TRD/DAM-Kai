package ClasesT6.Usos;

import java.util.Scanner;

import ClasesT6.Ejemplos.Zona;

public class ExpoCocheVegaMIjas {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Zona zVip = new Zona(25);
        Zona zCompraVenta = new Zona(200);
        Zona zSalaPrincipal = new Zona(1000);
    
        boolean salir = false;
        do {
            System.out.println("1- Mostrar numero de entradad libres");
            System.out.println("2- Vender entradas");
            System.out.println("3- Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar numero de entradas libres
                    mostrarEntradasLibres(zVip, zCompraVenta, zSalaPrincipal);
                break;
                
                case 2:
                    // Vender entradas
                    System.out.println("¿Cuantas entradas quieres?");
                    int numeroEntradas = sc.nextInt();
                    System.out.println("¿Para que zona? 1-Vip 2-CompraVenta 3-Principal ");
                    int zonaSeleccionadad = sc.nextInt();

                    switch (zonaSeleccionadad) {
                        case 1:
                            venderEntradas(zVip, numeroEntradas);
                            break;
                        case 2:
                            venderEntradas(zCompraVenta, numeroEntradas);
                            break;
                        case 3:
                            venderEntradas(zSalaPrincipal, numeroEntradas);
                            break;
                    
                        default:
                        System.out.println("Opcion zona no valida");
                            break;
                    }
                break;
                
                case 3:
                    // Salir
                    salir = true;
                    break;
            
                default:
                System.out.println("Opcion no valida! seleccione otra opcion");
                    break;
            }


        } while (!salir);
    
    
    }

    /**
     * Muestra las entradas que quedan
     * @param zVip
     * @param zCompraVenta
     * @param zSalaPrincipal
     */
    static void mostrarEntradasLibres(Zona zVip, Zona zCompraVenta, Zona zSalaPrincipal ){
        System.out.println("----------ENTRADAS LIBRES----------");
        System.out.println( " - Quedan " + zVip.getEntradasPorVender() + " entradas en la zona Vip");
        System.out.println( " - Quedan " + zCompraVenta.getEntradasPorVender() + " entradas en la zona Compra venta");
        System.out.println( " - Quedan " + zSalaPrincipal.getEntradasPorVender() + " entradas en la Sala principal");
    
    }

    /**
     * Llama a vender las entradas
     * @param zona
     * @param numeroEntradas
     */
    static void venderEntradas(Zona zona, int numeroEntradas){
        zona.vender(numeroEntradas);
    }
}
