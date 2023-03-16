package examenes.examenT5;

public class Ejercicio3_Resuelto {
    public static void main(String[] args) {
        //FILA Y COLUMNA
        int[][] datos = new int[5][10];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                int random = (int)(Math.random()*5);
                datos[i][j] = random;
            }
        }

        imprimirResultado(datos);

            int sumaTotal = 0;
            int sumaZeros = 0;
    
            for (int r = 0; r < datos.length; r++) 
            {
                // System.out.println("Fila: " + r);
                sumaTotal = 0;
                sumaZeros = 0;
    

                for (int j = 0; j < 10; j++) {
                    sumaTotal = sumaTotal + datos[r][j];
                    if(datos[r][j] == 0){
                        sumaZeros++;
                    }
                }
            
            
                // if(sumaTotal != 24){
                //     System.out.println("Suma total: " +(24 - sumaTotal));   
                // }

                // System.out.println("Numero de 0: " + sumaZeros);
                int calculos = 0;
                int calculos2 = 0;
                if(sumaZeros != 0){
                    calculos = (24 - sumaTotal)/sumaZeros;
                    calculos2 = (24 - sumaTotal)%sumaZeros;
                }

                // System.out.println("valores: " + calculos);
                // System.out.println("valores: " + calculos2);

                // System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                //for (int i = 0; i < 5; i++) {
                int contador = 1;
                for (int j = 0; j < 10; j++) {
                    for (int j2 = 0; j2 < sumaZeros; j2++) {
                        if(datos[r][j] == 0){
                            if(contador == 1){
                                datos[r][j] = calculos + calculos2;
                            } else {
                                datos[r][j] = calculos;
                            }
                            contador = contador - 1;
                        }
                    }

               // }
                }
            }



        imprimirResultado(datos);

    }
    static void imprimirResultado(int[][] datos){

        for (int i = 0; i < 5; i++) {
            int sumaTotal = 0;
            System.out.print("Fila "+(i+1) + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(datos[i][j] + "\t");
                sumaTotal = sumaTotal + datos[i][j];
            }
            System.out.println("| ==" +  sumaTotal);
        }
        System.out.println("------------------------------------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t");
            int sumaTotal = 0;
            for (int j = 0; j < 5; j++) {
                sumaTotal = sumaTotal + datos[j][i];
            }
            System.out.print(sumaTotal);
        }
        System.out.println();        

    }
}
