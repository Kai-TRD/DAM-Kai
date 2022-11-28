import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un rango de numeros:");

        System.out.print("num1: ");
        int num1 = sc.nextInt();

        System.out.print("num2: ");
        int num2 = sc.nextInt();

        sc.close();
        if(num1>0 && num2>0 && num1 != num2){
            int menor = 0;
            int mayor = 0;
            if(num1<num2){menor=num1;}
            if(num1<num2){mayor=num2;}

            if(num1>num2){menor=num2;}
            if(num1>num2){mayor=num1;}
            

            for (int i = menor; i <= mayor; i+=7) {
                
                System.out.print(i);
                System.out.print("-");
            }
            System.out.println("");
        } else
        if(num1 == num2){System.out.println("ERROR!: los valores son iguales");}
        if(num1<0 && num2>0){System.out.println("ERROR!: numero 1 es negativo");}
        if(num2<0 && num1>0){System.out.println("ERROR!: numero 2 es negativo");}
        if(num1<0 && num2<0){System.out.println("ERROR!: los 2 numeros son negativos");} 
    }
}
