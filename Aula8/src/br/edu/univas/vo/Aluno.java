package br.edu.univas.vo;

public class Aluno extends Pessoa implements Pessoa2 {

	private int matricula;
	
	public Aluno() {
		System.out.println("Construtor da Classe Aluno !!!");
	}
	
	public Aluno(int matricula) {
		this.matricula = matricula;
	}
	
	public Aluno(int matricula, String nome) {
		//do nothing!
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String assinar() {
		return this.getNome().toLowerCase();
	}

	@Override
	public int pagar() {
		return 1000;
	}
	
}
