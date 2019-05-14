package br.edu.univas.vo;

public class Motor {

	private int marchaAtual;
	private int potencia;
	private int velocidade;
	
	public Motor(int potencia) {
		this.potencia = potencia;
	}
	
	public void trocaMarcha(int marcha) {
		this.marchaAtual = marcha;
	}

	public int getMarchaAtual() {
		return marchaAtual;
	}

	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
}
