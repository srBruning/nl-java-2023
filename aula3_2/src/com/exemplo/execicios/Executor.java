package com.exemplo.execicios;

public class Executor implements IExecutor {
	private int dados[];
	private int tamanho;

	public Executor() {
		dados = new int[10];
	}
	
	/**
	 * adiciona um numero na memória
	 * 
	 * @param valor
	 * @return verdadeiro se conseguiu adicionar
	 */
	public boolean addValor(int valor) {

		if (tamanho >= dados.length)
			return false;

		dados[tamanho++] = valor;

		return true;
	}
	
	public int retornaMaior() {
		int maior = dados[0];

		for (int n : dados) {
			if (n > maior)
				maior = n;
		}
		
		return maior;
	}
	
	public int retornaMenor() {
		int menor = dados[0];

		for (int n : dados) {
			if (n < menor)
				menor = n;
		}
		return menor;
	}
	
	public float retornaMedia() {
		float media = 0;
		for (int n : dados) {
			media += n;
		}
		media /= dados.length;
		
		return media;
	}
	
	public int[] getDados() {
		
		int dadosAux[] = new int[tamanho];
		for(int i = 0 ; i< tamanho; i++) {
			dadosAux[i] = dados[i];
		}
		
		return dadosAux;
	}
}
