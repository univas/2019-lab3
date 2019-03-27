package br.edu.univas.main;

public class Animal {
	
	private String raca;
	private String cor;
	private float peso;

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
