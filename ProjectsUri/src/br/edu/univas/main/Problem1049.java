package br.edu.univas.main;

import java.util.Scanner;

public class Problem1049 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String classification1 = scanner.nextLine();
		String classification2 = scanner.nextLine();
		String classification3 = scanner.nextLine();
		
		if (classification1.equals("vertebrado")) {
			
			if (classification2.equals("ave")) {
			
				if (classification3.equals("carnivoro")) {
					System.out.println("aguia");
				} else { //onivoro
					System.out.println("pomba");
				}
				
			} else { //mamifero
				if (classification3.equals("onivoro")) {
					System.out.println("homem");
				} else { //herbivoro
					System.out.println("vaca");
				}
			}
 		
		} else { //invertebrado
			
			if (classification2.equals("inseto")) {
				if (classification3.equals("hematofago")) {
					System.out.println("pulga");
				} else { //herbivoro
					System.out.println("lagarta");
				}
				
			} else { //analideo
				if (classification3.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else { //onivoro
					System.out.println("minhoca");
				}
			}
		}
	}

}
