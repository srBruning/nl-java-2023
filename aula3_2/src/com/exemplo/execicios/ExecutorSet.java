package com.exemplo.execicios;

import java.util.ArrayList;
import java.util.HashSet;

public class ExecutorSet implements IExecutor {

	private HashSet<Integer> dados;

	public ExecutorSet() {
		dados = new HashSet<Integer>();
	}

	@Override
	public boolean addValor(int valor) {
		
		if(dados.contains(valor))
			return false;
		
		dados.add(valor);
		return true;
	}

	@Override
	public int retornaMaior() {

		if (dados.isEmpty()) {
			return 0;
		}

		int maior = dados.iterator().next();

		for (Integer n : dados) {
			if (maior < n) {
				maior = n;
			}
		}
		return maior;
	}

	@Override
	public int retornaMenor() {
		if (dados.isEmpty()) {
			return 0;
		}

		int menor = dados.iterator().next();
		for (Integer n : dados) {
			if (menor > n) {
				menor = n;
			}
		}
		return menor;
	}

	@Override
	public float retornaMedia() {
		if (dados.isEmpty()) {
			return 0;
		}

		float media = 0;
		for (Integer n : dados) {
			media += n;
		}

		media /= dados.size();

		return media;
	}

	@Override
	public int[] getDados() {

		int[] arr = new int[dados.size()];
		int i = 0;

		for (Integer n : dados) {

			if (n != null)
				arr[i] = n;
			i++;
		}

		return arr;
	}

}
