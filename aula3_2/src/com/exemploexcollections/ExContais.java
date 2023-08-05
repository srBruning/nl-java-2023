package com.exemploexcollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExContais {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();

		p1.setNome("Alex");
		p2.setNome("Alex");

		System.out.println(p1 == p1);
		System.out.println(p1 == p2);
		System.out.println(p1);
		System.out.println(p2);

		System.out.println("quals: "+p1.equals(p2));
		
		List<Pessoa> lst = new ArrayList<Pessoa>();
		lst.add(p1);

		System.out.println(lst.contains(p1));
		System.out.println(lst.contains(p2));
		
		
		
		
		Set<String> colecaoSet = new HashSet<String>();
		
		colecaoSet.add("Banana");
		colecaoSet.add("Uva");
		colecaoSet.add("Melancia");
		// dados duplicados não são inseridos no Set
		colecaoSet.add("Melancia");
		colecaoSet.add("Uva");
		System.out.println("Tamanho coleção Set: " +
		colecaoSet.size());
		int count = 0;
		for (String valor : colecaoSet) {
		System.out.println(++count + " -> " + valor);
		}
		
		
	}
}
