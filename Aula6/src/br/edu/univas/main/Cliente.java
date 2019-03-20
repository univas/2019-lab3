package br.edu.univas.main;

public class Cliente {

	private String nome;
	
	private String email;
	
	private String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome +
				"\nE-mail: " + this.email +
				"\nTelefone: " + this.telefone;
	}
	
}
