package br.edu.univas.controller;

import br.edu.univas.vo.Aluno;

public class ControllerA {

	public static void addInformation(Aluno a) {
		a = new Aluno();
		a.setName("ABC");
		a.setCpf(123);
	}
	
}
