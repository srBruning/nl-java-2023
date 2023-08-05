package com.exemplo.controle;

public interface IControle {

	/**
	 * Adiciona um numero namemoria.
	 * @param numero 
	 * @return retorna se foi possível adicionar o numero. 
	 */
	public boolean adicionaNumero(int numero);

	/**
	 * Retorna a média entre os números
	 */
	public int processarMedia();

	/**
	 * Retorna o maior número
	 */
	public int prcessarMaiorValor();

	/**
	 * Retorna o menor número
	 */
	public int prcessarMenorValor();

}
