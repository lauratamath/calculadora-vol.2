/**
*@author: Laura Tamath
*@author: Walter Saldana
*@since 24/02/2020
*@version 25/02/2020
**/


import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class Pruebas {

	@Test
	public void testSuma() {
		public void test() {
		Quick test1 = new Quick();
		
		ArrayList<Comparable> datos = new ArrayList<Comparable>();
		ArrayList<Comparable> ordenados = new ArrayList<Comparable>();
		ArrayList<Comparable> esperados = new ArrayList<Comparable>();
		
		ArrayList<String> ordenadoss = new ArrayList<String>();
		ArrayList<String> esperadoss = new ArrayList<String>();

		//Datos desordenados
		datos.add(new Comparable(5));
		datos.add(new Comparable(9));
		datos.add(new Comparable(2));
		datos.add(new Comparable(1));
		
		//Datos esperados
		esperados.add(new Comparable(1));
		esperados.add(new Comparable(2));
		esperados.add(new Comparable(5));
		esperados.add(new Comparable(9));
		
		datos_ordenados = test1.sorting(datos, 4);
		
		for(int i=0; i<datos.size(); i++) {
			ordenadoss.add(datos_ordenados.get(i).toString());
			esperadoss.add(datos_esperados.get(i).toString());
		}
		

		assertEquals(esperadoss, ordenadoss);
	}
	}

	@Test
	public void testResta(){
		public void test() {
		Merge test2 = new Merge();
		
		ArrayList<Comparable> datos = new ArrayList<Comparable>();
		ArrayList<Comparable> ordenados = new ArrayList<Comparable>();
		ArrayList<Comparable> esperados = new ArrayList<Comparable>();
		
		ArrayList<String> ordenadoss = new ArrayList<String>();
		ArrayList<String> esperadoss = new ArrayList<String>();

		//Datos desordenados
		datos.add(new Comparable(5));
		datos.add(new Comparable(9));
		datos.add(new Comparable(2));
		datos.add(new Comparable(1));
		
		//Datos esperados
		esperados.add(new Comparable(1));
		esperados.add(new Comparable(2));
		esperados.add(new Comparable(5));
		esperados.add(new Comparable(9));
		
		datos_ordenados = test2.sorting(datos, 4);
		
		for(int i=0; i<datos.size(); i++) {
			ordenadoss.add(datos_ordenados.get(i).toString());
			esperadoss.add(datos_esperados.get(i).toString());
		}
		

		assertEquals(esperadoss, ordenadoss);
	}
	}


	@Test
	public void test(){
		public void test() {
		Insertion test3 = new Insertion();
		
		ArrayList<Comparable> datos = new ArrayList<Comparable>();
		ArrayList<Comparable> ordenados = new ArrayList<Comparable>();
		ArrayList<Comparable> esperados = new ArrayList<Comparable>();
		
		ArrayList<String> ordenadoss = new ArrayList<String>();
		ArrayList<String> esperadoss = new ArrayList<String>();

		//Datos desordenados
		datos.add(new Comparable(5));
		datos.add(new Comparable(9));
		datos.add(new Comparable(2));
		datos.add(new Comparable(1));
		
		//Datos esperados
		esperados.add(new Comparable(1));
		esperados.add(new Comparable(2));
		esperados.add(new Comparable(5));
		esperados.add(new Comparable(9));
		
		ordenados = test3.sorting(datos, 4);
		
		for(int i=0; i<datos.size(); i++) {
			ordenadoss.add(ordenados.get(i).toString());
			esperadoss.add(esperados.get(i).toString());
		}
		

		assertEquals(esperadoss, ordenadoss);
	}


	@Test
	public void test() {
		Selection test4 = new Selection();
		
		ArrayList<Comparable> datos = new ArrayList<Comparable>();
		ArrayList<Comparable> ordenados = new ArrayList<Comparable>();
		ArrayList<Comparable> esperados = new ArrayList<Comparable>();
		
		ArrayList<String> ordenadoss = new ArrayList<String>();
		ArrayList<String> esperadoss = new ArrayList<String>();

		//Datos desordenados
		datos.add(new Comparable(5));
		datos.add(new Comparable(9));
		datos.add(new Comparable(2));
		datos.add(new Comparable(1));
		
		//Datos esperados
		esperados.add(new Comparable(1));
		esperados.add(new Comparable(2));
		esperados.add(new Comparable(5));
		esperados.add(new Comparable(9));
		
		datos_ordenados = test4.sorting(datos, 4);
		
		for(int i=0; i<datos.size(); i++) {
			ordenadoss.add(ordenados.get(i).toString());
			esperadoss.add(esperados.get(i).toString());
		}
		

		assertEquals(esperadoss, ordenadoss);
	}

	@Test
	public void test() {
		Quick test5 = new Quick();
		
		ArrayList<Comparable> datos = new ArrayList<Comparable>();
		ArrayList<Comparable> ordenados = new ArrayList<Comparable>();
		ArrayList<Comparable> esperados = new ArrayList<Comparable>();

		//Datos desordenados
		datos.add(new Comparable(5));
		datos.add(new Comparable(9));
		datos.add(new Comparable(2));
		datos.add(new Comparable(1));
		
		//Datos esperados
		datos.add(new Comparable(1));
		datos.add(new Comparable(2));
		datos.add(new Comparable(5));
		datos.add(new Comparable(9));
		
		
		ordenados = test5.sorting(datos, 4);
		
		
		assertEquals(esperados, ordenados);
	}

	@Test
	public void test() {
		Radix test6 = new Radix();
		
		ArrayList<Comparable> datos = new ArrayList<Comparable>();
		ArrayList<Comparable> ordenados = new ArrayList<Comparable>();
		ArrayList<Comparable> esperados = new ArrayList<Comparable>();
		
		ArrayList<String> ordenadoss = new ArrayList<String>();
		ArrayList<String> esperadoss = new ArrayList<String>();

		//Datos desordenados
		datos.add(new Comparable(5));
		datos.add(new Comparable(9));
		datos.add(new Comparable(2));
		datos.add(new Comparable(1));
		
		//Datos esperados
		esperados.add(new Comparable(1));
		esperados.add(new Comparable(2));
		esperados.add(new Comparable(5));
		esperados.add(new Comparable(9));
		
		datos_ordenados = test6.sorting(datos, 4);
		
		for(int i=0; i<datos.size(); i++) {
			ordenadoss.add(ordenados.get(i).toString());
			esperadoss.add(esperados.get(i).toString());
		}
		

		assertEquals(esperadoss, ordenadoss);
	}

}
