package br.edu.univas.main;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.vo.Aluno;

public class StartApp {

	public static void main(String[] args) {
		try {
			criaAluno();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Não consegui acessar o aluno!");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Não existe aluno para imprimir o nome!");
			e.printStackTrace();
		}
	}
	
	private static void criaAluno()
			throws IndexOutOfBoundsException, NullPointerException {
		Aluno aluno = new Aluno();
		aluno.setNome("Rodrigo");
		
		//aluno = null;
		imprimeNome(aluno);
	}
	
	private static void imprimeNome(Aluno aluno) 
			throws IndexOutOfBoundsException, NullPointerException {
		try {
			List<Aluno> alunos = new ArrayList<>();
			alunos.add(aluno);
			
			System.out.println(alunos.get(10).getNome());
			
			
		} catch (IndexOutOfBoundsException ex) {
			throw ex;
			
		} catch (NullPointerException ex) {
			throw ex;
		}
		
	}
	
}
