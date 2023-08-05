package com.exemplo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			Map<String, Integer> map = new HashMap<String, Integer>();

			for (int i = 0; i < 5; i++) {

				System.out.println("Entre com o nome do aluno " + i + ":");
				String nome = sc.nextLine();

				System.out.println("Entre com a bota do aluno " + i + ":");
				int nota = sc.nextInt();

				map.put(nome, nota);

				if (sc.hasNextLine()) {
					sc.nextLine();
				}
			}

			int media = 0;
			for (Integer nota : map.values()) {
				media += nota;
			}
			media /= map.size();

			System.out.println("Media da turma: " + media);
			
			for(Entry<String, Integer> ent : map.entrySet()) {
				if(ent.getValue() > media) {
					System.out.println(ent.getKey());
				}
			}
		}
	}
}
