package br.edu.univas.main;

import java.util.Scanner;

public class Problem1015 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		double x = Math.pow(x2 - x1, 2);
		double y = Math.pow(y2 - y1, 2);
		
		double result = Math.sqrt(x + y);
		System.out.println(String.format("%.4f", result));
	}
	
	
}
