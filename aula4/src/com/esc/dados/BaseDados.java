package com.esc.dados;

import java.util.ArrayList;
import java.util.List;

import com.esc.model.Escola;
import com.esc.model.Turma;

public class BaseDados implements IBase {
	private Escola escola;

	public BaseDados(String nome) {
		escola = new Escola(nome);
	}

	public Turma buscarTurma(String nomeTurma) {

		List<Turma> lstTurmas = escola.getTurmas();
		for (Turma turma : lstTurmas) {
			if (turma.getNome() != null && turma.getNome().equals(nomeTurma))
				return turma;
		}
		return null;
	}

	public List<Turma> listarTurmas() {

		if (escola.getTurmas() == null) {
			escola.setTurmas(new ArrayList<Turma>());
		}
		return escola.getTurmas();
	}

	public void salvarTurma(Turma tr) {
		escola.getTurmas().add(tr);
	}

}
