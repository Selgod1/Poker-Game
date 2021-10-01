public class Jugadores {
    /**
     * Clase que genera a los jugadores, y gestiona las cartas y las fichas de los jugadores
     */
   
    private int fichas;
    //mano de cartas del jugador
    private String[] mano = new String[5];
    //Contraseña para ver la mano del jugador
    private String contrasena;
    //Variable que será utilizada en el método que da una carta al jugador
    int checkearMano = 0;
    //Variable para algunos ciclos
    int i = 0;
    /**
     * Constructor que genera los jugadores
     * @param cada jugador debe establecer una contraseña para ver sus cartas
     */
    public Jugadores(String contrasena){
        this.contrasena= contrasena;
        //cada jugador empieza con 100 fichas
        this.fichas = 100;
    }
    /**
     * Método que añade 1 carta al mazo del jugador, si el mazo está lleno no hacer nada
     * @param carta recibida
     */
    public void darCarta(String carta){
        //variable para contar los espacios ocupados de la mano hasta encontrar un espacio vacío
        //para recibir la nueva carta
        checkearMano = 0;
        //Ciclo que cuenta los espacios ocupados por cartas hasta encontrar
        //un espacio vacío para recibir la nueva carta
        //El ciclo se detiene cuando se encuentra un espacio vacío o se recorre
        //toda la lista
        while (checkearMano<5 && mano[checkearMano] != null ){
            checkearMano++;
        }
        //Si los 5 espacios están ocupados, no se recibe la carta
        if (checkearMano < 5){
            mano[checkearMano]=carta;
        }
       
       
        }
    /**
     * Método que permite quitarle 1 carta al jugador
     * @param Permite determinar cual de las cartas quitar o descartar
     */    
    public String quitarCarta(int posicionCarta){
        //Se resta 1 a la posición porque los arreglos inician en 0
        String carta= mano[posicionCarta-1];
        //Deja un espacio vacío en la mano del jugador
        mano[posicionCarta-1]= null;
        return carta;
       
    }
    /**
     * Método que imprime las cartas de la mano del jugador, si la contraseña
     * es igual a la contraseña inicialmente establecida para el jugador,
     * imprime las cartas, sino no
     * @param recibe una contraseña para compararla con la del jugador
     *
     */
    public void verMano(String contrasena){
        if (contrasena== this.contrasena){
        //Recorre el arreglo de la mano e imprime cada una de las cartas    
        while (i<5){
            System.out.println (mano[i]);
            i++;
        }
       
        }
        //Se reinicia i en 0 para ciclos posteriores
        i=0;
    }
    /**
     * Método que suma fichas al jugador
     * @param cantidad de fichas a sumar
     */
    public void darFichas(int cantidadFichas){
        fichas = fichas+ cantidadFichas;
    }
    /**
     *
     *Método que resta fichas al jugador, y devuelve el valor de las fichas restadas
     *@param cantidad de fichas a restar
     */
    public int quitarFichas(int cantidadFichas){
        fichas = fichas - cantidadFichas;
        return cantidadFichas;
    }
    /**
     * Método que checkea si un jugador se quedó sin fichas
     * @return Si se quedó sin fichas, devuelve true, sino, false
     */
    public boolean perdio(){
        //Contempla casos de números negativos por si acaso
        if(fichas<=0){
            return true;
        }
        return false;
    }
    /*public void llenar(){
        mano[0] = "a";
        mano[1] = "a";
        mano[2] = "a";
        mano[3] = "a";
        //mano[4] = "a";
       
    }*/
   
   
}
