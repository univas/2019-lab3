package br.edu.univas.main;

import java.util.Scanner;

public class Problem1134 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int a = 0;
		
		do {
			a = scanner.nextInt();
			if (a == 1) {
				count1++;
			}
			else if (a == 2) {
				count2++;
			} 
			else if (a == 3) {
				count3++;
			}
			
		} while (a != 4);
	
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + count1);
		System.out.println("Gasolina: " + count2);
		System.out.println("Diesel: " + count3);
	}
}
