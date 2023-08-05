package questao5;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			//Lapiseira arLapiseira[] = new Lapiseira[10];
			ArrayList<Lapiseira> lstLapiseiras = new ArrayList<Lapiseira>();
			int opc = 0;
			
			while (true) {
				System.out.println("0 - sair, 1- cadastrar lapiseira ");
				opc = sc.nextInt();
				switch (opc) {
				case 0:
					
					for(Lapiseira lp : lstLapiseiras) {
						System.out.println(lp.getMarca()+" - "+lp.getCor()+" - "+lp.getGrafite());
					}
					
					return;
				case 1 :
					System.out.println("Entre com a marca da lapiseira");
					String marca = sc.next();
					System.out.println("Entre com a cor da lapiseira");
					String cor = sc.next();
					System.out.println("Entre com a o grafite da lapiseira");
					float grafite = sc.nextFloat();
					
					Lapiseira lp = new Lapiseira(marca, cor, grafite);
					lstLapiseiras.add(lp);
					
				}
			}

		}
	}
}
