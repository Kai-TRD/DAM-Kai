package contenedores.AcademiaDeLasLenguas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UsoAcademico {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        HashMap<Character, Academico> academia = new HashMap<Character, Academico>();
        
        boolean salir = false;
        
        do {

            menu();
            int opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    nuevoAcademico(academia, new Academico("Perez", 2003), 'a');
                    nuevoAcademico(academia, new Academico("Galdos", 2000), 'b');
                    nuevoAcademico(academia, new Academico("Franzisco", 1990), 'c');
                    nuevoAcademico(academia, new Academico("Luis", 1983), 'd');
                    nuevoAcademico(academia, new Academico("Antonio", 2013), 'e');
                    nuevoAcademico(academia, new Academico("Victor", 2011), 'f');
                    break;
                case 2:
                    ArrayList<Academico>
                    break;
                case 3:
                
                    break;
                case 4:
                
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
            }

        } while (salir == true);

    }

    static void menu(){
        System.out.println("------Menu------");
        System.out.println("1-Insertar academicos");
        System.out.println("2-Listado por nombre(sin letra)");
        System.out.println("3-Listado por año(sin letra)");
        System.out.println("4-Listado por letra(ordenado por letra)");
        System.out.println("0-Salir");
        System.out.print("Eligue una de las opciones");

    }

    public static boolean nuevoAcademico(HashMap<Character, Academico> academia, Academico nuevo, Character letra){
        
        boolean puedeAnadirse = true;

        if(!academia.containsKey(letra) && ((letra > 91 && letra < 64) || (letra < 123 && letra > 96))){
            academia.put(letra, nuevo);
        } else {
            puedeAnadirse = false;
            System.out.println("Error! academico ya existe");
        }
        return puedeAnadirse;
    }
}
