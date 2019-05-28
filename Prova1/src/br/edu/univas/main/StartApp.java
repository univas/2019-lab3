package br.edu.univas.main;

import br.edu.univas.vo.Cliente;
import br.edu.univas.vo.Conta;
import br.edu.univas.vo.ContaCorrente;
import br.edu.univas.vo.Gerente;

public class StartApp {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1555);
		cliente1.setNome("João");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2);
		cliente2.setNome("Maria");
		
		Conta conta1 = new ContaCorrente(1234, cliente1, 35, 500);
		
		Conta conta2 = new ContaCorrente(4321, cliente2, 30, 250);
		
		gerente1.addConta(conta1);
		gerente1.addConta(conta2);
		
		System.out.println(":::Conta 1:::");
		System.out.println("Depositando R$ 100");
		conta1.depositar(100);
		System.out.println("Depositando R$ 150");
		conta1.depositar(150);		
		System.out.println("Saldo: " + conta1.getSaldo());
		
		System.out.println("Sacando R$ 77");
		if (conta1.sacar(77)) {
			System.out.println("Saque efetuado com sucesso!");
		}
		
		System.out.println("Sacando R$ 7770");
		if (conta1.sacar(7770)) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.println("Transferindo R$ 102 para Conta da Maria");
		if (conta1.transferenciaEletronica(conta2, 102)) {
			System.out.println("Transferência efetuada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.println("Saldo conta 1: " + conta1.getSaldo());
		System.out.println("Saldo conta 2: " + conta2.getSaldo());
		
	}
	
}
