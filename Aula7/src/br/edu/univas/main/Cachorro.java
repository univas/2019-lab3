package br.edu.univas.main;

public class Cachorro extends Animal {
	
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
