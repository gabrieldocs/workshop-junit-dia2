package AgendaTelefonica;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PessoaTest {
	Pessoa p1;
	Pessoa p2;
	Pessoa p3;
	Pessoa p4;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		p1 = new Pessoa("Diego", "5588123456", "diego@email.com");
		p2 = new Pessoa("Leandro", "", "");
		p3 = new Pessoa("Sousa", null, null);
		p4 = new Pessoa("Diego", "5588123456", "diego@@@email.com");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testeGetNome() {
		assertFalse(p1.getNome() == "João");
		assertTrue(p1.getNome() != "João");
	}
	
	@Test
	public void testeGetTelefone() {
		assertTrue(p1.getTelefone() == p1.getTelefone());
		assertTrue(p1.getTelefone().equals(p4.getTelefone()));
	}
	
	@Test
	public void testeAdicionarEmail() throws Exception {
		p2.setEmail("pessoa@email.com");
		assertTrue(p2.getEmail().equals("pessoa@email.com"));
		assertTrue(p2.getEmail().contains("@"));
	}
	
	@Test(expected= Exception.class)
	public void testeExcecaoEmail() throws Exception {
		try {
			p2.setEmail("pessoa.email.com");			
		} catch(Exception e) {
			assertTrue(e.getMessage().equals("Email inválido!"));
		}
		
	}

}
