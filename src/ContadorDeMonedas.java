/**
 *
 * @author iguisado
 */
public class ContadorDeMonedas{
    
    private float cantidad;
    public float disponible;

    public void IniciarContadorDeMonedas(float i){
        disponible=i;
    }
    
    public float Saldo(){
        return cantidad;
    }
    
    public void InsertarMoneda(float m){
        
        this.cantidad+=m;
    }
    
    public float DarCambioDe(float c){
        float cambio;
        cambio=cantidad-c;
        cantidad-=c;
        disponible+=c;
        return cambio;
    }
    
    public float Retornar(){
        System.out.println("Recoja su dinero: "+cantidad);
    	cantidad=0;
        return cantidad;
    }

    
}
