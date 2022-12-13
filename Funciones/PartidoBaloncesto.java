

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
            int random = (int)(Math.random()*101);

            if(punto > 70){
                punto = 0;
            }else{
                if(turno.equals("E1")){
                    if(random > 0 && random < 71){
                        punto = 2;
                    }
                    if(random > 0 && random < 46){
                        punto = 3;
                    }
                } else{
                    if(random > 0 && random < 76){
                        punto = 2;
                    }
                    if(random > 0 && random < 36){
                        punto = 3;
                    }
                }
            }
            return punto;
        }

    /**
     * ACTUALIZAR PUNTOS
     * @param puntosE1
     * @param valorAtaque
     * @return
     */
        static int actualizarPuntos(int puntosE1, int valorAtaque){
            int puntosTotal = puntosE1 + valorAtaque;
            return puntosTotal;
        }
    
    /**
     * IMPRIMIR RESULTADOS
     * @param puntosE1
     * @param puntosE2
     */
        static void imprimirResultado(int puntosE1, int puntosE2){
            System.out.println("---E1: " + puntosE1 + "E1: " + puntosE2 + "---");
        }


        static String siguienteTurno(String turno){
            String turnoCambiado = "";
            if(turno.equals("E1")){
                turnoCambiado = "E2";
            } else
            if(turno.equals("E2")){
                turnoCambiado = "E1";
            }

            return turnoCambiado;
        }


        static void rebote1(){
            int ataqueE1 = (int)(Math.random()*(E1_REBOTE_ATA+1));
            int defensE2 = (int)(Math.random()*(E2_REBOTE_DEF+1));
            int ataqueE2 = (int)(Math.random()*(E2_REBOTE_ATA+1));
            int defensE1 = (int)(Math.random()*(E1_REBOTE_DEF+1));
        }

        static String rebote2(String turno, int ataqueE1,int defensaE1,int ataqueE2,int defensaE2){
            String turnoCopia = turno;
            if(turno.equals("E1")){

                if(ataqueE1 > defensaE2){turno = "E1";} else {turno = "E2";}
            } else
            if(turno.equals("E2")){

                if(ataqueE2 > defensaE1){turno = "E2";} else {turno = "E1";}
            }
            return turno;
        }
        

}