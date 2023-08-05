package com.exemplo.controle;

public class ControleArray implements IControle {

	private int[] dados;
	private int tamanho;

	public ControleArray() {
		inicializar();

	}

	private void inicializar() {
		dados = new int[10];
		tamanho = 0;
	}

	@Override
	public boolean adicionaNumero(int numero) {
		if (tamanho >= dados.length) {
			return false;
		}
		dados[tamanho++] = numero;
		return true;
	}

	@Override
	public int processarMedia() {

		if (tamanho <= 0)
			return 0;

		int media = 0;
		for (int i = 0; i < tamanho; i++) {
			media += dados[i];
		}

		return media / tamanho;
	}

	@Override
	public int prcessarMaiorValor() {
		if (tamanho <= 0)
			return 0;

		int maior = dados[0];
		for (int i = 0; i < tamanho; i++) {
			if (dados[i] > maior) {
				maior = dados[i];
			}
		}

		return maior;
	}

	@Override
	public int prcessarMenorValor() {
		if (tamanho <= 0)
			return 0;

		int menor = dados[0];
		for (int i = 0; i < tamanho; i++) {
			if (dados[i] < menor) {
				menor = dados[i];
			}
		}

		return menor;
	}

}
