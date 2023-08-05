package questao3;

import java.util.Scanner;

public class Main {
	// Crie uma classe que leia a nota final de um aluno e escreva se ele foi
	// aprovado ou não (considerar nota final maior ouigual a seis para aprovação) .
	// Se for informado uma nota menor que zero ou maior que dez informe que o valor
	// é inválido.
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Entre com a nota final do aluno:");
			float nota = sc.nextFloat();
			
			
			if(nota <0 || nota > 10) {
				System.out.println("Valor inválido");
			}else if(nota >= 6 ) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
			
		}

	}
}
