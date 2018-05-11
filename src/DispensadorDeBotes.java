
/**
 *
 * @author Alvaro
 * @version 1.0
 */

class DispensadorDeBotes
{
    private int botes;//Numero actual de botes.
    /* Inicializa el dispensador y pone i botes*/
    /* Entrada: int i, numero de botes en el dispensador*/
    /* Salidas: Ninguna */
    /**
     * 
     * @param i Numero de botes en dispensador.
     */
    public void IniciarDispensadorDeBotes (int i){
        botes = 0;
        botes = i;
    }
    /* Prueba dar un bote, devuelve true si hay botes y falso
       si no hay botes */
    /* Entrada: Ninguna */
    /* Salidas: boolean, true si entrega el bote */
    /**
     * 
     * @return boolean, si puede dar el bote true, si no, false.  
     */
    public boolean PulsarBoton (){
        boolean ok = false;
        if (botes == 0){
            ok = false;
        }
        else{
            botes--;
            ok = true;
        }
        return ok;
    }
    /*Muestra el numero de botes disponibles en el dispensador*/
    /* Entrada: Ninguna */
    /* Salidas: int,  numero de botes */
    /**
     * 
     * @return int Numero de botes en el dispensador. 
     */
    public int BotesDisponibles (){
        return botes;
    }
}

