package br.edu.univas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.univas.vo.Cliente;
import br.edu.univas.vo.ClientePF;
import br.edu.univas.vo.ClientePJ;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;

		List<Cliente> clientes = new ArrayList<>();
		do {
			System.out.println("*****MENU*****");
			System.out.println("1 - Cadastrar Pessoa Física");
			System.out.println("2 - Cadastrar Pessoa Jurídica");
			System.out.println("3 - Listar Pessoa Física");
			System.out.println("4 - Listar Pessoa Jurídica");
			System.out.println("9 - Sair");
			
			System.out.println("Por favor, digite sua opção:");
			option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) {
				cadastroPF(clientes, scanner);
			} else if (option == 2) {
				cadastroPJ(clientes, scanner);
			} else if (option == 3) {
				listarPF(clientes);
			} else if (option == 4) {
				listarPJ(clientes);
			} else if (option != 9) {
				System.out.println("Por favor, digite uma opção válida!");
			}
			
		} while (option != 9);
	}

	private static void cadastroPF(List<Cliente> clientes, Scanner scanner) {
		System.out.println("Cadastro de Pessoa Física");
		ClientePF cli = new ClientePF();
		
		System.out.println("Nome:");
		String nome = scanner.nextLine();
		cli.setNome(nome);
		
		System.out.println("E-mail:");
		String email = scanner.nextLine();
		cli.setEmail(email);
		
		System.out.println("Celular:");
		String celular = scanner.nextLine();
		cli.setCelular(celular);

		System.out.println("CPF:");
		int cpf = scanner.nextInt();
		scanner.nextLine();
		cli.setCpf(cpf);

		clientes.add(cli);
	}

	private static void cadastroPJ(List<Cliente> clientes, Scanner scanner) {
		System.out.println("Cadastro de Pessoa Jurídica");
		ClientePJ cli = new ClientePJ();
		
		System.out.println("Nome:");
		String nome = scanner.nextLine();
		cli.setNome(nome);
		
		System.out.println("E-mail:");
		String email = scanner.nextLine();
		cli.setEmail(email);
		
		System.out.println("Celular:");
		String celular = scanner.nextLine();
		cli.setCelular(celular);

		System.out.println("CNPJ:");
		int cnpj = scanner.nextInt();
		scanner.nextLine();
		cli.setCnpj(cnpj);

		clientes.add(cli);
	}

	private static void listarPF(List<Cliente> clientes) {
		for (Cliente cli : clientes) {
			if (cli instanceof ClientePF) {
				ClientePF pf = (ClientePF) cli;
				System.out.println("*************************");
				System.out.println(pf);
				System.out.println("*************************");
			}
		}
	}

	private static void listarPJ(List<Cliente> clientes) {
		for (Cliente cli : clientes) {
			if (cli instanceof ClientePJ) {
				ClientePJ pj = (ClientePJ) cli;
				System.out.println("*************************");
				System.out.println(pj);
				System.out.println("*************************");
			}
		}
	}

}
