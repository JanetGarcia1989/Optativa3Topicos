package Topicos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;




public class TestSumar {
	Calculadora c;
	
	// Before sirve para no repetir c = new Calculadora();
	
	@Before
	public void before (){
		//System.out.print("before()");
		c = new Calculadora();
	}

	@Test
	public void test() {
		
		int resultado = c.sumar(2, 3);
		int esperado = 5;
		
		assertEquals(esperado, resultado);
	}

}
