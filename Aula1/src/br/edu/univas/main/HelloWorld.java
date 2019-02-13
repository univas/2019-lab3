package br.edu.univas.main;

public class HelloWorld {

	public static void main(String[] args) {
		String message = "Hello World!!!";
		System.out.println(message);
		
		System.out.println("\n\nWelcome to Univas!!!");
		
		int a = 10;
		System.out.println(a);
		
		byte b = 1;
		System.out.println(b);
		
		short c = 2;
		System.out.println(c);
		
		long d = 3;
		System.out.println(d);
		
		double e = 2.2;
		System.out.println(e);
		
		float f = 3.3f;
		System.out.println(f);
		
		char g = 'A';
		System.out.println(g);
		
		boolean h = true;
		System.out.println(h);
		
		int year = 2019 - 2000;
		System.out.println(year);
		
		int x = 10;
		
		int y = x * year;
		System.out.println(y);
		
		//comentario de linha
		Time time1 = new Time();
		time1.nome = "Athletico Paranaense";
		time1.anoFundacao = 1980;
		time1.estado = "Paraná";

		/*
		 * Comentario de varias linhas
		 */
		System.out.println(time1.nome);
		System.out.println(time1.estado);
		System.out.println(time1.anoFundacao);
		
		System.out.println(time1.nome + " - " +
				time1.anoFundacao + " - " +
				time1.estado);
	}
	
}
