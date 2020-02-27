/**
*@author: Laura Tamath
*@author: Walter Saldana
*@since 24/02/2020
*@version 25/02/2020
**/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**********************************************************
*Calcutest.java					Fecha de creación: 23/02/2020
*							Última fecha de modificación: 
*							
*Prueba Unitaria
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
 class CalculadoraTest {

	@Test
	void test() {
		Calculadora prueba = new Calculadora();
		
		int num1 = 10;
		int num2 = 20;
		
		int respuesta = prueba.sumal(num1, num2); 
		
		assertEquals(30, respuesta);
	}

}
