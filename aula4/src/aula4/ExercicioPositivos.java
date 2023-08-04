package aula4;

import java.util.Scanner;

/**
 * Faça um progrma em java que leia um nº inteiro e mostre uma mensagem indicando se
 * este número é par ou ímpar, e se é positivo ou negativo.
 * 
 * @author diego
 *
 */
public class ExercicioPositivos {

	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Digite um numero inteiro:");
			int numero = sc.nextInt();
			
			int resto  = numero % 2;
			
			if(resto == 0) {
				System.out.println("O número é par!");
			}else {
				System.out.println("O número é impar!");
			}
			
			if(numero >= 0 ) {
				System.out.println("Numero positivo!");
			}else {
				System.out.println("Número é negativo!");
			}
		}
		
	}
}
