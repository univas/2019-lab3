package br.edu.univas.main;

public class Aluno {

	private String name;
	
	private String email;
	
	private Disciplina disciplinas;
	
	public String printData() {
		String result = "Name: " + this.name +
						"\nE-mail: " + this.email + 
						"\nDisciplina: " + this.disciplinas.getName() +
						"\nProfessor: " + this.disciplinas.getTeacher();
		
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

	public Disciplina getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina disciplinas) {
		this.disciplinas = disciplinas;
	}
	
}
