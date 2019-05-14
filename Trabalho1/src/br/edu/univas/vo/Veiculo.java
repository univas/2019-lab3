package br.edu.univas.vo;

public abstract class Veiculo {

	private String marca;
	private String modelo;
	private Motor motor;
	
	public Veiculo(String marca, String modelo, Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}
	
	public abstract void acelerar(int intensidade);
	
	public abstract void freiar(int intensidade);
	
	public abstract void trocaMarcha(int marcha);

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
}
