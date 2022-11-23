package Practicas;

public class ManejoPracticas {
    
    public static void main(String[] args) {
        
        String cadena = "En un lugar de la mancha.";



        //CharAt
        int posicion = 3;
        char caracter3 = cadena.charAt(posicion);
        System.out.println("Caracter en 3= "+  caracter3);




        //Comparacion
        String cadena1 = "Hola";
        String cadena2 = "Hola";

        System.out.println((cadena1 == cadena2)? "IGUALES" : "DISTINTAS");
        System.out.println((cadena1.compareTo(cadena2)==0)? "IGUALES": "DISTINTAS");




        //System.out.println(cadena1.compareTo(Cadena2));

        System.out.println("Comparacion ignorando mayusculas = "+ ((cadena1.compareToIgnoreCase(cadena2))==0 ? "Iguales" : "Distintas"));

        cadena1 = "Alfonso";
        cadena2 = "Pepe";
        



        //System.out.println(cadena1.compareTo(cadena2));
        //System.out.println(cadena2.compareTo(cadena1));
        System.out.println(cadena1 + ":" + (cadena1.compareTo(cadena2) > 0 ? "Va despues" : "Va antes") +" de " + cadena2);





        //Longitud de una cadena
        int longitudCadena = cadena.length();

        System.out.println("La cadena contine una longitud: "+ longitudCadena);
        System.out.println("Primer caracter de la cadena: " + cadena.charAt(0));
        System.out.println("Ultimo caracter de la cadena: " + cadena.charAt(longitudCadena -1));





        //Buscar un caracter

        int posicionD = cadena.indexOf('d');
        System.out.println("La posicion= " + posicionD + " es el caracter: " + cadena.charAt(posicionD));





        //Buscar por string; si -1 = no está
        int posicionSubCadena = cadena.indexOf("mancha");
        System.out.println("La subcadena empieza en: " + posicionSubCadena);
        



        //Buscar a partir de una posición y un caracter
        int posicionNSegunda = cadena.indexOf('n', 5);
        System.out.println("La letra N que se encuentra despues de la posición 5 esta en la posición: " + posicionNSegunda);




        //Buscar a partir de una posición y de un String
        int posicionCadenaMancha = cadena.indexOf("mancha", 21);
        System.out.println("La cadena mancha que se encuentra despues de la posicion 21 es: " + posicionCadenaMancha);

        String cadenaMayusculas = cadena.toUpperCase();
        System.out.println(cadenaMayusculas);

        String cadenaMinusculas = cadena.toLowerCase();
        System.out.println(cadenaMinusculas);




        //Reemplazar
        System.out.println(cadena.replace('n', 'f'));
        System.out.println(cadena.replace("mancha", "Mijas"));
        System.out.println(cadena.replaceFirst("un", "otro"));



        //Quitar espacios en blanco al principio y al final
        String contestacion =  "             hola adios     ";
        System.out.println("Copntestacion: "+ contestacion + " Final");
        System.out.println("Copntestacion: "+ contestacion.trim() + " Final");



        //Cortar   [] -> ARRAI   ej: [1,2,3,4,5,6,7,8,9] 
        String[] trozos = cadena.split("de");

        int numeroDeTrozos = trozos.length;
        System.out.println("Lo he partido en: " + numeroDeTrozos + " trozos");

        String trozo1 = trozos[0];
        String trozo2 = trozos[1];
        
        System.out.println("El trozo 1 es: "+ trozo1);
        System.out.println("El trozo 2 es. "+ trozo2);


        
        
        //Cortar cadena
        String subStringDesde5 = cadena.substring(5);
        System.out.println("SubString desde 5: " +subStringDesde5);

        String subStringDesde5Hasta10 = cadena.substring(5,10);
        System.out.println("SubString desde 5 hasta 10: " + subStringDesde5Hasta10);



        //Concatenar +

        String saludo = "Hola";
        String nombre = "Pepe";
        String saludoCompleto = saludo + nombre;
        String SaludoCompelto2 = saludo.concat(nombre);

        System.out.println("Saludo1 es = " + saludoCompleto + ".Saludo2=" + SaludoCompelto2);

        float decimal = 34.5467f;
        String decimalString =String.valueOf(decimal);
        System.out.println(decimalString);




        //StringBuffer -> Modificar y ampliar un string
        StringBuffer sBuffer = new StringBuffer(cadena);
        //Modifica un caracter en una posicion
        sBuffer.setCharAt(1, 'M');
        System.out.println(sBuffer);

        sBuffer.insert(10, "DON QUIJOTE DE LA MANCHA");
        System.out.println(sBuffer);

        sBuffer.append("-FINAL");
        System.out.println(sBuffer);

        System.out.println("Es un diguito 'd'" + Character.isDigit('d'));
        System.out.println("Es un diguito '4'" + Character.isDigit('4'));





    


         

        //Si la posición es un espacio -> muestra "La posición n  es un ESPACIO"
        //SiNO  -> muestra el caracter

    


























    }
}
