package questao1;

import java.util.Scanner;

public class Exer1 {
	// [1,5pt] Crie uma classe com método main que leia um número inteiro N e
	// escreva os N primeiros números inteiros positivos.
	public static void main(String[] args) {
		// instancia o scanner
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Entre com um numero inteiro:");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				System.out.println(i);
			}
		}
	}
}
