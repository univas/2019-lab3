package br.edu.univas.main;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StartApp2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite um número:");

			try {
				int x = scanner.nextInt();
				System.out.println("Número digitado: " + x);
				break;
			} catch (InputMismatchException ex) {
				scanner.nextLine();
				System.out.println("Digite uma opção correta");
			}
		}
		
	}
	
}
