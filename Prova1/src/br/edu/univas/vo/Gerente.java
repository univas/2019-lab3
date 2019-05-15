package br.edu.univas.vo;

import java.util.ArrayList;

public class Gerente {
	
	private ArrayList<Conta> contas = new ArrayList<>();
	
	public void addConta(Conta conta) {
		contas.add(conta);
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
}
