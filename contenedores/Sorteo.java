package contenedores;

import java.util.HashSet;
import java.util.Set;

public class Sorteo<T> {
    
    // Atributos de clase
    private HashSet<T> bolsa;

    // Constructor de clase
    public Sorteo(){
        bolsa = new HashSet<>();
    }

    public boolean add(T elemento){
        return bolsa.add(elemento);
    }

    public Set<T> premiados(int numPremiados){
        HashSet<T> premiados = new HashSet<>();

        // Para conseguir los premiados voy a ordenar el conjunto
        // y luego lo desordenare con shufle, los premiados serán los x primeros
        premiados.addAll(this.bolsa);
        premiados.shuffle(premiados);
    }

}
