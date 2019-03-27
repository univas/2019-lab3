package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Cachorro;
import br.edu.univas.vo.Gato;

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
			
			System.out.println("Digite a raça:");
			String raca = scanner.nextLine();
			
			if (option == 0) {
				animal = new Cachorro(raca);
			} else {
				animal = new Gato(raca);
			}
			
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

			if (c instanceof Gato) {
				Gato g = (Gato) c;
				g.miar();
			} else if (c instanceof Cachorro) {
				Cachorro cc = (Cachorro) c;
				cc.latir();
			}
			
		}
		
	}
	
}
