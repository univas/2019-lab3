package br.edu.univas.main;

import java.util.ArrayList;

public class Aluno {

	private String name;
	
	private String email;
	
	private ArrayList<Disciplina> disciplinas;
	
	public String printData() {
		String result = "Name: " + this.name +
						"\nE-mail: " + this.email;
		
		for (int i = 0; i < this.disciplinas.size(); i++) {
			Disciplina disciplina = this.disciplinas.get(i);
			result += "\nDisciplina: " + disciplina.getName()
					+ "\nProfessor: " + disciplina.getTeacher();
		}
		
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
}
