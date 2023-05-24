package utiles;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import modelos.Usuario;

public class apiConnection {

    // public static String buscarUsuarioString(int codigoUsuario) {

    // String resultado = "";

    // try {

    // String urlConexion = "https://jsonplaceholder.typicode.com/users/";

    // urlConexion += codigoUsuario;

    // URL url = new URL(urlConexion);
    // URLConnection urlConnection = url.openConnection();

    // InputStream input = new BufferedInputStream(urlConnection.getInputStream());

    // int character = input.read();

    // while (character != -1) {
    // resultado += Character.toString(character);
    // character = input.read();
    // }

    // } catch (Exception e) {
    // System.out.println("Error: buscar usuario " + e);
    // }

    // return resultado;

    // }

    public static Usuario buscarUsuario(int codigoUsuario) {

        Usuario usuarioEncontrado = null;

        try {
            String urlConexion = "https://jsonplaceholder.typicode.com/users/";

            urlConexion += codigoUsuario;

            URL url = new URL(urlConexion);
            URLConnection urlConnection = url.openConnection();

            InputStream input = new BufferedInputStream(urlConnection.getInputStream());

            // Mapeo la respuesta de la api con el objeto usuario
            ObjectMapper mapper = new ObjectMapper();

            usuarioEncontrado = mapper.readValue(input, Usuario.class);

        } catch (Exception e) {
            System.out.println("Error: buscar usuario " + e);
        }

        return usuarioEncontrado;
    }

    public static List<Usuario> buscarTodosLosUsuarios() {

        List<Usuario> listaUsuario = new ArrayList<>();
        Usuario usuarioEncontrado = null;

        try {

            String urlConexion = "https://jsonplaceholder.typicode.com/users/";

                urlConexion += i + 1;
                URL url = new URL(urlConexion);
                URLConnection urlConnection = url.openConnection();

                InputStream input = new BufferedInputStream(urlConnection.getInputStream());

                // Mapeo la respuesta de la api con el objeto usuario
                ObjectMapper mapper = new ObjectMapper();

                listaUsuario = mapper.readValue(input, new TypeReference() {});
                

        } catch (Exception e) {
            System.out.println("Error: buscar usuario " + e);
        }

        return usuarioEncontrado;
    }
}
