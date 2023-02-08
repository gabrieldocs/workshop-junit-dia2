package AgendaTelefonica;

import java.util.ArrayList;

public class AgendaTelefonica {
	protected ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
	
	public void adicionaPessoa(Pessoa p) {
		this.agenda.add(p);
	}
	
	public void removePessoa(Pessoa p) {
		int index = 0;
		int iterator = 0;
		
		for(iterator=0; iterator < this.agenda.size(); iterator++) {
			if(this.agenda.get(iterator).getNome() == p.getNome()) {
				index = iterator;
			}
		}
		
		this.agenda.remove(index);
	}
	
	public Pessoa buscarPessoa(Pessoa p) {
		int index = 0;
		int iterator = 0;
		
		for(iterator=0; iterator < this.agenda.size(); iterator++) {
			if(this.agenda.get(iterator).getNome() == p.getNome()) {
				index = iterator;
			}
		}
		
		return this.agenda.get(index);
	}
	
	public Pessoa buscarPessoaEmail(String email) {
		int index = 0;
		int iterator = 0;
		
		for(iterator=0; iterator < this.agenda.size(); iterator++) {
			if(this.agenda.get(iterator).getEmail() == email) {
				index = iterator;
			}
		}
		
		return this.agenda.get(index);
	}
	
	public void adicionaPessoas(ArrayList<Pessoa> p) {
		this.agenda.addAll(p);
	}
	
	public void criaPessoaEAdicionaNaAgenda() {
		Pessoa p = new Pessoa("Lucas", "lucas@email.com");
		this.agenda.add(p);
	}
	
	public ArrayList<Pessoa> getAgenda() {
		return this.agenda;
	}
	
	public void limparAgenda() {
		this.agenda.clear();
	}
	
	
}
