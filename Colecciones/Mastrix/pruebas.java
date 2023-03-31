package Colecciones.Mastrix;

public class pruebas {
    public static void main(String[] args) {
        
        String[] nombres = {"Juan", "Pedro", "María", "Ana", "Luis", "Carlos", "Sofía", "Lucía", "Elena", "Miguel"};

        System.out.println(nombres.length);

        for (int i = 0; i < 20; i++) {
            int randomNombre = (int)(Math.random()*10);
            System.out.println(randomNombre + " - " + nombres[randomNombre]);
        }
    }

}
