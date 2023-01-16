package Arrays;

public class bingo {
    public static void main(String[] args) {
        
        //Creo las columnas
        String[] colum1= new String[3];
        String[] colum2= new String[3];
        String[] colum3= new String[3];
        String[] colum4= new String[3];
        String[] colum5= new String[3];
        String[] colum6= new String[3];
        String[] colum7= new String[3];
        String[] colum8= new String[3];
        String[] colum9= new String[3];

        randomColumna(colum1, colum2, colum3, colum4, colum5, colum6, colum7, colum8, colum9);
        imprimir(colum1, colum2, colum3, colum4, colum5, colum6, colum7, colum8, colum9);

    }




    static void randomColumna(String[] colum1, String[] colum2, String[] colum3, String[] colum4, String[] colum5, String[] colum6, String[] colum7, String[] colum8, String[] colum9){
        
        int contador = 1;
        int suma = 0;
        for (int i = 0; i < 9; i++) {
            String[] columnaActual = colum1;
            switch (contador) {
                case 1:
                    columnaActual = colum1;
                    suma = 0;
                    break;
                case 2:
                    columnaActual = colum2;
                    suma = 10;
                    break;
                case 3:
                    columnaActual = colum3;
                    suma = 20;
                    break;
                case 4:
                    columnaActual = colum4;
                    suma = 30;
                    break;
                case 5:
                    columnaActual = colum5;
                    suma = 40;
                    break;
                case 6:
                    columnaActual = colum6;
                    suma = 50;
                    break;
                case 7:
                    columnaActual = colum7;
                    suma = 60;
                    break;
                case 8:
                    columnaActual = colum8;
                    suma = 70;
                    break;
                case 9:
                    columnaActual = colum9;
                    suma = 80;
                    break;
            }
        
            for (int j = 0; j < 3; j++) {
                int valorRandom = (int)((Math.random()*10)+suma);
                 
                //columnaActual[j] = String.valueOf(valorRandom);
                System.out.print(columnaActual[j] = String.valueOf(valorRandom) + "-");
            }
            System.out.println();
            contador++;
        }
    }

    static void imprimir(String[] colum1, String[] colum2, String[] colum3, String[] colum4, String[] colum5, String[] colum6, String[] colum7, String[] colum8, String[] colum9){
        
        String[] columnaActual = colum1;
        int contador = 1;

        for (int i = 0; i < 9; i++) {
            switch (contador) {
                case 1:
                    columnaActual = colum1;
                    break;
                case 2:
                    columnaActual = colum2;
                    break;
                case 3:
                    columnaActual = colum3;
                    break;
                case 4:
                    columnaActual = colum4;
                    break;
                case 5:
                    columnaActual = colum5;
                    break;
                case 6:
                    columnaActual = colum6;
                    break;
                case 7:
                    columnaActual = colum7;
                    break;
                case 8:
                    columnaActual = colum8;
                    break;
                case 9:
                    columnaActual = colum9;
                    break;
            }
            for (int j = 0; j < 3; j++) {
                System.out.print(columnaActual[j]+" - ");    
            }
            System.out.println();
            contador++;
        }
    }

    static void carton(String[] colum1, String[] colum2, String[] colum3, String[] colum4, String[] colum5, String[] colum6, String[] colum7, String[] colum8, String[] colum9){
        String[] columnaActual = colum1;
        int contador = 1;

        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < 9; i++) {
                switch (contador) {
                    case 1:
                        columnaActual = colum1;
                        break;
                    case 2:
                        columnaActual = colum2;
                        break;
                    case 3:
                        columnaActual = colum3;
                        break;
                    case 4:
                        columnaActual = colum4;
                        break;
                    case 5:
                        columnaActual = colum5;
                        break;
                    case 6:
                        columnaActual = colum6;
                        break;
                    case 7:
                        columnaActual = colum7;
                        break;
                    case 8:
                        columnaActual = colum8;
                        break;
                    case 9:
                        columnaActual = colum9;
                        break;
                }
                System.out.print(columnaActual[j]+" - ");    
            }
            System.out.println();
            contador++;
        }
    }












    
}
