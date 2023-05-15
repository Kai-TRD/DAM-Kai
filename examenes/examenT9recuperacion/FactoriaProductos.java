package examenes.examenT9recuperacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import examenes.examenT9recuperacion.clases.Producto;

public class FactoriaProductos {
    List<Producto> productos;

    public FactoriaProductos()
    {
        productos = new ArrayList<>();
    }

    public List<Producto> crearProductosRestaurante()
    {
        Set<String> ingredientes = new HashSet<>();

        // Crear un bocadillo
        ingredientes.clear();
        ingredientes.add("pan");
        ingredientes.add("jamón");
        ingredientes.add("queso");
        Producto bocadillo = new Producto("Bocadillo de jamón y queso", TipoProducto.BOCATA, ingredientes, 2.5);

        productos.add(bocadillo);

        // Crear un sándwich
        ingredientes.clear();
        ingredientes.add("pan de molde");
        ingredientes.add("jamón cocido");
        ingredientes.add("queso fundido");
        ingredientes.add("lechuga");
        ingredientes.add("tomate");
        Producto sandwich = new Producto("Sándwich mixto", TipoProducto.SANDWICH, ingredientes, 3.0);

        productos.add(sandwich);

        // Crear una pizza
        ingredientes.clear();
        ingredientes.add("masa");
        ingredientes.add("tomate frito");
        ingredientes.add("queso rallado");
        ingredientes.add("jamón york");
        ingredientes.add("champiñones");
        Producto pizza = new Producto("Pizza cuatro quesos", TipoProducto.PIZZA, ingredientes, 8.0);

        productos.add(pizza);

        // Crear un campero
        ingredientes.clear();
        ingredientes.add("pan de hamburguesa");
        ingredientes.add("carne de vacuno");
        ingredientes.add("lechuga");
        ingredientes.add("tomate");
        ingredientes.add("cebolla");
        Producto campero = new Producto("Campero completo", TipoProducto.CAMPERO, ingredientes, 4.5);

        productos.add(campero);

        // Crear una bebida
        ingredientes.clear();
        ingredientes.add("agua");
        Producto bebida = new Producto("Agua mineral", TipoProducto.BEBIDA, ingredientes, 1.0);

        productos.add(bebida);

        // Crear un postre
        ingredientes.clear();
        ingredientes.add("helado de vainilla");
        ingredientes.add("sirope de chocolate");
        Producto postre = new Producto("Sundae de vainilla con sirope de chocolate", TipoProducto.POSTRE, ingredientes, 2.5);

        productos.add(postre);


        return productos;
    }
}

