import java.util.Scanner;

public class ConanElBarbaro {
    static Scanner sc = new Scanner(System.in);

    // static final int ATAQUE_ESPADA = 80;

        //************ASIGNACIONES**************
            //Vida de Conan
            static final int VIDACONAN = 4;
            static int atkConan = 0;
            static int defConan = 0;
            static String armaConan = "";
            static int partidasGanadas = 0;
            static int partidasPerdidas = 0;

        //*******Zombies**********
        static int numeroZombies = (int)(Math.random()*6+5);
        static final int DEFZOMBIE = 70;
        static final int ATKZOMBIIE = 50;
        static int sumaZombie = 1;

        //*******ARMAS**********
            //Espada de 2 manos
            static final int atkEspada2Manos = 60;
            static final int defEspada2Manos = 40;
            //Hacha
            static final int atkHacha =70;
            static final int defHacha =30;
            //Espada corta y escudo
            static final int atkEspadaMasEscudo = 30;
            static final int defEspadaMasEscudo = 70;


        
    public static void main(String[] args) {

        Boolean volverAJugar = true;

        while(volverAJugar == true){
            volverAJugar = true;

            int elegirArma = menu();

            switch (elegirArma){
                case 1: 
                    atkConan = atkEspada2Manos;
                    defConan = defEspada2Manos;
                    armaConan = "Espada de dos manos";
                    break;
                case 2:
                    atkConan = atkHacha;
                    defConan = defHacha;
                    armaConan = "Hacha";
                    break;
                case 3:
                    atkConan = atkEspadaMasEscudo;
                    defConan = defEspadaMasEscudo;
                    armaConan = "Espada corta con escudo";
                    break;
            }
            int vidaAhoraConan = VIDACONAN;
            System.out.println("El arma elegida es: " + armaConan);


            System.out.println("Hay "+numeroZombies+" Zombies");
            System.out.println(" =========================");
            System.out.println("|| BATALLA               ||");
            System.out.println(" =========================");
            System.out.println("   Partidas ganadas: "+partidasGanadas);
            System.out.println("   Partidas perdidas: "+partidasPerdidas);


                //Combate
                while (numeroZombies > 0 && vidaAhoraConan > 0) 
                    {
                        



                        //Conan ataca
                        // int resultadoAtaque = ataque(atkConan, DEFZOMBIE, "C");
                        
                        // if (resultadoAtaque == 1)
                        // {
                        //     //ataque ha ganado --> zombi muere
                        // }
                        // else if (resultadoAtaque == -1)
                        // {
                        //     //pifia - conan pierde 1 vida
                        // }
                        // else //resultadoAtaque = 0
                        // {
                        //     //no he matado al zombie

                        //     int resultadoAtaqueZombi = ataque(ATKZOMBIIE, defConan, "Z");

                        //     if (resultadoAtaqueZombi == 1)
                        //     {
                        //         //Conan pierde una vida
                        //     }
                        //     else 
                        //     {
                        //         //conan se ha defendido bien
                        //     }

                        // }
                        




                        // turnoConan();
                        // int[] atacaConan = turnoConan();
                        // int[] defiendeZombie = turnoConan();

                        // if (atacaConan[0] > defiendeZombie[1]){
                        //     System.out.println("---Conan mató al zombie---");
                        //     numeroZombies--;
                        //     sumaZombie++;
                        // } 
                        // else
                        // if (defiendeZombie[1] > atacaConan[0]){

                        //     turnoZombie();
                        //     int[] atacaZombie = turnoZombie();
                        //     int[] defiendeConan = turnoZombie();

                        //     if (atacaZombie[0] < defiendeConan[1]){
                        //         System.out.println("---Conan se defendio---");
                        //     }
                        //     if (defiendeConan[1] < atacaZombie[0]){
                        //         System.out.println("^^^^Conan recivio daño^^^^");
                        //         vidaAhoraConan--;
                        //         System.out.println("---------------------------Vida de conan "+vidaAhoraConan);
                        //     }
                        // }
                        turnoConan();
                        turnoZombie();
                    }
                if(vidaAhoraConan > 0){
                    partidasGanadas++;
                    System.out.println("Conan consiguio el tesoro!");
                    System.out.println("-------------------------------------");
                    System.out.println("⠀⠀⠀⠀⠀⠰⠿⠿⠿⢿⣿⣷⣶⣶⣶⣦⣤⣤⣤⣤⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⢰⣶⣦⠀⣶⣤⣤⣤⣤⣍⣉⣉⣉⡙⠛⠛⠛⠛⠏⣰⣿⡆⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⢿⡿⢠⣿⣿⣿⣿⣿⣿⣿⣿⠻⣿⣿⣿⣿⣿⣆⠸⣿⡇⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠘⡇⢸⣿⣿⣿⣿⣿⣿⣿⡏⠀⠹⠟⠙⣿⣿⣿⠄⢻⡇⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠊⣉⡉⢋⣩⡉⠻⠛⠁⣾⣀⣴⡀⢛⡉⢠⣷⠈⠇⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⣠⣼⣿⣿⣿⣿⣿⣷⣿⠀⢿⣿⣿⣿⡿⢁⠚⠛⠃⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠤⠾⠿⣿⡿⠛⣿⣿⣿⣿⣿⣷⣦⣌⣉⣉⣠⣾⡷⠂⣠⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⣿⢰⣶⣶⣶⣦⠀⠀⣤⣌⣉⠉⣉⡙⠛⠛⠛⠻⠟⢁⣴⣾⣿⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⣿⣆⠻⣿⣿⢇⣸⠀⣯⢉⣿⠀⣿⣿⣿⣿⣿⣷⠀⣿⣿⣿⣿⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⣿⣿⣷⡔⠐⣾⣿⠀⠛⠚⠿⠀⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⣿⣿⣿⣿⣶⣿⣿⣿⣿⣿⣶⣶⣿⣿⣿⣿⣿⣿⠀⣿⣿⣿⣿⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⣿⠿⠋⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠰⣦⡄⠀⠀⠈⠉⠉⠉⠉⠛⠛⠛⠛⠻⠿⠿⠿⠿⠀⠛         ");
                } 
                
                else
                if(vidaAhoraConan <= 0){
                    partidasPerdidas++;
                    System.out.println("Conan ha muerto!");
                    System.out.println(" _______________");
                    System.out.println("|               |");
                    System.out.println("|   GAME OVER   |");
                    System.out.println(" _______________");
                }
                System.out.print("¿Quieres volver a jugar?(s/n): ");
                sc.nextLine();
                String preguntaVolverAjugar = sc.nextLine();

                if (preguntaVolverAjugar.equals("n")){volverAJugar = false;}
                
        }
        sc.close();
    }




