/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;
/**
 *
 * @author Emiliano
 */
public class TestMaquina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Scanner tec = new Scanner(System.in);
        MaquinaDeBebidas mi_maquina = new MaquinaDeBebidas();
	char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	//inicializo la maquina con:
	//  50 euros para cambio
	//  25 botes en cada dispensador
	//  Precio de 0.75 euros por bote
	mi_maquina.IniciarMaquinaDeBebidas(50, 25, 0.75f);

	do 
	{
		mi_maquina.VisualizarMaquina ();
		System.out.println("\nRealice su seleccion (f = apagar maquina) ... ");
		System.out.println("   ('A'=5 cent, 'B'=10 cent, 'C'=20 cent, 'D'=50 cent, 'E'=1 euro, 'R'=devolver monedas)");
		System.out.println("   ('1'=cola, '2'=limon, '3'=naranja, '4'=tonica, '5'=agua)");

		c = (char) br.read();
		mi_maquina.DarOrden ( c );
	}
	while ( ( c != 'f' ) && ( c != 'F' ) );
    }

}
