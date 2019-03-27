package br.edu.univas.vo;

public class Cachorro extends Animal {
	
	public Cachorro(String raca) {
		super(raca);
		System.out.println("To no construtor do Cachorro!");
	}
	
	public Cachorro(String raca, String cor) {
		super(raca, cor);
	}
	
	public Cachorro(String raca, String cor, float peso) {
		super(raca, cor, peso);
	}
	
	
	public String latir() {
		String latido = "";
		
		for (int i = 0; i < getPeso(); i++) {
			latido += "Au";
		}
		
		return latido;
	}
	
	@Override
	public String toString() {
		String result = super.toString() +
				"\n" + latir();
		return result;
	}
	
}
