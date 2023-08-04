package com.esc;

public class MainEscola {

	public static void main(String[] args) {

		Turma turma1 = new Turma("Turma java", 10);

		Aluno alPedro = new Aluno();
		alPedro.setMatricula(100);
		alPedro.setNome("Pedro Silva");
		alPedro.setNota1(4);
		alPedro.setNota2(6);
		alPedro.setNotaTrabalho(10);

		Aluno alAna = new Aluno();
		alAna.setMatricula(101);
		alAna.setNome("Ana Julha");
		alAna.setNota1(6);
		alAna.setNota2(7);
		alAna.setNotaTrabalho(7);

		Aluno alDiego = new Aluno();
		alDiego.setMatricula(102);
		alDiego.setNome("Diego Bru");
		alDiego.setNota1(3);
		alDiego.setNota2(4);
		alDiego.setNotaTrabalho(9);

		turma1.adicionaAluno(alPedro);
		turma1.adicionaAluno(alAna);
		turma1.adicionaAluno(alDiego);

		for(Aluno al : turma1.getAlunos()) {
			if(al!=null)
				System.out.println(String.format(" %d - %s - %.2f ", al.getMatricula(), 
					al.getNome(), al.media()));
		}
		
		System.out.println(String.format("Media da turma: %.2f%n ",turma1.media()));
		
	}

}
