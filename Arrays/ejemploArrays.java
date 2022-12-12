package Arrays;

public class ejemploArrays {
    public static void main(String[] args) {

        //declarar edades: array de 5 elementos
        int[] edades = new int[5];

        //declarar nombres = array de sting de 5 elementos
        String[] nombre = new String[5];


        System.out.println("EDADES: La posicion 2 tiene el valor: " + edades[2]);
        System.out.println("NOMBRES: La posicion 2 tiene el valor: " + nombre[2]);


        //formas de iniciar valñores de array
        int[] edades2 = {1, 14, 58, 89, 18};
        System.out.println("EDADES: La posicion 2 tiene el valor: " + edades2[2]);
        edades[0] = 19;
        System.out.println("EDADES: La posicion 2 tiene el valor: " + edades[0]);

        //Poner a todas las posiciones de array edades el valor 18
        for (int aux = 0; aux < edades.length; aux++) {
            edades[aux] = 18;
        }
        System.out.println("EDADES: La posicion 2 tiene el valor: " + edades[0]);


        //Dos apuntando al mismo espacio
        int[] e;
        int[] d;
        e = new int[5];
        for (int aux = 0; aux < e.length; aux++) {
            e[aux] = 7;
        }
        d = e;

        System.out.println("Array d, en la posicion 4 es: " + d[4]);

        d[4] = 10;
        System.out.println("Array e, en la posicion 4 es: " + e[4]);
        System.out.println("Array d, en la posicion 4 es: " + d[4]);


        for (int aux = 0; aux < e.length; aux++) {
            System.out.println("Pos "+ aux + "=" + e[aux]);
        }
    }
}
