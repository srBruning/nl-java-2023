package com.exemplo.controle;

import java.util.ArrayList;

public class ControleCollection implements IControle {

	private ArrayList<Integer> dados;

	public ControleCollection() {
		this.dados = new ArrayList<>();
	}

	@Override
	public boolean adicionaNumero(int numero) {
		dados.add(numero);
		return true;
	}

	@Override
	public int processarMedia() {
		int sum = 0;
		for (int i : dados) {
			sum += i;
		}
		return sum / dados.size();
	}

	@Override
	public int prcessarMaiorValor() {
		if (dados.size() > 0) {
			int result = dados.get(0);
			for (int i : dados) {
				if (i > result) {
					result = i;
				}
			}
			return result;
		}
		return -1;
	}

	@Override
	public int prcessarMenorValor() {
		if (dados.size() > 0) {
			int result = dados.get(0);
			for (int i : dados) {
				if (i < result) {
					result = i;
				}
			}
			return result;
		}
		return -1;
	}
}
