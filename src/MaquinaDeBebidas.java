class MaquinaDeBebidas {
    private ContadorDeMonedas contador; //Contador de monedas de la maquina
    private DispensadorDeBotes cola, //Cinco dispensadores de botes
            limon,
            naranja,
            tonica,
            agua;
    private float precio; //Precio de las bebidas
    
    /*Inicia la maquina y los elementos asociados
    Entradas: float m, cantidad inicial de monedas para el cambio
    int b, cantidad inicial de botes
    float pvp,precio bebidas
    Salidas: Ninguna
    */
    
    public void IniciarMaquinaDeBebidas (float m, int b, float pvp){
        contador = m;
        cola = b;
        limon = b;
        naranja = b;
        tonica = b;
        agua = b;
        precio = pvp;
        System.out.print("Maquina encendida");
    }
    
    /*Responder a una accion del usuario.Discrimina el tipo de accion y utiliza las operaciones privadas
    Entradas: char o, la orden
    Salidas: Ninguna
    */
    
    public void DarOrden(char o) {
        switch (o) {
            case 'A' :
                
            case 'B' :
                
            case 'C' :  
                
            case 'D' :
                
            case 'E' :
                
            case 'R' :  
                OrdenMonedas(o);
                break;
            case '1' :
                
            case '2' :
                
            case '3' :
                
            case '4' :
                
            case '5' :
                OrdenSeleccion(o);
                break;
            default : System.out.println("Caracter no valido");
                break;
        }
    }
    
    /*Visualiza la informacion de interes sobre la maquina
    Botes en cada dispensador, precio, saldo cliente
    Entradas: Ninguna
    Salidas: Ninguna;
    */
    
    public void VisualizarMaquina() {
        System.out.print(contador);
        System.out.print(cola);
        System.out.print(limon);
        System.out.print(naranja);
        System.out.print(tonica);
        System.out.print(agua);
        System.out.print(precio);
    }
    
    /*Realiza las acciones relacionadas con la introduccion de monedas
    Entradas: char o, la orden
    Salidas: Ninguna
    */
    
    private void OrdenMonedas (char o) {
        switch (o) {
            case 'A' :
                InsertarMoneda(0.05);
                break;
            case 'B' :  
                InsertarMoneda(0.10);
                break;
            case 'C' :
                InsertarMoneda(0.20);
                break;
            case 'D' :
                InsertarMoneda(0.50);
                break;
            case 'E' :
                InsertarMoneda(1);
                break;
            case 'R' :
                Retornar();
                break;
            default : System.out.println("Caracter no valido");     
        }
        
    }
    
    /*Realiza las acciones relacionadas con la seleccion de una bebida
    Entradas: char o, la orden
    Salidas: Ninguna
    */
    
    private void OrdenSeleccion (char o) {
        switch (o) {
            case '1' :
                PulsarBoton(1);
                break;
            case '2' :
                PulsarBoton(2);
                break;
            case '3' :
                PulsarBoton(3);
                break;
            case '4' :
                PulsarBoton(4);
                break;
            case '5' :
                PulsarBoton(5);
                break;
            default : System.out.println("Numero no valido");     
        }
    }
}