                


/*

        _______________________________________________________________________
       /______________________________________________________________________/|
      |                                                                      | |
      | Cuaderno de:                                                      () | |
      |     __________       _____      ____      ____        _____          | |
      |    |          |     /     \    |    |    |    |      /     \         | |
      |    |______    |    /       \   |    |    |    |     /       \     () | |
      |           |   |   /    _    \  |    |    |    |    /    _    \       | |
      |  ___      |   |  /    / \    \ |    \    /    |   /    / \    \      | |
      |  \   \    /   /  |   |___|   |  \    \  /    /    |   |___|   |      | |
      |   \   \__/   /   |    ___    |   \    \/    /     |    ___    |   () | |
      |    \        /    |   |   |   |    \        /      |   |   |   |      | |
      |     \______/     |___|   |___|     \______/       |___|   |___|      | |
      |                                                                   () | |
      |______________________________________________________________________|/


         __________________________________
        |    _____    __    _  _    __     |
        |   |___  |  /  \  | || |  /  \    |
        |    _  | | | [] | | || | | [] |   |
        |   | \_/ / | __ | \ \/ / | __ |   |
        |    \___/  |_||_|  \__/  |_||_|   |
        |__________________________________|



        Problema Principal ---> Pedir Datos ---> Hacer cálculos ---> Mostrar en pantalla
                                     |                  |
                                     V                  V
                                  -scanner         se puede descomponer
                                  -printnl         en varios cálculos





        Reglas para nombrar
        -------------------

        CONSTANTES (Final) -> IVA, IVA2, MATORIA_EDAD, etc...

        CLASES -> FacturaTotal (con las dos iniciales en MAYUS)

        VARIABLE -> nombreAlumno (primera inicial minus y la segunda inicial MAYUS)





        sout = System.out.println();
        sc.nextLine(); = limpia el buffer de datos


        Tipos de variables
        ------------------
        string  ->      string "nombre" =sc.nextLine();  = para letras
        floar   ->      float "nombre" =sc.nextFloar();  = para decimales
        int     ->      int "nombre" =sc.nextInt();      = numeros enteros


        Booleanos
        ---------
        && = AND
        || = OR
        !  = NEGACIÓN !True=False / !False=True


        Operador ternario
        -----------------


                        "expresion booleana ? "operador1 : operador2"
                                               |_______|   |_______|
                                                   |           |
                                                  true       false


                
        >   = mayor que
        <   = menor que
        >=  = mayor o igual
        <=  = menor que
        ==  = igual operacionar
        =   = igualar
        %   = saca el  de una división resto
              
                numero1 % 2 = saca el resto al dividirlo en 2


        Comentarios
        -----------
        //  = comentario
        /*  = comentario de bloque
        
        
        Escaner
        -------
        Scanner sc = new Scanner(System.in);    = abrir escaner
        sc.close();                             = cerrar escaner

        String/floar/int nombre =sc.nextLine(); = para leer letras
        String/floar/int nombre =sc.nextInt(); = para leer letras






        \n = salto de línea
        poner \ delante de un caracter especial para poder imp








        texto.lenghz();   = devuelve el nº de caracteres de "texto"
        texto.substring(x, y):   =corta "texto" desde una posición x a una posición y
        texto.replace(x, y)   = remplaza el caracter x del "texto" por y
        texto.indexOf(x);     = de texto, nos busca x y nos devuelve la posición
       
       
       
        String[] frases = cadena.split("\\.");         =[]me guarda las frases en numeros empezando desde 0, split es para
                                                        separar desde un caracter, en este cado un . que se indica con \\.
        int posicionInt = Character.getNumericValue(x); = ponerle una variale el valor de x(String) pero pasado a Int 

        boolean digito = Character.isDigit(caracter);              = true o false si es un digito
        boolean espacio = Character.isSpaceChar(caracter);         = true o false si es un espacio
        boolean mayuscula = Character.isUpperCase(caracter);       = true o false si es mayuscula

*/



