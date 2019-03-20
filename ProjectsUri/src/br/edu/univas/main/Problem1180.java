package br.edu.univas.main;

import java.util.Scanner;

public class Problem1180 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int arraySize = scanner.nextInt();
		scanner.nextLine();
		String line = scanner.nextLine();
		String[] values = line.split(" ");

		int minor = Integer.parseInt(values[0]);
		int index = 0;
		
		for (int i = 1; i < arraySize; i++) {
			int temp = Integer.parseInt(values[i]);
			if (temp < minor) {
				minor = temp;
				index = i;
			}
		}
		
		System.out.println("Menor valor: " + minor);
		System.out.println("Posicao: " + index);
	}

}
