package com.exemplo;

import com.exemplo.controle.ControleCollection;
import com.exemplo.controle.IControle;
import com.exemplo.view.ConsoleView;

public class App {

	public static void main(String[] args) {
		
		//IControle crlt = new ControleArray();
		IControle crlt = new ControleCollection();
		
		try(ConsoleView view = new ConsoleView(crlt)){
				view.iniciar();
		}
		
	}
}
