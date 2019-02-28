package br.edu.univas.main;

import java.util.Scanner;

public class InputApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// System.out.println("Digite seu nome:");
		// String name = scan.nextLine();
		//
		// System.out.println("Seja bem vindo " + name);
		//
		// System.out.println("Digite sua idade:");
		// int age = scan.nextInt();
		//
		// System.out.println("Você tem " + age + " anos!");

		Aluno[] alunos = new Aluno[3];
		
		for (int i = 0; i < 3; i++) {
			Aluno aluno1 = new Aluno();

			System.out.println("Digite o nome:");
			String name = scan.nextLine();
			aluno1.setName(name);

			System.out.println("Digite sua idade:");
			int age = scan.nextInt();
			aluno1.setAge(age);
			scan.nextLine();

			System.out.println("Digite o CPF:");
			String cpf = scan.nextLine();
			aluno1.setCpf(cpf);

			System.out.println("Digite o e-mail:");
			String email = scan.nextLine();
			aluno1.setEmail(email);

			alunos[i] = aluno1;
		}
		
		System.out.println("\n\n:::Alunos Cadastrados:::\n\n");
		
		for (int i = 0; i < 3; i++) {
			Aluno aluno1 = alunos[i];
			System.out.println("Bem vindo " + aluno1.getName() + " " + aluno1.getEmail() + " " + aluno1.getCpf() + " "
					+ aluno1.getAge());
		}
		

	}

}
