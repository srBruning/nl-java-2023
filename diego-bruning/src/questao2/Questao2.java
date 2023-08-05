package questao2;

import java.util.Scanner;

public class Questao2 {
	// 2) [1,5pt] Crie uma classe com método main que leia números inteiros e para
	// cada número lido escreva o respectivo quadrado, atéque seja lido um número
	// negativo (esse deve ser descartado).
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = 0;
			while (n >= 0) {
				System.out.println("Diigite um numero:");
				n = sc.nextInt();

				if (n >= 0) {
					int quadrado = n * n;
					System.out.println("quadrado de " + n + " = " + quadrado);
				}else {
					System.out.println("terminado");
				}

			}

		}

	}
}
