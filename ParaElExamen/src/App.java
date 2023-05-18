import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // importa las 3 jar de la carpeta lib para poder leer archivos





        // Ejemplo uso ordenada de tiempo con getTiempo() para Persona2

        Persona2 persona1 = new Persona2("Kailuo", 20, "gato", 69);
        Persona2 persona2 = new Persona2("Emilia", 19, "gato", 96);
        Persona2 persona3 = new Persona2("Kai'sa", 18, "Insecto", 23);
        Persona2 persona4 = new Persona2("Kass'adin", 46, "CienPies", 34);
        Persona2 persona5 = new Persona2("Jonathan", 21, "Perro", 74);

        List<Persona2> grupo = new ArrayList<>();

        grupo.add(persona1);
        grupo.add(persona2);
        grupo.add(persona3);
        grupo.add(persona4);
        grupo.add(persona5);

        for (int i = 0; i < grupo.size(); i++) {
            System.out.println(grupo.get(i));
        }

        List<Persona2> listaOrdenada = utils.ordenar(grupo);
        System.out.println("....................");
        for (int i = 0; i < listaOrdenada.size(); i++) {
            System.out.println(listaOrdenada.get(i));
        }
    }
}
