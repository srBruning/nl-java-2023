package questao4;

import java.util.Scanner;

public class Questao4 {

	/*
	 * Crie uma classe que que leia as dimensões da base e da altura de um
	 * triângulo. Faça a leitura dos dados no método main e passe os valores como
	 * argumento para um método, esse método deverá calcular a área e imprimir o
	 * resultado. ( área = (base * altura)/2 )
	 */
	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Entre como comprimento da base do trinangulo: ");
			int base = sc.nextInt();

			System.out.println("Entre como comprimento da altura do trinangulo: ");
			int altura= sc.nextInt();
			
			mostraArea(base, altura);
			
		}
		
	}

	private static void mostraArea(int base, int altura) {
		// área = (base * altura)/2
		float area = (base * altura) / 2;
		
		System.out.println("Área do triangulo:  "+area);
	}

}
