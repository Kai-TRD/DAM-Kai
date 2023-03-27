package Colecciones.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Arrays.arrayBidimensional;

public class ejercicio6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Implementa el control de acceso al área restringida de un programa. Se debe
        // pedir un nombre de usuario y una contraseña. Si el usuario introduce los
        // datos correctamente, el programa dirá “Ha accedido al área restringida”. El
        // usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
        // el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
        // de usuario con sus correspondientes contraseñas deben estar almacenados en
        // una estructura de la clase HashMap.

        HashMap<String, String> usuario = new HashMap<>();

        usuario.put("Kai", "1234");
        
        boolean salir = false;

        do {
            
            System.out.print("Usuario: ");
            String usuarioA = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();

            if(usuario.containsKey(usuarioA)){
                usuario.get(usuarioA);
            }




        } while (!salir);
        


    }
}
