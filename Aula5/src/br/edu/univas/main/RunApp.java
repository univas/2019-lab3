package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

public class RunApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Disciplina> disciplinas = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			Disciplina disciplina = new Disciplina();
			
			System.out.println("Digite o nome da disciplina:");
			//String name = scanner.nextLine();
			//disciplina.setName(name);
			disciplina.setName(scanner.nextLine());
			
			System.out.println("Digite o nome do professor:");
			String teacherName = scanner.nextLine();
			disciplina.setTeacher(teacherName);
			
			disciplinas.add(disciplina);
		}
		
		Aluno aluno1 = new Aluno();
		aluno1.setDisciplinas(disciplinas);
		
		System.out.println("Digite o nome do aluno:");
		aluno1.setName(scanner.nextLine());
		
		System.out.println("Digite o e-mail do aluno:");
		aluno1.setEmail(scanner.nextLine());
		
		System.out.println("Dados do aluno: " + aluno1.printData());
	}
	
}
