package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		//aluno1.name = "Rodrigo";
		aluno1.setName("Rodrigo");
		aluno1.setCpf("081.123.829-22");
		aluno1.setEmail("rodrigolfsi@gmail.com");
		
		System.out.println(aluno1.getName());
		System.out.println(aluno1.getCpf());
		System.out.println(aluno1.getEmail());
		
		//não posso mudar o tipo da variavel!
		//aluno1 = 10;
		
		Aluno aluno2 = new Aluno();
		System.out.println(aluno2.getName());

		aluno2.setName("Maria");
		System.out.println(aluno2.getName());
		System.out.println(aluno2.getName().toUpperCase());
		System.out.println(aluno2.getName().toLowerCase());
		System.out.println(aluno2.getName());
		
		
	}
	
}
