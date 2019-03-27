package br.edu.univas.vo;

public class Gato extends Animal {

	public Gato(String raca) {
		super(raca);
		System.out.println("To no construtor do Gato");
	}
	
	public Gato(String raca, String cor) {
		super(raca, cor);
	}
	
	public Gato(String raca, String cor, float peso) {
		super(raca, cor, peso);
	}
	
	public String miar() {
		String miado = "";
		
		for (int i = 0; i < getPeso(); i++) {
			miado += "Miau";
		}
		
		return miado;
	}
	
	@Override
	public String toString() {
		String result = super.toString() +
				"\n" + miar();
		return result;
	}
	
}
