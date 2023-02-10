package ClasesT6.Usos;

import java.util.Scanner;

import ClasesT6.Ejemplos.Producto;

public class usoGESTISIMAL {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String codigoIntroducido;
        String nombreIntroducido;
        String descripcionIntroducido;
        Double precioDeCompraIntroducido;
        Double precioDeVentaIntroducido;
        int stockIntroducido;

        Producto[] productos = new Producto[0];

        boolean salir = false;

        do {
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("LISTADO");
                    System.out.println("============================");
                    if(productos.length == 0){
                        System.out.println("No hay productos disponibles, añada algunos!");
                    } else{
                        listaProductos(productos);
                    }
                break;

                case 2:
                    System.out.println("ALTA");
                    System.out.println("============================");
                    sc.nextLine();
                    System.out.print("Introduce el codigo: ");
                    codigoIntroducido = sc.nextLine();
                    
                    System.out.print("Introduce el nombre: ");
                    nombreIntroducido = sc.nextLine();
                    
                    System.out.print("Introduce la descripción: ");
                    descripcionIntroducido = sc.nextLine();
                    
                    System.out.print("Precio de compra del producto: ");
                    precioDeCompraIntroducido = sc.nextDouble();
                    
                    System.out.print("Precio de venta del producto: ");
                    precioDeVentaIntroducido = sc.nextDouble();
                    
                    System.out.print("Cantidad de stock: ");
                    stockIntroducido = sc.nextInt();
                    
                    Producto pNuevo = new Producto (codigoIntroducido,nombreIntroducido,descripcionIntroducido,precioDeCompraIntroducido,precioDeVentaIntroducido,stockIntroducido);
                    productos = insertarProducto(productos, pNuevo);
                break;

                case 3:
                    System.out.println("BAJA");
                    System.out.println("============================");
                break;

                case 4:
                    System.out.println("MODIFICACION");
                    System.out.println("============================");
                break;

                case 5:
                    System.out.println("ENYTRADA DE MERCANCÍA");
                    System.out.println("============================");
                    System.out.println("Dime le codigo del producto");



                break;

                case 6:
                    System.out.println("SALIDA DE MERCANCÍA");
                    System.out.println("============================");
                break;

                case 7:
                    System.out.println("SALIENDO");
                    System.out.println("============================");
                    salir = true;
                break;
            }
        
        } while (!salir);
        
    }
    /**
     * Listado del producto
     * @param productos
     */
    public static void listaProductos(Producto[] productos){
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }
    }


    public static buscar(){
        
    }

    /**
     * INSERTA PRODUCTO
     * @param ProductosArray
     * @param Producto
     * @return
     */
    public static Producto[] insertarProducto(Producto[] ProductosArray, Producto Producto){
        Producto[] nuevoArray = new Producto[ProductosArray.length +1];

        for (int i = 0; i < ProductosArray.length; i++){
        
            Producto ProductoAux = ProductosArray[i];
        
            nuevoArray[i] = ProductoAux;    
        
        }
        nuevoArray[nuevoArray.length-1] = Producto;
        return nuevoArray;
    }
}
