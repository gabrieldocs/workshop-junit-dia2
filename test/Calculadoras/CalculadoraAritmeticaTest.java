package Calculadoras;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraAritmeticaTest {
	
	protected CalculadoraAritmetica calc;
	
	@BeforeClass
	public void setUp() throws Exception {
		calc = new CalculadoraAritmetica();
	}

	@AfterClass
	public void tearDown() throws Exception {
		calc = null;
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
	public void deveSomarDoisNumerosIguais() {
		assertEquals(4, calc.somar(2, 2), 0.001);
	}
	
	@Test
	public void deveSomarDoisNumerosDiferentes() {
		assertEquals(5, calc.somar(2, 3), 0.001);
	}
	
	@Test
	public void deveSubtrairDoisNUmeros() {
		assertEquals(0, calc.subtrair(2, 2), 0.001);
	}
	
	@Test
	public void deveSubtrairDoisNumerosDiferentes() {
		assertEquals(-1, calc.subtrair(2, 3), 0.001);
	}
	
	@Test
	public void deveMultiplicarDoisNumerosIguais() {
		assertEquals(4, calc.multiplicar(2,2), 0.001);
	}
	
	@Test
	public void deveMultiplicarDoisNUmerosDiferentes() {
		assertEquals(8, calc.multiplicar(2,4), 0.001);
	}
	
	@Test
	public void deveDividirDoisNumeros() {
		assertEquals(1, calc.dividir(8,8), 0.001);
	}
	
	@Test
	public void deveDividirDoisNumerosDiferentes() {
		assertEquals(4, calc.dividir(8,2), 0.001);
	}
	
	
	@Test(expected= ArithmeticException.class)
	public void deveDividirUmNumeroPorZero() {
		calc.dividir(0, 0);
	}
	
}
