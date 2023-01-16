package Arrays.Biblioteca;

public class menuPrueba {
    
    public static void main(String[] args) {
        
        int[] array = null;

        utilesArrayKai.rellenar(array,5);

        utilesArrayKai.imprimir(array);

        array =utilesArrayKai.limpiar();

        array =utilesArrayKai.insertarAlPrincipio(array, 10);

        array =utilesArrayKai.insertarAlPrincipio(array, 20);

        array =utilesArrayKai.insertarAlPrincipio(array, 30);

        array =utilesArrayKai.insertarAlPrincipio(array, 40);

        array =utilesArrayKai.insertarAlFinal(array, 5);

        boolean ordenado = utilesArrayKai.estaOrdenado(array);

        System.out.println("Esta ordenado: " + ordenado);

        utilesArrayKai.imprimir(array);

        array =utilesArrayKai.eliminarPrimero(array);

        array =utilesArrayKai.eliminar(array, 40);

        utilesArrayKai.ordenar(array);

        array =utilesArrayKai.insertarOrdenado(array, 15);

        utilesArrayKai.imprimir(array);
        
        int posicion30 =utilesArrayKai.buscar(array, 30);

        System.out.println("El elemento 30 está en la posicion: " + posicion30);

        int posicion99 =utilesArrayKai.buscar(array, 99);

        System.out.println("El elemento 99 está en la posicion: " + posicion99);

        array =utilesArrayKai.partirPor(array, 1,3);

        utilesArrayKai.imprimir(array);

    }
}