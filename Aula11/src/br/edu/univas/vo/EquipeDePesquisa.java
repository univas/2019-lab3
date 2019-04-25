package br.edu.univas.vo;

import java.util.ArrayList;

public class EquipeDePesquisa {

	private ArrayList<Pesquisador> membros = new ArrayList<>();
	
	public void addMembro(Pesquisador pesquisador) {
		membros.add(pesquisador);
	}
	
	public int calcularConceitoGeral() {
		int conceitoGeral = 0;
		
		for (Pesquisador pesquisador : membros) {
			conceitoGeral += pesquisador.calcularConceito();
		}
		
		return conceitoGeral;
	}
	
}
