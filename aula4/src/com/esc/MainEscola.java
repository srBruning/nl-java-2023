package com.esc;

import java.util.List;
import java.util.Scanner;

import com.esc.controle.EscolaControle;
import com.esc.dados.BaseDados;
import com.esc.model.Aluno;
import com.esc.model.Turma;

public class MainEscola {

	private Scanner sc;
	private EscolaControle controle;

	public MainEscola(EscolaControle controle) {
		this.controle = controle;
		this.sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		BaseDados db = new BaseDados("Eescola do Professor Raimundo");
		EscolaControle controle = new EscolaControle(db);
		MainEscola view = new MainEscola(controle);

		view.mostrar();
	}

	public void mostrar() {

		int opc = 0;
		while (opc != 5) {
			imprirMenu();

			opc = lerOpcao();
			
			switch (opc) {
			case 1:
				cadastrarTurma();
				break;
			case 2:
				listarTuramas();
				break;
			case 3:
				cadastarAluno();
				break;
			case 4:
				mostarMediasTurma();
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção invalida!");
			}
			
		}
	}

	private void mostarMediasTurma() {

		System.out.println("Entre como nome da turma:");
		liparEntrada();
		String nomeTurma = sc.nextLine();
		try {
			List<Aluno> lstAlunoss = controle.listarLunos(nomeTurma);
			for (Aluno aluno : lstAlunoss) {
				System.out.println(aluno.getNome() + ": " + aluno.media());
			}

			float media = controle.calculaMedia(nomeTurma);

			System.out.println("Media daturma: " + media);

		} catch (Exception e) {
			System.err.println("Não fopi possivel mostar as médias: " + e.getMessage());
		}

	}

	private void cadastarAluno() {
		liparEntrada();
		System.out.println("Entre com o nome da turma: ");
		String nomeTurma = sc.nextLine();
		System.out.println("Entre com o nome do auno: ");
		String nome = sc.nextLine();

		try {
			controle.cadastrarAluno(nomeTurma, nome);
			System.out.println("Cadastradado com sucesso");
		} catch (Exception e) {
			System.err.println("Não foi possivel cadastrar: " + e.getMessage());
		}

	}

	private void listarTuramas() {
		List<Turma> lstTurmas = controle.listarTurmas();
		for (Turma turma : lstTurmas) {
			System.out.println(turma);
			for(Aluno al : turma.getAlunos()) {
				System.err.println("-- "+al.getNome());				
			}
		}
	}

	private void cadastrarTurma() {

		System.out.println("Entre com o nome da turma:");
		liparEntrada();
		String nome = sc.nextLine();

		controle.cadastrarTurma(nome);

		System.out.println("Turma cadastrada com sucesso!");

	}

	private int lerOpcao() {
		try {
			return sc.nextInt();
		} catch (Exception e) {
		}
		return 0;
	}

	private void imprirMenu() {
		System.out.println("1 - cadastar turam");
		System.out.println("2 - listar turmas");
		System.out.println("3 - cadastar aluno");
		System.out.println("4 - medias da turma");
		System.out.println("5 - Sair");
	}

	private void liparEntrada() {
		if (sc.hasNextLine()) {
			sc.nextLine();
		}
	}

}
