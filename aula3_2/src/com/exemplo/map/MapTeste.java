package com.exemplo.map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class MapTeste {

	public static void main(String[] args) {

		Conta c1 = new Conta(1000);
		Conta c2 = new Conta(1001);
		/*
		 * 1000 -> c1
		 * 1001 -> c2
		 */
		Map<Long, Conta> mapContas = new HashMap<Long, Conta>();
		mapContas.put(c1.getNumero(), c1);
		mapContas.put(c2.getNumero(), c2);
		
		mapContas.put(1000l, c2);
		mapContas.put(1000l, c1);

		mapContas.put(1002l, c1);
		mapContas.put(1003l, c2);

		System.out.println("----- Numeros das contas: ");
		for (Long numeroConta : mapContas.keySet()) {
			System.out.println(numeroConta);
		}

		System.out.println("----- Contas: ");
		for (Conta conta : mapContas.values()) {
			System.out.println(conta);
		}

		System.out.println("------");
		for (Entry<Long, Conta> entry : mapContas.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}

	}
}
