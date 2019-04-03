package br.edu.univas.main;

import br.edu.univas.vo.Aluno;
import br.edu.univas.vo.Pessoa;
import br.edu.univas.vo.Pessoa2;
import br.edu.univas.vo.Professor;

public class StartApp {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa);
		System.out.println("-------------------------------");
		
		Aluno aluno = new Aluno();
		System.out.println(aluno);
		System.out.println("-------------------------------");
		
		Professor professor = new Professor();
		System.out.println(professor);
		System.out.println("-------------------------------");
		
		Pessoa xuxa = new Aluno();
		
		xuxa = new Professor();
		
		Pessoa a = new Pessoa();
		a.setNome("Rodrigo");
		
		Pessoa b = null;
		
		Pessoa c = null;
		
		System.out.println(a.getNome());		
		
		b = a;
		System.out.println(b.getNome());
		b.setNome("Pedro");
		
		System.out.println(a.getNome());
		
		c = new Pessoa();
		c.setNome("Gabriel");
		
		c = a;
		System.out.println(c.getNome());
		
		System.gc();
		
		
		Pessoa2 p2 = new Aluno();
		
		p2 = new Professor();
		
	}
	
	
}
