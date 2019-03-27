package br.edu.univas.vo;

public class Animal {
	
	private String raca;
	private String cor;
	private float peso;

	public Animal(String raca) {
		this.raca = raca;
		System.out.println("To no construtor do Animal!");
	}
	
	public Animal(String raca, String cor) {
		this.raca = raca;
		this.cor = cor;
	}
	
	public Animal(String raca, String cor, float peso) {
		this.raca = raca;
		this.cor = cor;
		this.peso = peso;
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		String result = "Raça: " + this.raca +
						"\nCor: " + this.cor +
						"\nPeso: " + this.peso;
		return result;
	}
}
