package MultiFlix;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultiFlixTest {

	MultiFlix mf;
	String movie1 = "Sonic o Filme";
	String movie2 = "O Senhor dos Anéis: As duas torres";
	String movie3 = "As crônicas de Nárnia";
	String movie4 = "Sonic o Filme 2";
	String movie5 = "Vingadores Ultimato";
	
	@Before
	public void setUp() throws Exception {
		this.mf = new MultiFlix();
	}
	
	@Test
	public void testaSeValorExisteNoMap() {
		
		mf.adicionarFilmeFavoritos(movie1, 5);
		mf.adicionarFilmeFavoritos(movie2, 2);
		mf.adicionarFilmeFavoritos(movie3, 4);
		mf.adicionarFilmeFavoritos(movie4, 5);
		mf.adicionarFilmeFavoritos(movie5, 1);
		
		assertTrue(mf.verificaSeFilmeExiste(movie1));
		assertTrue(mf.verificaSeFilmeExiste(movie4));
		assertTrue(mf.verificaSeFilmeExiste(movie3));
		
	}

}
