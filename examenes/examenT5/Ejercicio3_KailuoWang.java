package examenes.examenT5;

public class Ejercicio3_KailuoWang {
    public static void main(String[] args) {
        //FILA Y COLUMNA
        int[][] datos = new int[5][10];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                int random = (int)(Math.random()*4+1);
                datos[i][j] = random;
            }
        }
        imprimirResultado(datos);


    }
    static void imprimirResultado(int[][] datos){

        for (int i = 0; i < 5; i++) {
            int sumaTotal = -1;
            System.out.print("Fila "+(i+1) + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(datos[i][j] + "\t");
                sumaTotal = sumaTotal + datos[i][j];
            }
            System.out.println("| ==" +  sumaTotal);
        }
        System.out.println("------------------------------------------------------------------------------------------");
        

    }
}
