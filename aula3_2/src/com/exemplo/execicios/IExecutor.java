package com.exemplo.execicios;

public interface IExecutor {

	/**
	 * adiciona um numero na memória
	 * 
	 * @param valor
	 * @return verdadeiro se conseguiu adicionar
	 */
	public boolean addValor(int valor);

	/**
	 * Retorna o maior número armazendo na memória.
	 * 
	 * @param valor
	 * @return  
	 */
	public int retornaMaior();

	/**
	 * Retorna o menor número armazendo na memória.
	 * 
	 * @param valor
	 * @return  
	 */
	public int retornaMenor();

	/**
	 * Retorna a média dos  números armazendo na memória.
	 * 
	 * @param valor
	 * @return  
	 */
	public float retornaMedia();

	/**
	 * Retorna um vetor com os dados.
	 * 
	 * @param valor
	 * @return  
	 */
	public int[] getDados();
}
