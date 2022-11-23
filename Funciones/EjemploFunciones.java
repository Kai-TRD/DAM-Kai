package Funciones;

public class EjemploFunciones {

    static void imprimir5veces(String cadena){
        
        for (int i = 0; i < 5; i++) {
            System.out.println("inicio " + cadena);
        }
    }
    public static void main(String[] args) {
        imprimir5veces("hola");        
    }
}
