package br.edu.univas.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import br.edu.univas.exception.MyException;
import br.edu.univas.vo.Aluno;

public class StartApp {

	public static void main(String[] args) {
		try {
			criaAluno();
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel encontrar o arquivo!");
			e.printStackTrace();
		} catch (MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private static void criaAluno() throws FileNotFoundException, MyException {
		Aluno aluno = new Aluno();
		aluno.setNome("Rodrigo");
		
		//aluno = null;
		//imprimeNome(aluno);
		
		imprimeNome2(aluno);
	}
	
	private static void imprimeNome(Aluno aluno) throws FileNotFoundException {
			List<Aluno> alunos = new ArrayList<>();
			alunos.add(aluno);
			
			System.out.println(alunos.get(10).getNome());
			
			FileInputStream input = new FileInputStream("c:\rodrigo.txt");
	}
	
	private static void imprimeNome2(Aluno aluno) throws MyException {
		
		try {
			FileInputStream input = new FileInputStream("c:\rodrigo.txt");
		} catch (FileNotFoundException ex) {
			throw new MyException("Não achei o arquivo!", ex);
		}
		
	}
	
}
