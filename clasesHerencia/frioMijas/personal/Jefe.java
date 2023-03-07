package clasesHerencia.frioMijas.personal;

public class Jefe extends Trabajadores {

    private String password;

    public Jefe(String nombre, String apellidos, int edad , double salario, String dni) {
        super(nombre, edad, apellidos, dni, salario);
    }

    public Jefe(String nombre, String apellidos, int edad , double salario, String dni, String password) {
        super(nombre, edad, apellidos, dni, salario);
        this.password = password;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Generador de Contraseña
    public void generaPassword(){
        generaPassword(8);
    }

    public void generaPassword(int longitud){
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
        String entero = "";
        for (int i = 0; i < password.length; i++) {
             entero += password[i];
            }
        this.password = entero;
    }


    @Override
    public String toString() {

        String jefe  = " \n\t----- Jefe ----- ";
               jefe += " \n\t -Nombre:" + this.nombre;
               jefe += " \n\t -Apellido:" + this.apellidos;
               jefe += " \n\t -Edad:" + this.edad;
               jefe += " \n\t -Salario:" + this.salario;
               jefe += " \n\t -DNI:" + this.dni;
               jefe += " \n\t -PassWord:" + this.password;

        return jefe;
    }

}