    // FUNCIONES
    static int menu(){
            System.out.println(" ===============================");
            System.out.println("||   Escoje tu arma            ||");
            System.out.println(" ===============================");
            System.out.println("|| 1. Espada de dos manos      ||");
            System.out.println("||     atk:"+ atkEspada2Manos +"   def:"+defEspada2Manos+"         ||");
            System.out.println("|| 2. Hacha                    ||");
            System.out.println("||     atk:"+atkHacha+"   def:"+defHacha+"         ||");
            System.out.println("|| 3. Espada corta con escudo  ||");
            System.out.println("||     atk:"+atkEspadaMasEscudo+"   def:"+defEspadaMasEscudo+"         ||");
            System.out.println(" ===============================");
            System.out.print("Selecciona una de las opciones: ");
    
            int elegirArma = sc.nextInt();
        return elegirArma;
    }


    
    static int[] ataque(){

        int[] acciones = {0 , 0};

        System.out.println("---------------------Zombie "+sumaZombie);
        //Ataca Conan---------------
        int atacaConan = (int)(Math.random()*atkConan);
        System.out.println("Conan - Ataca - "+atacaConan);
        acciones[0] = atacaConan;
        //Defiende zombie---------------
        int defiendeZombie = (int)(Math.random()*DEFZOMBIE);
        System.out.println("Zombie - Defiende - "+defiendeZombie);
        acciones[1] = defiendeZombie;
        return acciones;
    }



    static int[] turnoConan(){

        int[] acciones = {0 , 0};

        System.out.println("---------------------Zombie "+sumaZombie);
        //Ataca Conan---------------
        int atacaConan = (int)(Math.random()*atkConan);
        System.out.println("Conan - Ataca - "+atacaConan);
        acciones[0] = atacaConan;
        //Defiende zombie---------------
        int defiendeZombie = (int)(Math.random()*DEFZOMBIE);
        System.out.println("Zombie - Defiende - "+defiendeZombie);
        acciones[1] = defiendeZombie;
        return acciones;
    }



    static int[] turnoZombie(){

        int[] acciones = {0 , 0};

        System.out.println("---Zombie se defendio---");
        int atacaZombie = (int)(Math.random()*ATKZOMBIIE);
        System.out.println("Zombie - Ataca - "+atacaZombie);
        acciones[0] = atacaZombie;
        int defiendeConan = (int)(Math.random()*defConan);
        System.out.println("Conan - Defiende - "+defiendeConan);
        acciones[1] = defiendeConan;
        return acciones;
    
    }
}
