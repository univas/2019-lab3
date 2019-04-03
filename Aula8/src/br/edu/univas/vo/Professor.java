package br.edu.univas.vo;

public class Professor extends Pessoa implements Pessoa2 {

	private String registro;

	public Professor() {
		System.out.println("Construtor da Classe Professor !!!");
	}
	
	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nRegistro: " + registro;
	}

	@Override
	public String assinar() {
		return this.getNome().toUpperCase();
	}

	@Override
	public int pagar() {
		return 50;
	}
	
}
