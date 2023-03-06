package clasesHerencia.frioMijas;

public class pruebas {
    public static void main(String[] args) {
        

        int longitud = 5;

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

        for (int i = 0; i < password.length; i++) {
            System.out.print(password[i]);
        }
        System.out.println();

    }
}
