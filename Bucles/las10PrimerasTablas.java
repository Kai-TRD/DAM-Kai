package Programacion.Bucles;


public class las10PrimerasTablas {
    public static void main(String[] args) {

        System.out.println("Las 10 primeras tablas");
        int N = 1;
        while(N != 10)
        {
        System.out.println("---------------------------");
            for(int aux = 1;aux <= 10 ; aux++)
            {
                System.out.println(N+"x"+aux+"="+(N*aux));
            }
        N = N+1;
        }
    }
}
