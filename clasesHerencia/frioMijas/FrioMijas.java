package clasesHerencia.frioMijas;

import clasesHerencia.frioMijas.personal.Empleado;
import clasesHerencia.frioMijas.personal.Jefe;
import clasesHerencia.frioMijas.personal.Sede;


public class FrioMijas {

    public static void main(String[] args) {
        
        Jefe jefe1 = new Jefe("Jefazo", "Garcia", 45, 2500, "45000001X" );
        Jefe jefe2 = new Jefe("Jefe_malaga", "Lopez", 34, 2100, "77000002P" );

        Sede sede1 = new Sede("Madrid", "Calle ancha", 80881, jefe1);
        
        Sede sede2 = new Sede("Malaga", "Calle Larios", 29001);
        sede2.setJefe(jefe2);

        Empleado empleado1 = new Empleado("Daniel", "ape1", 35, 1000, "88000008W" );
        Empleado empleado2 = new Empleado("Juan", "ape2", 35, 1200, "21000008E" );

        Empleado empleado3 = new Empleado("Maria", "ape3", 55, 1700, "99000008R" );
        Empleado empleado4 = new Empleado("Pepe", "ape4", 45, 900, "66000008Y" );
        Empleado empleado5 = new Empleado("Pedro", "ape5", 30, 2000, "54000008T" );
        Empleado empleado6 = new Empleado("Daniel", "ape6", 24, 1000, "12000008P" );
        Empleado empleado7 = new Empleado("Pilar", "ape7", 24, 1000, "12000008P" );

        System.out.println(empleado1);
        System.out.println(empleado2);

        sede1.addEmpleado(empleado1);
        sede1.addEmpleado(empleado2);

        sede2.addEmpleado(empleado3);
        sede2.addEmpleado(empleado4);
        sede2.addEmpleado(empleado5);
        sede2.addEmpleado(empleado6);
        sede2.addEmpleado(empleado7);

        //Cambiamos contraseñas
        System.out.println(jefe1);
        jefe1.generaPassword(5);
        System.out.println("Nueva contraseña para jefe1");
        System.out.println(jefe1);

        System.out.println(jefe2);
        jefe2.generaPassword();
        System.out.println("Nueva contraseña para jefe2");
        System.out.println(jefe2);

        //Mostrar la información completa de cada una de las sedes + jefe + empleados
        System.out.println(sede1);
        
        System.out.println(sede2);

        /*
         * HACER *
         * Mostrar si la contraseña de los jefes es no Fuerte
         */
        System.out.println("*****************************************************************");
        System.out.println("Los jefes con password fuerte son:");
        System.out.println("*****************************************************************");
         if(esFuerte(jefe1.getPassword())){
            System.out.println(jefe1.getNombre());
         }

         if(esFuerte(jefe2.getPassword())){
            System.out.println(jefe2.getNombre());
         }
        
         /*
          * HACER
          * Generar contraseña de 10 elementos que sea fuerte para cada uno de los jefes
          */

         /*
         * HACER *
         * Empleados de la sede2 con sueldo entre 500 y 1500 
         */
        System.out.println("*****************************************************************");
        System.out.println(" \tEmpleados de la sede2 con sueldo entre 500 y 1500");
        System.out.println("*****************************************************************");

        for (int i = 0; i < sede2.empleado.length; i++) {
            if (sede2.empleado[i].getSalario() > 499 && sede2.empleado[i].getSalario() < 1501) {
                System.out.println(sede2.empleado[i].getNombre());
            } else {
                System.out.println("-------");
            }
        }
        /*
         * HACER *
         * Crea 5 equipos frigorificos diferentes y asignalos a la 2º sede y muéstralos a continuación   
         */

         





        
        
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
        
        // System.out.println("Minusculas: " + minuscula);
        // System.out.println("Mayusculas: " + mayusculas);
        // System.out.println("Numeros:" + numeros);

        if(mayusculas >= 2 && minuscula >= 1 && numeros >= 5){
            resultado = true;
        } else {
            resultado = false;
        }
        
        return resultado;
    }
    
}