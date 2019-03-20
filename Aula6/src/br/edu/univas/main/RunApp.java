package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

public class RunApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de clientes pessoa fisica:");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		
		ArrayList<ClientePessoaFisica> clientes = new ArrayList<>(quantity);
		
		for (int i = 0; i < quantity; i++) {
			ClientePessoaFisica cliente = new ClientePessoaFisica();
			System.out.println("Cadastro do cliente "+ (i + 1));
			
			System.out.println("Digite o nome: ");
			String nome = scanner.nextLine();
			cliente.setNome(nome);

			System.out.println("Digite o e-mail: ");
			String email = scanner.nextLine();
			cliente.setEmail(email);
			
			System.out.println("Digite o telefone: ");
			String telefone = scanner.nextLine();
			cliente.setTelefone(telefone);
			
			System.out.println("Digite o CPF: ");
			int cpf = scanner.nextInt();
			cliente.setCpf(cpf);
			scanner.nextLine();
			
			clientes.add(cliente);
		}
		
		for (int i = 0; i < quantity; i++) {
			ClientePessoaFisica cli = clientes.get(i);
			System.out.println("Nome: " + cli.getNome());
			System.out.println("E-mail: " + cli.getEmail());
			System.out.println("Telefone: " + cli.getTelefone());
			System.out.println("CPF: " + cli.getCpf());
		}
		
		System.out.println("Digite a quantidade de clientes pessoa juridica:");
		quantity = scanner.nextInt();
		scanner.nextLine();
		
		ArrayList<ClientePessoaJuridica> clientesPJ = new ArrayList<>(quantity);
		
		for (int i = 0; i < quantity; i++) {
			ClientePessoaJuridica cliente = new ClientePessoaJuridica();
			System.out.println("Cadastro do cliente "+ (i + 1));
			
			System.out.println("Digite o nome: ");
			String nome = scanner.nextLine();
			cliente.setNome(nome);

			System.out.println("Digite o e-mail: ");
			String email = scanner.nextLine();
			cliente.setEmail(email);
			
			System.out.println("Digite o telefone: ");
			String telefone = scanner.nextLine();
			cliente.setTelefone(telefone);
			
			System.out.println("Digite o CNPJ: ");
			int cnpj = scanner.nextInt();
			cliente.setCnpj(cnpj);
			scanner.nextLine();
			
			clientesPJ.add(cliente);
		}
		
		for (int i = 0; i < quantity; i++) {
			ClientePessoaJuridica cli = clientesPJ.get(i);
			System.out.println("Nome: " + cli.getNome());
			System.out.println("E-mail: " + cli.getEmail());
			System.out.println("Telefone: " + cli.getTelefone());
			System.out.println("CPF: " + cli.getCnpj());
		}
	}
	
}
