package com.exemplo.view;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

import com.exemplo.controle.IControle;

public class ConsoleView implements Closeable {

	private Scanner sc;
	private IControle ctrl;

	/**
	 * Construtor
	 * @param ctrl Controle que faz os processamentos. 
	 */
	public ConsoleView(IControle ctrl) {
		this.ctrl = ctrl;
		this.sc = new Scanner(System.in);
	}

	@Override
	public void close() {
		this.sc.close();
	}

	public void iniciar() {

		while (true) {
			mostrarMenu();
			int opc;
			try {
				// ler a opção
				opc = sc.nextInt();
			} catch (Exception e) {
				// se digitou caracteres invalidos vali ficar lendo
				System.err.println("Erro ao ler opção: " + e.getMessage());
				continue;
			}

			switch (opc) {
			case 1:
				lerDados();
				break;
			case 2:
				mostrarMedia();
				break;

			case 3:
				mostrarMaior();
				break;

			case 4:
				mostrarMenor();
				break;

			case 5:
				System.out.println("Encerrando...");
				return;
			default:
				System.out.println("Opção inválida!");

			}
		}
	}

	private void mostrarMenor() {

		int menor = this.ctrl.prcessarMenorValor();
		System.out.println("Menor numero: " + menor);
		System.out.println();

	}

	private void mostrarMaior() {

		int maior = this.ctrl.prcessarMaiorValor();
		System.out.println("Maior numero: " + maior);
		System.out.println();
	}

	private void mostrarMedia() {
		int media = this.ctrl.processarMedia();
		System.out.println("Media dos dados: " + media);
		System.out.println();
	}

	private void mostrarMenu() {
		System.out.println("----------------------");
		System.out.println("1 - ler dados ");
		System.out.println("2 - mostrar media");
		System.out.println("3 - mostrar maior");
		System.out.println("4 - mostrar menor");
		System.out.println("5 - encerrar");
		System.out.println("----------------------");
	}

	private void lerDados() {

		if (sc.hasNextLine()) {
			sc.nextLine();
		}

		System.out.println("Digite os numeros separados por virgula:\n");
		try {
			String linha = sc.nextLine();
			// divide a string pelo caracter ','
			String[] numeros = linha.split(",");
			for (String n : numeros) {
				if (n == null)
					continue;
				Integer valor = null;
				try {
					// remove espaços no inicio e no fim
					String strSemEspaco = n.trim();
					// transforma em numero
					valor = Integer.valueOf(strSemEspaco);
				} catch (Exception e) {
					System.err.println("Não foi possivel reconhecer: " + n);
				}

				if (valor != null) {
					boolean indAdicionaou = this.ctrl.adicionaNumero(valor);
					if (!indAdicionaou) {
						System.out.println("Não foi possivel adicionar o valor " + valor);
					}
				}
			}
		} catch (Exception e) {
			System.err.println("Erro ao ler dados: " + e.getMessage());
		}
	}

}
