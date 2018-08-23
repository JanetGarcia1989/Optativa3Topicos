package Topicos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSumar {

	@Test
	public void test() {
		Calculadora c = new Calculadora();
		int resultado = c.sumar(2, 3);
		int esperado = 5;
		
		assertEquals(esperado, resultado);
	}

}
