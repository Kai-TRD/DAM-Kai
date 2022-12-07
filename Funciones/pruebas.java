import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do {
            
        
        numero = sc.nextInt();

        String empieza = "E1";

        int random = (int)(Math.random()*2);

        if(random > 0){
            empieza = "E1";
        } else {
            empieza = "E2";
        }

        System.out.println(empieza);
        } while (numero != 9);
    }
}












// static String salto(){
//     String empieza = "";

//     int random = (int)(Math.random()*2);

//     if(random > 0){
//         empieza = "E1";
//     } else {
//         empieza = "E2";
//     }
//     return empieza;
// }
