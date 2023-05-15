package examenes.examenT9recuperacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import examenes.examenT9recuperacion.clases.Carta;
import examenes.examenT9recuperacion.clases.Producto;
import examenes.examenT9recuperacion.clases.Restaurante;
import examenes.examenT9recuperacion.clases.Producto.TipoProducto;
import examenes.examenT9recuperacion.metodos.MiLista;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Restaurante!");

        Restaurante restaurante = new Restaurante();

        //Mostrar la carta del restaurante
        System.out.println(" ######  CARTA DEL RESTAURANTE  ######");
        Carta cartaRestaurante = restaurante.getCarta();

        Producto especialidadDelDia = new Producto("Especialidad del Dia", TipoProducto.CAMPERO, new HashSet<String>(), 5);
        cartaRestaurante.addNuevoProducto(especialidadDelDia);

        cartaRestaurante.deleteProducto(108);
        System.out.println(cartaRestaurante.getProductos().stringElementos());


        //Productos con atun
        System.out.println(" ######  PRODUCTOS CON ATUN Y POLLO  ######");
        List<String> listaIngredientes = new ArrayList<>();
        listaIngredientes.add("atun");
        listaIngredientes.add("pollo");
        Set<Producto> productosEncontrados = cartaRestaurante.productosConIngrediente(listaIngredientes);
        System.out.println(productosEncontrados.toString());


        System.out.println(" ######  PRODUCTOS DEL TIPO BOCADILLO  ######");
        List<Producto> bocatas =cartaRestaurante.productosPorTipo(TipoProducto.BOCATA);
        MiLista<Producto> miListaProductos = new MiLista<>();
        miListaProductos.addAll(bocatas);
        System.out.println(miListaProductos.stringElementos());

        //Mesa 2 hace pedido
        restaurante.addProducto(2, cartaRestaurante.getProducto(101));
        restaurante.addProducto(2, cartaRestaurante.getProducto(106));
        restaurante.addProducto(2, cartaRestaurante.getProducto(112));
        restaurante.addProducto(2, cartaRestaurante.getProducto(112));

        restaurante.deleteProducto(2, cartaRestaurante.getProducto(112));
        restaurante.addProducto(2, cartaRestaurante.getProducto(111));

        //Mesa 7 hace pedido
        restaurante.addProducto(7, cartaRestaurante.getProducto(110));
        restaurante.addProducto(7, cartaRestaurante.getProducto(108));
        restaurante.addProducto(7, cartaRestaurante.getProducto(50));
        restaurante.addProducto(7, cartaRestaurante.getProducto(113));
        restaurante.addProducto(7, cartaRestaurante.getProducto(100));
        
        //Muestro la mesa 7
        System.out.println(" ######  COMANDA DE LA MESA 7  ######");
        System.out.println(restaurante.mostrarComanda(7));

        System.out.println(" ######  COMANDA DE LA MESA 7: Ordenado por CÓDIGO  ######");
        System.out.println(restaurante.productosMesaOrdenadosPorCodigo(7));

        //Muestro la mesa 2
        System.out.println(" ######  COMANDA DE LA MESA 2  ######");
        System.out.println(restaurante.mostrarComanda(2));

        System.out.println(" ######  COMANDA DE LA MESA 2: Ordenado alfabeticamente  ######");
        System.out.println(restaurante.productosMesaOrdenadosPorNombre(2));

        System.out.println(" ######  TOTAL A PAGAR DE LA MESA 2  ######");
        System.out.println(restaurante.obtenerFacturaMesa(2) + "€");

        System.out.println(" ######  TOTAL A PAGAR DE LA MESA 7  ######");
        System.out.println(restaurante.obtenerFacturaMesa(7) + "€");

        System.out.println(" ######  TOTAL A PAGAR DE LA MESA 1  ######");
        System.out.println(restaurante.obtenerFacturaMesa(1) + "€");

      
    }
}

