public class EjempoFunciones2 {
    
    static void imprimCadena(String cadena, int numero){
        for (int i = 0; i < numero; i++) {
            System.out.println(cadena);
        }
    }
    static void imprimCadena2(){
        System.out.println("JEJEJEJEJE");
    }
    public static void main(String[] args) {
        
        imprimCadena("hola", 6);
        for (int i = 0; i < 5; i++) {
            imprimCadena2();    
        }
    }
}
