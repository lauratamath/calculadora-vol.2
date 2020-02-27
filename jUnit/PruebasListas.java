/**
*@author: Laura Tamath
*@author: Walter Saldana
*@since 24/02/2020
*@version 25/02/2020
**/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**********************************************************
*ListaTest.java					Fecha de creación: 23/02/2020
*							Última fecha de modificación: 
*							
*Prueba Unitaria
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
public class PruebasListas {
	CircularList<Integer> test = new CircularList<Integer>();
	@Test
	public void add() {
        test.addFirst(5);
        test.addFirst(21);
        test.addFirst(30);

        int resul = test.removeLast();
        System.out.println(resul);
        assertEquals(resul, 41);
    }

}
