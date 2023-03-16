package examenes.examen1;

import java.util.Scanner;

public class ejercicio1_KailuoWang {
    public static void main(String[] args) {
        

        //PRECIOS
        final double PLATO1 = 5;
        final double PLATO2 = 4;
        final double PLATO3 = 4.5;
        final double PLATO4 = 6;
        final double PLATO5 = 8;
        final double PLATO6 = 9;
        final double PLATO7 = 5;
        final double PLATO8 = 1.5;
        final double PLATO9 = 1.25;
        final double PLATO10 = 2;

        final double DESCUENTO1 = 2;
        final double DESCUENTO2 = 3;
        final double DESCUENTO3 = 5;



        double PLATO1cantidad = 0;
        double PLATO2cantidad = 0;
        double PLATO3cantidad = 0;
        double PLATO4cantidad = 0;
        double PLATO5cantidad = 0;
        double PLATO6cantidad = 0;
        double PLATO7cantidad = 0;
        double PLATO8cantidad = 0;
        double PLATO9cantidad = 0;
        double PLATO10cantidad = 0;

        double precioTotal = 0;

        Boolean salir = false;

        Scanner sc = new Scanner(System.in);
        do {
            //MENU
            System.out.println(" *** RESTAURANTE VEGA DE MIJAS ****");
            System.out.println(" ----------------------------------");
            System.out.println("Primeros platos");
            System.out.println(" 1. Salmorejo (5€)");
            System.out.println(" 2. Sopa picadillo (4€)");
            System.out.println(" 3. Ensalada de atún (4.5€)");
            System.out.println("Segundos platos");
            System.out.println(" 4. Paella (6€)");
            System.out.println(" 5. Salmón (8€)");
            System.out.println(" 6. Codillo al horno (9€)");
            System.out.println(" 7. Lentejas (5€)");
            System.out.println("Postres");
            System.out.println(" 8. Fruta (1.5€)");
            System.out.println(" 9. Café (1.25€)");
            System.out.println("10. Helado (2€)");
            System.out.println();
            System.out.println();
            System.out.println("0. SALIR (Imprimir Ticket + FIN) ");
            System.out.println("Selecciona la opción deseada por el cliente...");
            int opcion = sc.nextInt();
            
            switch(opcion){
                //Seleccion de platos
                //primer plato
                case 1:

                    System.out.println("Salmorejo (5€)");
                    System.out.println("-----------------------");
                    System.out.println("Dime la cantidad: ");
                    PLATO1cantidad = sc.nextInt();
                    precioTotal = precioTotal + (PLATO1 * PLATO1cantidad);

                break;
                case 2:
                
                    System.out.println("Sopa picadillo (4€)");
                    System.out.println("-----------------------");
                    System.out.println("Dime la cantidad: ");
                    PLATO2cantidad = sc.nextInt();
                    precioTotal = precioTotal + (PLATO2 * PLATO2cantidad);

                break;
                case 3:
                            
                    System.out.println("Ensalada de atún (4.5€)");
                    System.out.println("-----------------------");
                    System.out.println("Dime la cantidad: ");
                    PLATO3cantidad = sc.nextInt();
                    precioTotal = precioTotal + (PLATO3 * PLATO3cantidad);

                break;
                
                //segundo plato
                case 4:
                        System.out.println("Paella (6€)");
                        System.out.println("-----------------------");
                        System.out.println("Dime la cantidad: ");
                        PLATO4cantidad = sc.nextInt();
                        precioTotal = precioTotal + (PLATO4 * PLATO4cantidad);
                        if(PLATO4cantidad>1){precioTotal = precioTotal-PLATO4cantidad;}
                break;
                case 5:
                    System.out.println("Salmón (8€)");
                    System.out.println("-----------------------");
                    System.out.println("Dime la cantidad: ");
                    PLATO5cantidad = sc.nextInt();
                    precioTotal = precioTotal + (PLATO5 * PLATO5cantidad);
                    //descuento por pedir mas de dos platos
                    if(PLATO5cantidad>1){precioTotal = precioTotal-PLATO5cantidad;}
                break;
                case 6:
                    System.out.println("Codillo al horno (9€)");
                    System.out.println("-----------------------");
                    System.out.println("Dime la cantidad: ");
                    PLATO6cantidad = sc.nextInt();
                    precioTotal = precioTotal + (PLATO6 * PLATO6cantidad);
                    //descuento por pedir mas de dos platos
                    if(PLATO6cantidad>1){precioTotal = precioTotal-PLATO6cantidad;}
                break;
                case 7:
                    System.out.println("Lentejas (5€)");
                    System.out.println("-----------------------");
                    System.out.println("Dime la cantidad: ");
                    PLATO7cantidad = sc.nextInt();
                    precioTotal = precioTotal + (PLATO7 * PLATO7cantidad);
                    //descuento por pedir mas de dos platos
                    if(PLATO7cantidad>1){precioTotal = precioTotal-PLATO7cantidad;}
                break;

                //postres
                case 8:
                    System.out.println("Fruta (1.5€)");
                    System.out.println("-----------------------");
                    System.out.println("Dime la cantidad: ");
                    PLATO8cantidad = sc.nextInt();
                    precioTotal = precioTotal + (PLATO8 * PLATO8cantidad);
                break;
                case 9:
                    System.out.println("Café (1.25€)");
                    System.out.println("-----------------------");
                    System.out.println("Dime la cantidad: ");
                    PLATO9cantidad = sc.nextInt();
                    precioTotal = precioTotal + (PLATO9 * PLATO9cantidad);
                break;
                case 10:
                    System.out.println("Helado (2€)");
                    System.out.println("-----------------------");
                    System.out.println("Dime la cantidad: ");
                    PLATO10cantidad = sc.nextInt();
                    precioTotal = precioTotal + (PLATO10 * PLATO10cantidad);
                break;

                case 0:
                //IMPRIMIMOS ES MENU
                    System.out.println("-------------------------------");
                    
                    System.out.println("** Primer plato");
                    
                    if (PLATO1cantidad>0){
                        System.out.println("Salmorejo x "+ (int)PLATO1cantidad );
                    }
                    if (PLATO2cantidad>0){
                        System.out.println("Sopa picadillo x "+ (int)PLATO2cantidad );
                    }
                    if (PLATO3cantidad>0){
                        System.out.println("Ensalada de atún x "+ (int)PLATO3cantidad );
                    }


                    System.out.println();                    
                    System.out.println("** Segundos platos");
                    
                    
                    if (PLATO4cantidad>0){
                        System.out.println("Paella x "+ (int)PLATO4cantidad );
                    }
                    if (PLATO5cantidad>0){
                        System.out.println("Salmón x "+ (int)PLATO5cantidad );
                    }
                    if (PLATO6cantidad>0){
                        System.out.println("Codillo al horno x "+ (int)PLATO6cantidad );
                    }
                    if (PLATO7cantidad>0){
                        System.out.println("Lentejas x "+ (int)PLATO7cantidad );
                    }

                    System.out.println();
                    System.out.println("** Postres");

                    
                    if (PLATO8cantidad>0){
                        System.out.println("Fruta x "+ (int)PLATO8cantidad );
                    }
                    if (PLATO9cantidad>0){
                        System.out.println("Café x "+ (int)PLATO9cantidad );
                    }
                    if (PLATO10cantidad>0){
                        System.out.println("Helado x "+ (int)PLATO10cantidad );
                    }
                    
                    System.out.println();
                    //calculamos si tiene o no descuento
                    if(precioTotal >= 20 && precioTotal <=30){
                        precioTotal = precioTotal - DESCUENTO1;
                    }
                    if(precioTotal >= 30 && precioTotal <=50){
                        precioTotal = precioTotal - DESCUENTO2;
                    }
                    if(precioTotal > 50){
                        precioTotal = precioTotal - DESCUENTO3;
                    }

                    System.out.println("TOTAL A PAGAR: "+precioTotal );
                    System.out.println("-------------------------------");
                    salir=true;
                break;

            }
        } while (salir != true);
        sc.close();
    }
}
