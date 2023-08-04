package com.esc.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String nome;
	private ArrayList<Aluno> alunos;

	public Turma(String nome) {
		this.nome = nome;
		alunos = new ArrayList<Aluno>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getAlunos() {

		ArrayList<Aluno> aux = new ArrayList<Aluno>();
		aux.addAll(alunos);

		return aux;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	/**
	 * adiciona um novo aluno no ﬁnal
	 * 
	 * @param aluno
	 */
	public void adicionaAluno(Aluno aluno) {

		alunos.add(aluno);
	}

	/**
	 * calcula a média da turma com base na média dos alunos.
	 * 
	 * @return
	 */
	public float media() {

		float media = 0;
		int qtd = 0;
		for (Aluno aluno : alunos) {
			if (aluno == null)
				continue;
			qtd++;
			float mdAluno = aluno.media();
			media += mdAluno;
		}

		media = media / qtd;

		return media;
	}

	public String toString() {
		return "Turma [nome: " + nome + "]";
	}
}