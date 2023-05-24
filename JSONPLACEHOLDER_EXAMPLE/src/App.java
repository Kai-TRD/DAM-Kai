import java.util.List;

import modelos.Usuario;
import utiles.apiConnection;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // String result = apiConnection.buscarUsuarioString(1);
        // System.out.println(result);


        List<Usuario> usuario = apiConnection.buscarTodosLosUsuarios();
        System.out.println(usuario);

    }
}
