import java.security.cert.TrustAnchor;

public class PartidoBaloncesto {
    
    //Variables de los equipos
    final static int E1_ACIERTO_2 = 70;
    final static int E2_ACIERTO_2= 75;

    final static int E1_ACIERTO_3 = 45;
    final static int E2_ACIERTO_3 = 35;

    final static int E1_JUEGA_DE_2 = 60;
    final static int E2_JUEGA_DE_2 = 70;

    final static int E1_REBOTE_DEF = 60;
    final static int E1_REBOTE_ATA = 30;

    final static int E2_REBOTE_DEF = 70;
    final static int E2_REBOTE_ATA = 40;

    public static void main(String[] args) {
        
        int puntosE1;
        int puntosE2;

        System.out.println("Empieza la simulación del partido de baloncesto");

        //salto Inicial
        String turno  = salto();
        System.out.println("Ataca el equipo: " + turno);

        //Un partido de baloncesto hay unas 150 posesiones de media.
        for(int posesion = 0; posesion < 150; posesion++)
        {
            int valorAtaque = canasta(turno);
            

            //Si hay canasta entonces el turno es del equipo que estaba defendiendo
            if (valorAtaque>0)
            {
                if (turno.equals("E1"))
                {
                    puntosE1 = actualizarPuntos(puntosE1, valorAtaque);
                }
                else
                {
                    puntosE2 = actualizarPuntos(puntosE2, valorAtaque);
                }

                System.out.println("Canasta de " + turno + " - de " + valorAtaque + " puntos");
                imprimirResultado(puntosE1, puntosE2);
                turno = siguienteTurno(turno);
                System.out.println("Ataca el equipo: " + turno);
            }
            else 
            {
                //no hay canasta, se  produce un rebote
                turno = rebote(turno);
                System.out.println("Rebote del equipo: " + turno);
            }
        }
        System.out.println("-------------------------");
        System.out.println("FIN de partido");
        imprimirResultado(puntosE1, puntosE2);


    }



        //Funciones que necesito programar
        /*
        salto() --> devuelve E1 si el salto lo gana E1 y E2 si el salto lo gana E2
        canasta(turno) --> devuelve el valor de la canasta realizada (0, 2 o 3) 
        actualizarPuntos(valorAcumulado, valorAIncrementar)  
        canasta(tipoTiro, porcentaje) ---> dado un tipo de tiro y el % de acierto devuelve true si hay canasta y false si no     
        tipoTiro() --> devuelve el tipo de tiro que va a realizar el equipo (tiro2 o tiro3)
        tipoTiro(int porcentaje2, int porcentaje3) -> devuelve el tipo de tiro que se produce según los porcentajes indicados
        rebote(String equipoAtaque) ---> devuelve E1 si el rebote lo gana E1 y E2 si el rebote lo gana E2
        rebote(int reboteAtaque, int reboteDefensa) ---> indica true si el rebote es de ataque y false si el rebote es de defensa
              El rebote del equipo atacante es de 0 a maximo y el rebote del equipo que defiende es de 30 al maximo.
        aleatorio(maximo)--> devuelve un numero aleatorio entre 0 y maximo
        aleatorio(minimo, maximo) ---> devuelve un número entre mínimo y máximo
        imprimirResultado(int valor1, int valor2) ---> imprime el resultado actual del partido.
        */
    
    /**
     * SALTO
     * @return
     */
        static String salto(){
            String empieza = "";

            int random = (int)(Math.random()*2);

            if(random > 0){
                empieza = "E1";
            } else {
                empieza = "E2";
            }
            
            return empieza;
        }

    /**
     * CANASTA
     * @return
     */
        static int canasta(String turno){
            int punto = 0;
            int random = (int)(Math.random()*3);
            
            if(random == 0){
                punto = 0;
            }
            if(random == 1){
                punto = 2;
            }
            if(random == 2){
                punto = 3;
            }

            return punto;
            
        }

}