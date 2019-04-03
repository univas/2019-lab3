package br.edu.univas.vo;

public class Pessoa {

	private String nome;
	private String email;
	private String cpf;
	
	public Pessoa() {
		super();
		System.out.println("Construtor da Classe Pessoa !!! ");
	}

	public void gritar() {
		System.out.println("AHhh");
	}
	
	public void gritar(int intensidade) {
		System.out.println("AHhh" + intensidade);
	}
	
	public void gritar(String pattern) {
		System.out.println("AHhh" + pattern);
	}
	
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	@Override
	public String toString() {
		return "Nome: " + nome +
				"\nE-mail: " + email +
				"\nCPF: " + cpf;
	}
}
