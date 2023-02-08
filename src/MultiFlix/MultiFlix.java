package MultiFlix;

import java.util.HashMap;
import java.util.Map;

public class MultiFlix {
	protected Map<String, Integer> filmes_favoritos;
	
	MultiFlix() {
		this.filmes_favoritos = new HashMap<String, Integer>();
	}
	
	public void adicionarFilmeFavoritos(String nome, int nota) {
		this.filmes_favoritos.put(nome, nota);
	}
	
	public Boolean verificaSeFilmeExiste(String chave) {
		return this.filmes_favoritos.containsKey(chave);
	}
	
	public void atualizaDadoDoFilme(String nome, int nota) {
		this.filmes_favoritos.put(nome, nota);
	}
	
	public int buscaNotaFilme(String filme) {
		return this.filmes_favoritos.get(filme);
	}
	
	public void removeFavorito(String nome) {
		this.filmes_favoritos.remove(nome);
	}
}
