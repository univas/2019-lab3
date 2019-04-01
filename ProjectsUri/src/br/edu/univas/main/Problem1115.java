package br.edu.univas.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1115 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		while (in.ready()) {
			String[] line = in.readLine().split(" ");
			int x = Integer.parseInt(line[0]);
			int y = Integer.parseInt(line[1]);
			
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else if (x == 0 || y == 0) {
				break;
			}
		}
	}

}
