package br.edu.univas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1179 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		List<String> output = new ArrayList<>();
		
		for (int i = 0; i < 15; i++) {
			int a = scanner.nextInt();
			if (a % 2 == 0) {
				even.add(a);
			} else {
				odd.add(a);
			}
			
			if(even.size() == 5) {
				formatOutput(output, even, "par");
				even.clear();
			}
			if (odd.size() == 5) {
				formatOutput(output, odd, "impar");
				odd.clear();
			}
		}
		
		if (!odd.isEmpty()) {
			formatOutput(output, odd, "impar");
		}
		if (!even.isEmpty()) {
			formatOutput(output, even, "par");
		}
		
		for (String out : output) {
			System.out.println(out);
		}
	}
	
	private static void formatOutput(List<String> outputList, List<Integer> numbers, String type) {
		for (int i = 0; i < numbers.size(); i++) {
			outputList.add(type + "[" + i + "] = " + numbers.get(i));
		}
	}
}
