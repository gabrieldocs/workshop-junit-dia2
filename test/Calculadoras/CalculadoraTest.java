package Calculadoras;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;



public class CalculadoraTest {

	Calculadora c;
	Float a;
	Float d;
	
	
	@Before
	public void setUp() {
		this.c = new Calculadora();
		this.a = (float) 6.1;
		this.d = (float) 4.1;
	}
	
	@Before
	public void antes() {
		System.out.println("Antes do teste...");
	}
	
	@After
	public void depois() {
		System.out.println("Depois do teste...");
	}
	
	@Test
	public void teste2() {
		assertTrue(true);
	}
	
	@Test
	public void teste3() {
		double c = 10;
		double d = 10;
		
		assertEquals(c,d, 0.001);
		assertTrue(c == d);
	}
	
	@Test
	public void testSomar() {
		
		assertEquals(10.2, c.somar(a,d), 0.001);
	}
	
	

}
