package com.esc.controle;

import java.util.List;

import com.esc.dados.IBase;
import com.esc.model.Aluno;
import com.esc.model.Turma;

public class EscolaControle {

	private IBase db;

	public EscolaControle(IBase db) {
		this.db = db;
	}

	public void cadastrarTurma(String nome) {
		
		Turma tr = new Turma(nome);
		db.salvarTurma(tr);
	}

	public void cadastrarAluno(String nomeTurma, String nome) throws Exception {

		Turma turma = db.buscarTurma(nomeTurma);
		if (turma == null) {
			throw new Exception("Não foi possível encontrar a turma!");
		}

		Aluno al = new Aluno();
		al.setNome(nome);
		turma.adicionaAluno(al);
		
		System.err.println("----");
		for(Aluno alu : turma.getAlunos()) {
			System.err.println(alu.getNome());
		}
			

	}

	public List<Turma> listarTurmas() {
		return db.listarTurmas();
	}

	public List<Aluno> listarLunos(String nomeTurma) throws Exception {
		
		Turma tr = db.buscarTurma(nomeTurma);
		if(tr==null) {
			throw new Exception("Não foi possível encontrar a turma!");
		}
		
		return tr.getAlunos();
	}

	public Turma buscarTurma(String nomeTurma) {
		return db.buscarTurma(nomeTurma);
	}
	

	public float calculaMedia(String nomeTurma) throws Exception{
		Turma tr = db.buscarTurma(nomeTurma);
		if(tr==null) {
			throw new Exception("Não foi possível encontrar a turma!");
		}
		
		if(tr.getAlunos().isEmpty()) {
			return 0;
		}
		
		return tr.media();
	}
	

}
