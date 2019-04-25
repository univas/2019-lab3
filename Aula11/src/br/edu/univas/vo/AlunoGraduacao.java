package br.edu.univas.vo;

import java.util.ArrayList;

public class AlunoGraduacao extends Aluno {

	private ArrayList<Integer> notas = new ArrayList<>();
	
	public float mediaGeral() {
		int sum = sumNotas();		
		return sum / notas.size();
	}
	
	public void addNota(Integer nota) {
		notas.add(nota);
	}
	
	@Override
	public boolean estaAprovado() {
		int sum = sumNotas();
		return sum >= 70;
	}
	
	private int sumNotas() {
		int sum = 0;
		
		for (Integer nota : notas) {
			sum += nota;
		}
		
		return sum;
	}

}
