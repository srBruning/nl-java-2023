package com.esc.dados;

import java.util.ArrayList;
import java.util.List;

import com.esc.model.Turma;

public interface IBase {

	public Turma buscarTurma(String nomeTurma);

	public List<Turma> listarTurmas();

	public void salvarTurma(Turma tr);
}