/*
Hello, Restaurante!
 ######  CARTA DEL RESTAURANTE  ######
Codigo=100, nombre='Bocadillo de jamón y queso', tipo=BOCATA, ingredientes=[jamón, queso, pan], precio=2.5
Codigo=101, nombre='Bocadillo de pollo', tipo=BOCATA, ingredientes=[queso, pan, pollo], precio=3.5
Codigo=102, nombre='Bocadillo Serranito', tipo=BOCATA, ingredientes=[jamón serrano, cerdo, mayonesa, pan], precio=5.5
Codigo=103, nombre='Sándwich mixto', tipo=SANDWICH, ingredientes=[tomate, pan de molde, queso fundido, jamón cocido, lechuga], precio=3.0
Codigo=104, nombre='Sándwich pollo', tipo=SANDWICH, ingredientes=[tomate, pan de molde, queso fundido, pollo, lechuga], precio=4.0
Codigo=105, nombre='Sándwich atun', tipo=SANDWICH, ingredientes=[atun, tomate, pan de molde, mayonesa, queso fundido, lechuga], precio=3.5
Codigo=106, nombre='Pizza cuatro quesos', tipo=PIZZA, ingredientes=[champiñones, masa, queso rallado, tomate frito, jamón york], precio=8.0
Codigo=107, nombre='Pizza CAPRICHOSA', tipo=PIZZA, ingredientes=[champiñones, masa, anchoas, queso rallado, tomate frito], precio=10.0
Codigo=109, nombre='Campero completo', tipo=CAMPERO, ingredientes=[tomate, pan de hamburguesa, cebolla, carne de vacuno, lechuga], precio=4.5
Codigo=110, nombre='Agua mineral', tipo=BEBIDA, ingredientes=[agua], precio=1.0
Codigo=111, nombre='Cerveca', tipo=BEBIDA, ingredientes=[cervaza], precio=2.0
Codigo=112, nombre='refreco', tipo=BEBIDA, ingredientes=[refresco], precio=2.5
Codigo=113, nombre='Sundae de vainilla con sirope de chocolate', tipo=POSTRE, ingredientes=[sirope de chocolate, helado de vainilla], precio=2.5
Codigo=114, nombre='Cafe', tipo=POSTRE, ingredientes=[], precio=2.5
Codigo=115, nombre='Arroz con lecha', tipo=POSTRE, ingredientes=[], precio=3.0
Codigo=116, nombre='Especialidad del Dia', tipo=CAMPERO, ingredientes=[], precio=5.0

 ######  PRODUCTOS CON ATUN Y POLLO  ######
[Codigo=104, nombre='Sándwich pollo', tipo=SANDWICH, ingredientes=[tomate, pan de molde, queso fundido, pollo, lechuga], precio=4.0, Codigo=105, nombre='Sándwich atun', tipo=SANDWICH, ingredientes=[atun, tomate, pan de molde, mayonesa, queso fundido, lechuga], precio=3.5, Codigo=101, nombre='Bocadillo de pollo', tipo=BOCATA, ingredientes=[queso, pan, pollo], precio=3.5]
 ######  PRODUCTOS DEL TIPO BOCADILLO  ######
Codigo=100, nombre='Bocadillo de jamón y queso', tipo=BOCATA, ingredientes=[jamón, queso, pan], precio=2.5
Codigo=101, nombre='Bocadillo de pollo', tipo=BOCATA, ingredientes=[queso, pan, pollo], precio=3.5
Codigo=102, nombre='Bocadillo Serranito', tipo=BOCATA, ingredientes=[jamón serrano, cerdo, mayonesa, pan], precio=5.5

 ######  COMANDA DE LA MESA 7  ######
Codigo=110, nombre='Agua mineral', tipo=BEBIDA, ingredientes=[agua], precio=1.0
Codigo=113, nombre='Sundae de vainilla con sirope de chocolate', tipo=POSTRE, ingredientes=[sirope de chocolate, helado de vainilla], precio=2.5
Codigo=100, nombre='Bocadillo de jamón y queso', tipo=BOCATA, ingredientes=[jamón, queso, pan], precio=2.5

 ######  COMANDA DE LA MESA 7: Ordenado por CÓDIGO  ######
Codigo=100, nombre='Bocadillo de jamón y queso', tipo=BOCATA, ingredientes=[jamón, queso, pan], precio=2.5
Codigo=110, nombre='Agua mineral', tipo=BEBIDA, ingredientes=[agua], precio=1.0
Codigo=113, nombre='Sundae de vainilla con sirope de chocolate', tipo=POSTRE, ingredientes=[sirope de chocolate, helado de vainilla], precio=2.5

 ######  COMANDA DE LA MESA 2  ######
Codigo=101, nombre='Bocadillo de pollo', tipo=BOCATA, ingredientes=[queso, pan, pollo], precio=3.5
Codigo=106, nombre='Pizza cuatro quesos', tipo=PIZZA, ingredientes=[champiñones, masa, queso rallado, tomate frito, jamón york], precio=8.0
Codigo=112, nombre='refreco', tipo=BEBIDA, ingredientes=[refresco], precio=2.5
Codigo=111, nombre='Cerveca', tipo=BEBIDA, ingredientes=[cervaza], precio=2.0

 ######  COMANDA DE LA MESA 2: Ordenado alfabeticamente  ######
Codigo=101, nombre='Bocadillo de pollo', tipo=BOCATA, ingredientes=[queso, pan, pollo], precio=3.5
Codigo=111, nombre='Cerveca', tipo=BEBIDA, ingredientes=[cervaza], precio=2.0
Codigo=106, nombre='Pizza cuatro quesos', tipo=PIZZA, ingredientes=[champiñones, masa, queso rallado, tomate frito, jamón york], precio=8.0
Codigo=112, nombre='refreco', tipo=BEBIDA, ingredientes=[refresco], precio=2.5

 ######  TOTAL A PAGAR DE LA MESA 2  ######
16.0€
 ######  TOTAL A PAGAR DE LA MESA 7  ######
6.0€
 ######  TOTAL A PAGAR DE LA MESA 1  ######
0.0€
*/
