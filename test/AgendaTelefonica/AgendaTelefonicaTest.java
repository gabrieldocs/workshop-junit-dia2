package AgendaTelefonica;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AgendaTelefonicaTest {

	AgendaTelefonica ag;
	Pessoa p1;
	Pessoa p2;
	Pessoa p3;
	Pessoa p4;
	
	@Before
	public void setUp() throws Exception {
		ag = new AgendaTelefonica();
		p1 = new Pessoa("Diego", "5588123456", "diego@email.com");
		p2 = new Pessoa("Leandro", "", "");
		p3 = new Pessoa("Sousa", null, null);
		p4 = new Pessoa("Diego", "5588123456", "diego@@@email.com");
		
		ag.adicionaPessoa(p1);
		ag.adicionaPessoa(p2);
		ag.adicionaPessoa(p3);
		ag.adicionaPessoa(p4);
	}

	@After
	public void tearDown() {
		ag = null;
		p1 = null;
		p2 = null;
		p3 = null;
		p4 = null;
		System.out.println("Limpando objetos...");
	}
	
	@Test
	public void testarLimparAgenda() {
		
		int tamanho = ag.getAgenda().size();
		assertEquals(4, tamanho, 0.001);
		
		ag.limparAgenda();
		tamanho = ag.getAgenda().size();
		assertEquals(0,0);
	}

	
	@Test
	public void testarAdicionarPessoa() {
		Pessoa p5 = new Pessoa("Gustavo", null, null);
		ag.adicionaPessoa(p5);
		
		assertTrue(ag.getAgenda().size() == 5);
	}
	
	@Test
	public void testarEncontrarPessoa() {
		Pessoa p5 = new Pessoa("Gustavo", null, null);
		ag.adicionaPessoa(p5);
		
		Pessoa prova = ag.buscarPessoa(p5);
		assertEquals(prova.getNome(), p5.getNome());
	}
	
	@Test
	public void testarEncontrarPessoaPorEmail() {
		Pessoa p5 = new Pessoa("Alceu", null, "alcel@email.com");
		ag.adicionaPessoa(p5);
		
		Pessoa prova = ag.buscarPessoaEmail(p5.getEmail());
		assertEquals(prova.getEmail(), p5.getEmail());
	}
	

}
