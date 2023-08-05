package com.exemplo.execicios;

import java.util.ArrayList;
import java.util.List;

public class ExecutorList implements IExecutor{
	
	private List<Integer> dados;
	
	public ExecutorList() {
		dados = new  ArrayList<Integer>();
	}
	
	@Override
	public boolean addValor(int valor) {
		dados.add(valor);
		return true;
	}

	@Override
	public int retornaMaior() {

		if (dados.isEmpty()) {
			return 0;
		}

		int maior = dados.get(0);
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

		int menor = dados.get(0);
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
			media +=n;			
		}
		
		media /=dados.size();
		
		return media;
	}

	@Override
	public int[] getDados() {

		int[] arr = new int[dados.size()];

		for (int i = 0; i < arr.length; i++) {
			if (dados.get(i) != null)
				arr[i] = dados.get(i);
		}

		return arr;
	}

}
