package br.edu.univas.main;

public class HelloWorld {

	public static void main(String [] args) {
		int age = 19;
		int a = 10;
		
		if (age >= 18 && age <= 65) {
			System.out.println("Você é obrigado a votar!");
		
		} else if ((age == 16 || age == 17) && a == 10) {
			System.out.println("Você já pode votar!");
		
		} else {
			System.out.println("Você não pode votar!");
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Welcome " + i);
		}
		
		int count = 10;
		boolean stillRunning = true;
		while (stillRunning) {
			System.out.println("To aqui ainda!!!!");
			count++;
			if (count == 13) {
				stillRunning = false;
			}
		}
		
		do {
			System.out.println("Do - While");
			count++;
			
			if (count == 18) {
				break;
			}
			
		} while (count < 20);
		
		
		int month = 2;
		
		switch(month) {
		case 1 : System.out.println("Janeiro"); break;
		case 2 : System.out.println("Fevereiro"); break;
		case 3 : System.out.println("Março"); break;
		case 4 : System.out.println("Abril"); break;
		case 5 : System.out.println("Maio"); break;
		case 6 : System.out.println("Junho"); break;
		case 7 : System.out.println("Julho"); break;
		case 8 : System.out.println("Agosto"); break;
		case 9 : System.out.println("Setembro"); break;
		case 10 : System.out.println("Outubro"); break;
		case 11 : System.out.println("Novembro"); break;
		case 12 : System.out.println("Dezembro"); break;
		default : System.out.println("Mês inválido!");
		}
		
		int year = 2019;
		System.out.println(year);
		System.out.println(year++);
		System.out.println(++year);
		
		
		LOOP1 : for (int i = 0; i < 4; i++) {
				
			for (int j = 0; j < 3; j++) {
				System.out.println("J");
				if (j == 2) {
					break LOOP1;
				}
				System.out.println(i + " - " + j);
			}
			System.out.println("DENTRO DO I");
		}
		
		System.out.println("END!");
	}
	
}
