package br.edu.univas.vo;

public class Aluno {
	
	public static int age = 9;
	
	private String name;
	
	private int cpf;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return this.name + " - " + this.cpf 
				+ " - " + this.age;
	}
	
}
