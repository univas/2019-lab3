package br.edu.univas.vo;

import java.util.ArrayList;

public class AlunoPos extends Aluno implements Pesquisador {

	private ArrayList<Character> conceitos = new ArrayList<>();
	
	public char conceitoGeral() {
		int conceitoA = 0;
		int conceitoB = 0;
		
		for (Character conceito : conceitos) {
			if (conceito == 'A') {
				conceitoA++;
			} else if (conceito == 'B') {
				conceitoB++;
			} else if (conceito != 'C') {
				return 'D';
			}
		}
		
		if (conceitoA == conceitos.size()) {
			return 'A';
		}
		
		float half = conceitos.size() / 2.0f;
		
		if (conceitoB >= half) {
			return 'B';
		}
		
		return 'C';
	}
	
	public void addConceito(Character conceito) {
		conceitos.add(conceito);
	}
	
	@Override
	public int calcularConceito() {
		char mediaGeral = conceitoGeral();
		
		switch (mediaGeral) {
		case 'A': return 90;
		case 'B': return 75;
		case 'C': return 50;
		default:
			return 0;
		}
	}

	@Override
	public boolean estaAprovado() {
		char mediaGeral = conceitoGeral();
		return mediaGeral == 'A' || mediaGeral == 'B';
	}

}
