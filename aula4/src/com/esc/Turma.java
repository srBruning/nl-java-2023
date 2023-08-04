package com.esc;

public class Turma {
	
	private String nome;
	private Aluno[] alunos;
	
	private int qtdAlunos;
	
	public Turma(String nome, int qtdAlunos) {
		this.nome = nome;
		alunos = new Aluno[qtdAlunos];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Aluno[] getAlunos() {
		
		Aluno aux[] = new Aluno[qtdAlunos];
		for(int i = 0; i< qtdAlunos; i++) {
			aux[i] = alunos[i];
		}
		
		return aux;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	/**
	 * adiciona um novo aluno no ﬁnal
	 * @param aluno
	 */
	public void adicionaAluno(Aluno aluno) {
		
		if(qtdAlunos>= alunos.length) {
			return;
		}
		
		alunos[qtdAlunos++] = aluno;
	}
	
	/**
	 * calcula a média da turma com base na média dos alunos.
	 * @return
	 */
	public float media() {
		
		float media = 0;
		for(int i = 0; i< qtdAlunos; i++) {
			Aluno aluno = alunos[i];
			if(aluno==null)
				continue;
			
			float mdAluno = aluno.media();
			media += mdAluno;
		}
		
		media = media / qtdAlunos;
		
		return media;
	}
	
}
