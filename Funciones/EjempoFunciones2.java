package Funciones;

public class EjempoFunciones2 {
    
    static void imprimCadena(String cadena, int numero){
        for (int i = 0; i < numero; i++) {
            System.out.println(cadena);
        }
    }
    public static void main(String[] args) {
        
        imprimCadena("hola", 6);
    }
}
