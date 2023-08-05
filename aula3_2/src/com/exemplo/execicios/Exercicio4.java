package com.exemplo.execicios;

import java.util.Scanner;

/**
 * 4) Faça um programa em java que leia 10 números, então apresente um menu com
 * as possíveis operações e mostre o resultado quando escolhido, sendo elas: 1 -
 * maior número 2 - menor número 3 - media 4 - sair4) Faça um programa em java
 * que leia 10 números, então apresente um menu com as possíveis operações e
 * mostre o resultado quando escolhido, sendo elas: 1 - maior número 2 - menor
 * número 3 - media 4 - sair
 * 
 * @author diego
 *
 */
public class Exercicio4 {

	private static Scanner sc;
	private static IExecutor exc;

	public static void main(String[] args) {
//		exc = new Executor();
//		exc = new ExecutorList();
		exc = new ExecutorSet();
		try {
			sc = new Scanner(System.in);
			lerDados();
			escreveDados();
			mostrarMenu();

		} finally {
			if (sc != null)
				sc.close();
		}
	}

	private static void mostrarMenu() {

		int opc;
		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - maior número");
			System.out.println("2 - menor número");
			System.out.println("3 - média");
			System.out.println("4 - sair");

			try {
				opc = sc.nextInt();
			} catch (Exception e) {
				opc = 0;
				limparEntrada();
			}
			switch (opc) {
			case 1:
				mostrarMaiorNumero();
				break;
			case 2:
				mostrarMenorNumero();
				break;
			case 3:
				mostarMedia();
				break;
			case 4:
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (opc != 4);
	}

	private static void mostarMedia() {

		System.out.println(String.format("Média dos números é: %.2f%n", exc.retornaMedia()));
	}

	private static void mostrarMaiorNumero() {

		System.out.println("Maior número é : " + exc.retornaMaior());
	}

	private static void mostrarMenorNumero() {

		System.out.println("Menor número é : " + exc.retornaMenor());
	}

	private static void lerDados() {
		int count = 0;
		// TODO
		while (count < 10) {
			try {
				System.out.println("Digite o [" + (count + 1) + "] número inteiro:\n");
				if(exc.addValor(sc.nextInt()))
					count++;
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("Valor inválido!");
				limparEntrada();
			}
		}
	}

	private static void limparEntrada() {
		if (sc.hasNextLine())
			sc.nextLine();
	}

	private static void escreveDados() {
		System.out.println("-----------------");
		int[] dados = exc.getDados();
		for (int i : dados) {
			System.out.print(i + ", ");
		}
		System.out.println("\n-----------------");
	}
}
