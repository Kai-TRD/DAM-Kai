package masEjerciciosDeBucles;
import java.util.Scanner;

public class tandaDePenaltis {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cantidadPenaltis = 5;
        String puntuacionJugador = "";
        int numGolJugador = 0;
        String puntuacionCPU = "";
        int numGolCPU = 0;

        int turno = 1;
        int valorMenosJugador = 0;
        int valorMenosCPU = 0;

        System.out.println("¿Cual es tu nombre?...");
        String nombre = sc.nextLine();
        System.out.println("");
        System.out.println("EMPIEZA LA TANDA DE PANALTIS");
        System.out.println("============================");
        do{
            System.out.println("TURNO "+ turno);
            // char[] caracteres =puntuacion.toCharArray();
            System.out.print(nombre + " "+ "\t" + puntuacionJugador);
            for (int i = 0; i < 5-valorMenosJugador; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.print("CPU "+ "\t" + puntuacionCPU);
            for (int i = 0; i < 5-valorMenosCPU; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.println(nombre + " tira (I (izquierda), D (derecha) o C (centro))");
            String direccionPelota = sc.nextLine();
            int internDireccion = 0;
            switch(direccionPelota){
                case "I":
                    internDireccion = 1;
                break;
                case "D":
                    internDireccion = 2;
                break;
                case "C":
                    internDireccion = 3;
                break;
            }


            int defensaCPU = (int)(Math.random()*3+1);

            if (defensaCPU == internDireccion){

                int probFueraPenalti = (int)((Math.random()*99)+1);
                //System.out.println("fuera penalti------------------------------------"+ probFueraPenalti);
                if(probFueraPenalti<=20){
                    System.out.println("-FUERA PENALTI-");
                
                    puntuacionJugador = puntuacionJugador + "0";
                    valorMenosJugador++;
                } else {
                    System.out.println("-GOL-");
                    numGolJugador++;
                    puntuacionJugador = puntuacionJugador + "X";
                    valorMenosJugador++;
                }
            }
            if (defensaCPU != internDireccion){
                System.out.println("-PARADA-");
                
                puntuacionJugador = puntuacionJugador + "0";
                valorMenosJugador++;
            }

            System.out.print(nombre + " "+ "\t" + puntuacionJugador);
            for (int i = 0; i < 5-valorMenosJugador; i++) {
                System.out.print("-");
            }   
            System.out.println();
            System.out.print("CPU "+ "\t" + puntuacionCPU);
            for (int i = 0; i < 5-valorMenosCPU; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.println(nombre +" defiende (I (izquierda), D (derecha) o C (centro))");
            direccionPelota = sc.nextLine();
            internDireccion = 0;
            switch(direccionPelota){
                case "I":
                    internDireccion = 1;
                break;
                case "D":
                    internDireccion = 2;
                break;
                case "C":
                    internDireccion = 3;
                break;
            }

            defensaCPU = (int)(Math.random()*3+1);

            if (defensaCPU == internDireccion){

                int probFueraPenalti = (int)((Math.random()*99)+1);
                //System.out.println("----------------------------------------------------------------------"+ probFueraPenalti);
                if(probFueraPenalti<=20){
                    System.out.println("-FUERA PENALTI-");
                    
                    puntuacionJugador = puntuacionJugador + "0";
                    valorMenosJugador++;
                } else {
                    System.out.println("-GOL-");
                    numGolCPU++;
                    puntuacionCPU = puntuacionCPU + "X";
                    valorMenosCPU++;
                }
            }

            if (defensaCPU != internDireccion){
                System.out.println("-PARADA-");
                
                puntuacionCPU = puntuacionCPU + "0";
                valorMenosCPU++;
            }
            cantidadPenaltis--;
            turno++;
            if ( cantidadPenaltis == 0 && numGolJugador == numGolCPU){
                cantidadPenaltis++;
            }
            
        }while (cantidadPenaltis !=0);
    
        System.out.println("========================");


        if (numGolJugador > numGolCPU){
            System.out.println("--Gana " + nombre+"--");
        }
        if (numGolJugador < numGolCPU){
            System.out.println("--Gana CPU--");
        }
        


        System.out.print(nombre + " "+ "\t" + puntuacionJugador);
        for (int i = 0; i < 5-valorMenosJugador; i++) {
            System.out.print("-");
        }
        System.out.println("("+numGolJugador+")");
        System.out.println();
        System.out.print("CPU "+ "\t" + puntuacionCPU);
        for (int i = 0; i < 5-valorMenosCPU; i++) {
            System.out.print("-");
        }
        System.out.println("("+numGolCPU+")");
        System.out.println();
        sc.close();
    }
}
