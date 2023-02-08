package AgendaTelefonica;

public class Pessoa {
	private String nome;
	private String telefone;
	private String email;
	
	Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	Pessoa(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setEmail(String email) throws Exception{
		if(email.contains("@")) {
			this.email = email;
		} else {
			throw new Exception("Email inválido!");
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public String getEmail() {
		return this.email;
	}
}

