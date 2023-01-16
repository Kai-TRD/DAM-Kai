package Arrays.Biblioteca;
import java.util.Arrays;
import java.util.Scanner;

public class utilesArrayKai {
   
    /* Biblioteca de Arrays */
    /**
     * enter
     */
    static void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pulsa ENTER para continuar...");
        sc.nextLine();
        System.out.print("\033[H\033[2J");
    }

    /**
     * borra los valores del array. Deque quedar un array vacio
     * @param array
     */
    static int[] limpiar(){
        int[] array = null;
        // int[] array = new int[0];
        return array;
    }
    
    
    /**
     * llena el array con el numero de elementos  indicados, valor de estos numeros será 0   
     * @param array
     * @param numeroElementos
     */
    static int[] rellenar(int[] array, int numeroElementos){
        
        int[] nuevo = new int[numeroElementos];
        for (int i = 0; i < nuevo.length; i++) {
            nuevo[i] = 0;
        }
        return nuevo;
    }

    /**
     * llena el array con el numero de elementos indicados conel valor indicado
     * @param array
     * @param numeroElementos
     * @param valor
     * @return
     */
    static int[] rellenar(int[] array, int numeroElementos, int valor){

        int[] nuevo = new int[numeroElementos];
        for (int i = 0; i < nuevo.length; i++) {
            nuevo[i] = valor;
        }
        return nuevo;
    }


    /**
     * insertar valor al final de un array
     * @param array
     * @param elemento
     * @return
     */
    static int[] insertarAlFinal(int[] array, int elemento){
        int[] copia=Arrays.copyOf(array, array.length+1);
        copia[copia.length-1]=elemento;
        return copia;
    }


    /**
     * inserta valor al principio de un array
     * @param array
     * @param elemento
     * @return
     */
    static int[] insertarAlPrincipio(int[] array, int elemento){
        int[] temp=new int[1];
        if(array!=null){
            temp=new int[array.length+1];
        }
        for(int i=0; i<temp.length; i++){
            if(i==0){
                temp[i]=elemento;
            }
            else{
                temp[i]=array[i-1];
            }
        }
        return temp;
    }


    /**
     * insertar un elemento en un posición asignada
     * @param array
     * @param elemento
     * @param position
     * @return
     */
    static int[] insertatEnPosicion(int[] array, int elemento, int position){
        int[] temp=new int[array.length+1];
        //position--; Lo había puesto por si era la posición desde 1.
        for(int i=0; i<temp.length; i++){
            if(i<position){
                temp[i]=array[i];
            }
            else if(i>position){
                temp[i]=array[i-1];
            }
            else{
                temp[i]=elemento;
            }
        }
        return temp;
    }

    /**
     * insertar ordenado
     * @param array
     * @param elemento
     * @return
     */
    static int[] insertarOrdenado(int[] array, int elemento){
        Scanner sc=new Scanner(System.in);

        sc.close();

        System.out.println("Indica si el array esta ordenado o no(s/n)");
        
        String opcion = sc.nextLine();

        if(opcion.equals("s") || opcion.equals("S") ){

            for(int i=0; i<array.length; i++){

                if(elemento<array[i]){

                    int[] temp=insertatEnPosicion(array, elemento, i);

                    return temp;
                    
                }
            }
        }
        else if(opcion.equals("n") || opcion.equals("N")){

            ordenar(array);

            for(int i=0; i<array.length; i++){

                if(elemento<array[i]){

                    int[] temp=insertatEnPosicion(array, elemento, i);

                    return temp;
                }
            }
        }

        else{
            return null;
        }
        return null;
    }





    /**
     * elimina el ultimo
     * @param array
     * @return
     */
    static int[] eliminarUltimo(int[] array){
        return Arrays.copyOf(array, array.length-1);
    }



    /**
     * eliminar el primero
     * @param array
     * @return
     */
    static int[] eliminarPrimero(int[] array){
        return Arrays.copyOfRange(array, 1, array.length);
    }

    


    /**
     * eliminar
     * @param array
     * @param elemento
     * @return
     */
    static int[] eliminar(int[] array, int elemento){
        
        int[] temp = array;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] == elemento){
                temp[1] = 0;
            }
        }
        return temp;
    }


    /**
     * ordenar
     * @param array
     */
    static void ordenar(int[] array){
        Arrays.sort(array);
    }


    /**
     * desordenar
     * @param array
     */
    static void desordenar(int[] array){
        for(int i=0; i<array.length; i++){
            int temp=(int)(Math.random()*array.length);
            int previousPos=array[temp];
            array[temp]=array[i];
            array[i]=previousPos;
        }
    }


    /**
     * invertir array
     * @param array
     * @return
     */
    static int[] invertir(int[] array){
        int[] temp=new int[array.length];
        int temp3=array.length-1;
        for(int temp2=0;temp2<temp.length; temp2++){
            temp[temp2]=array[temp3];
            temp3--;
        }
        return temp;
    }


    
    /**
     * imprime el array
     * @param array
     */
    static void imprimir(int[]  array){
        for (int i = 0; i < array.length; i++) {
                System.out.println("-" + array[i]);
            }
        System.out.println();
    }

    /**
     * esta o no ordenado
     * @param array
     * @return
     */
    static Boolean estaOrdenado(int[] array){
        boolean resultado = false; 
        int[] temp = array;
        Arrays.sort(temp);
        
        if (array == temp){
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }



    /**
     * buscar en array
     * @param array
     * @param elemento
     * @return
     */
    static int buscar(int[] array, int elemento){
        int i=-1;
        Boolean temp=false;
        while(i<array.length-1&&temp==false){
            i++;
            if(array[i]==elemento){
                temp=true;
            }
        }

        if(temp==false){
            return -1;
        }
        else{
            return i;
        }
    }

        




























    
    static int[] partirPor(int[] sojos, int posinit, int posfin){
        int[] troll=new int[(posfin+1)-posinit];
        int indexintroll=0;
        for(int i=0; i<sojos.length; i++){
            if(i>=posinit&&i<=posfin){
                troll[indexintroll]=sojos[i];
                indexintroll++;
            }
        }
        return troll;
    }

    static Boolean sonIguales(int[] q, int[] u){
        if(q.length!=u.length){
            return false;
        }
        else{
            int i=0;
            while(i<q.length){
                if(q[i]!=u[i]){
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    static Boolean elementosIguales(int[] cj, int[] bigSmoke, int tenpenny){
        if(tenpenny>cj.length-1||tenpenny>bigSmoke.length-1){
            return false;
        }
        else{
            if(cj[tenpenny]==bigSmoke[tenpenny]){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
