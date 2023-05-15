package examenes.examenT9recuperacion.metodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import examenes.examenT9.Producto;

public class MiLista<T> {

    private ArrayList<T> generico;

    public void eliminar(int posicion) {
        generico.remove(posicion);
    }

    public void ordenar(Comparator<T> comparador) {
        Collections.sort(generico, comparador);
    }

    public String StringElementos() {

        String lista = null;
        for (int i = 0; i < generico.size(); i++) {
            lista += generico.get(i) + ", ";
        }

        return lista;
    }

    public T get(int posicion) {
        return generico.get(posicion);
    }

    public int size() {
        return generico.size();
    }

    public void add(T producto) {
        generico.add(producto);
    }   


}
