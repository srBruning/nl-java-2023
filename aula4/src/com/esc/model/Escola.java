package com.esc.model;

import java.util.ArrayList;
import java.util.List;

public class Escola {
	private String nome;
	private List<Turma> turmas;

	public Escola(String nome) {
		this.nome = nome;
		turmas = new ArrayList<Turma>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	
	public void criarTurma(Turma turma) {
		 turmas.add(turma);
	}
	
	
}
