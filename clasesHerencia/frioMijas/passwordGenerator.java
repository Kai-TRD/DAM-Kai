package clasesHerencia.frioMijas;

public class passwordGenerator {
    public static void main(String[] args) {
        // esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.

        int longitud = 5;
        boolean esFuerte = false;
        String entero = "";

        String[] password = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            int letraONumero = (int)(Math.random()*2);
            switch(letraONumero){
                case 0:
                    password[i] = Integer.toString((int)(Math.random()*10));
                break;
                case 1:
                    int minusOMayus = (int)(Math.random()*2);
                    switch(minusOMayus){
                        // mayus
                        case 0:
                        char tempMayus = (char) (65 + (int)(Math.random()*26));
                        password[i] = String.valueOf(tempMayus);
                        break;

                        // minus
                        case 1:
                        char tempMinus = (char) (97 + (int)(Math.random()*26));
                        password[i] = String.valueOf(tempMinus);
                        break;
                    }
                break;
            }
        }

        System.out.print("El codigo generado es: ");
        for (int i = 0; i < password.length; i++) {
            entero += password[i];
        }

        System.out.println(entero);

        esFuerte = esFuerte(entero);

        System.out.println("¿Es fuerte? " + esFuerte);
        

    }

    public static boolean esFuerte(String password){
        boolean resultado;
        int mayusculas = 0;
        int minuscula = 0;
        int numeros = 0;
        String[] abecedarioMay = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] abecedarioMin = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int[] numerosArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        
        String[] parts = password.split("");
        for (int i = 0; i < parts.length; i++) {
            
            // mayusculas
            for (int j = 0; j < abecedarioMay.length; j++) {
                if (parts[i].equals(abecedarioMay[j])) {
                    mayusculas++;
                }
            }

            // minusculas
            for (int j = 0; j < abecedarioMin.length; j++) {
                if (parts[i].equals(abecedarioMin[j])) {
                    minuscula++;
                }
            }

            // numeros
            for (int j = 0; j < numerosArray.length; j++) {
                if (parts[i].equals(Integer.toString(numerosArray[j]))) {
                    numeros++;
                }
            }

        }
        
        System.out.println("Minusculas: " + minuscula);
        System.out.println("Mayusculas: " + mayusculas);
        System.out.println("Numeros:" + numeros);

        if(mayusculas >= 2 && minuscula >= 1 && numeros >= 5){
            resultado = true;
        } else {
            resultado = false;
        }
        
        return resultado;
    }





}
