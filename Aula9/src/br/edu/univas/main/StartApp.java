package br.edu.univas.main;

import br.edu.univas.controller.ControllerA;
import br.edu.univas.controller.ControllerB;
import br.edu.univas.vo.Aluno;

public class StartApp {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		System.out.println(aluno);
		Aluno.age = 15;
		//ControllerA.addInformation(aluno);
		
		ControllerA controllerA = new ControllerA();
		controllerA.addInformation(aluno);
		System.out.println(aluno);
		Aluno.age = 51;
		ControllerB controllerB = new ControllerB();
		controllerB.changeInformation(aluno);
		System.out.println(aluno);
	}
	
}
