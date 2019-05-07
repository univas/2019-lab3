package br.edu.univas.main;

import java.util.Scanner;

public class Problem1172 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] values = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		for (int i = 0; i < 10; i++) {
			int a = scanner.nextInt();
			if (a > 0) {
				values[i] = a;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("X[" + i + "] = " + values[i]);
		}
	}
}
