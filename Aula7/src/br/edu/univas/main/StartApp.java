package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de animais:");
		int qtdAnimais = scanner.nextInt();
		scanner.nextLine();
		
		ArrayList<Animal> animais = new ArrayList<>();
		for (int i = 0; i < qtdAnimais; i++) {
			Animal animal = null;
			
			System.out.println("Digite 0 para cachorro e 1 para gato:");
			int option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 0) {
				animal = new Cachorro();
			} else {
				animal = new Gato();
			}
			
			System.out.println("Digite a raça:");
			String raca = scanner.nextLine();
			animal.setRaca(raca);
			
			System.out.println("Digite a cor:");
			String cor = scanner.nextLine();
			animal.setCor(cor);
			
			System.out.println("Digite o peso:");
			float peso = scanner.nextFloat();
			animal.setPeso(peso);
			scanner.nextLine();
			animais.add(animal);
		}
		
		for (int i = 0; i < qtdAnimais; i++) {
			Animal c = animais.get(i);
			System.out.println(c);
		}
		
	}
	
}
