package Arrays;
public class ejercicioArray4 {
    public static void main(String[] args) {
        
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];


        rellenarConAleatorios(numero);

        rellenarConCuadrado(numero, cuadrado);

        rellenarConCubo(numero, cubo);

        imprimir(numero, cuadrado, cubo);




        
    }

    static void rellenarConAleatorios(int[] array){
        for (int i = 0; i < array.length; i++) {
            int random = (int)(Math.random()*101);
            array[i] = random;
        }
    }

    static void rellenarConCuadrado(int[] numero, int[] cuadrado){
        for (int i = 0; i < numero.length; i++) {
            int valor = numero[i];
            int calculoCuadrado = (int) Math.pow(valor, 2);
            cuadrado[i] = calculoCuadrado;
        }
    }

    static void rellenarConCubo(int[] numero, int[] cubo){
        for (int i = 0; i < numero.length; i++) {
            int valor = numero[i];
            int calculoCubo = (int) Math.pow(valor, 3);
            cubo[i] = calculoCubo;
        }
    }

    static void imprimir(int[] numero, int[]cuadrado, int[]cubo){
        System.out.println(" numero\tcuadr.\tcubo");
        System.out.println("------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(" "+numero[i] + "\t" + cuadrado[i] + "\t" + cubo[i]);
        }
    }

}
