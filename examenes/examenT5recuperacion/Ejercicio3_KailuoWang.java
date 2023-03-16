package examenes.examenT5recuperacion;

import java.util.Scanner;
    public class Ejercicio3_KailuoWang {
    public static void main(String[] args) {
        //Juego del Lingo
        //String palabra secreta ha buscar es : HUECO
        String palabraSecreata = "HUECO";
        char[] arrayCaracteresSecretos = ConvertirStringAArray(palabraSecreata);
        for (int i = 0; i < arrayCaracteresSecretos.length; i++) {
            System.out.println(arrayCaracteresSecretos[i]);
        }
        Scanner sc = new Scanner(System.in);
        String intento = "";
        boolean encontrada = false;

        do{
            System.out.println("Intento....");
            intento = sc.nextLine();
            if (!intento.equalsIgnoreCase(palabraSecreata)){
                String cadenaPistas = comparacion(arrayCaracteresSecretos, intento);
                System.out.println("Pista: " + cadenaPistas);
            } else {
                encontrada = true;
                System.out.println("Enhorabuena has encotrado la palabra secreta");
            }
        }while(!encontrada);
    }

    /**
    * Función que devuelve la cadena que se le pasa como parámetro convertida en un array
    de caracteres.
    * @param cadena
    * @return
    */
    public static char[] ConvertirStringAArray(String cadena){

        return cadena.toCharArray();
        
    }
    /**
    * Funcion que devuelve una cadena de caracteres con la misma longitud que el parámetro
    cadena que se le pasa como parámetro
    * Esta cadena devuelta será de la siguiente forma:
    * '-' Si el caracter que esta en esa posición no está en el array
    * '*' Si el caracter que está en esa posicion esta en algún sitio del array
    * Si el caracter que está en esa posición está en la misma posición del array entonces se
    imprime ese carácter.
    * @param array
    * @param cadena
    * @return
    */
    public static String comparacion(char[] array, String cadena){
        char[] temp = ConvertirStringAArray(cadena);

        for (int i = 0; i < array.length; i++) {
            if(array[i] != temp[i]){
                System.out.print("-");
            }
            if(array[i] == temp[i]){
                System.out.print(temp[i]);
            }

        }
        return "sss";
    }
}

