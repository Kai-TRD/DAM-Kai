public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Gatos~!");
        System.out.println("------------------");
    
    
        Gato gato1 = new Gato("Garfiel", "Americano", "macho");
        Gato gato2 = new Gato("Lisa", "Americano", "hembra");
        Gato gato3 = new Gato("Leo", "Siberiano", "macho");
        Gato gato4 = new Gato("Whiskers", "British Shorthair", "hembra");
        Gato gato5 = new Gato("Mittens", "Siamés", "macho");
        Gato gato6 = new Gato("Luna", "Persa", "hembra");


        Gato cria1 = gato1.apareaCon(gato4);
        System.out.println(cria1);
    
        Gato cria2 = gato1.apareaCon(gato3);
        System.out.println(cria2);
    }
}
