package Arrays;

public class arrayBidimensional1 {
    public static void main(String[] args) {
        
        int[][] tabla = new int[5][5];



        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tabla[i][j] = 10*i+j; 
            }
            System.out.println();

        }




        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tabla[i][j]+ "\t");
            }
            System.out.println();

        }

    }
}
